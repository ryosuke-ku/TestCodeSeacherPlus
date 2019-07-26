// clone pairs:6:77%
// 3:kafka/clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java

public class Nicad_t2_kafka_76_801
{
    public CreateTopicsResult createTopics(final Collection<NewTopic> newTopics,
                                           final CreateTopicsOptions options) {
        final Map<String, KafkaFutureImpl<Void>> topicFutures = new HashMap<>(newTopics.size());
        final CreatableTopicCollection topics = new CreatableTopicCollection();
        for (NewTopic newTopic : newTopics) {
            if (topicNameIsUnrepresentable(newTopic.name())) {
                KafkaFutureImpl<Void> future = new KafkaFutureImpl<>();
                future.completeExceptionally(new InvalidTopicException("The given topic name '" +
                    newTopic.name() + "' cannot be represented in a request."));
                topicFutures.put(newTopic.name(), future);
            } else if (!topicFutures.containsKey(newTopic.name())) {
                topicFutures.put(newTopic.name(), new KafkaFutureImpl<>());
                topics.add(newTopic.convertToCreatableTopic());
            }
        }
        final long now = time.milliseconds();
        Call call = new Call("createTopics", calcDeadlineMs(now, options.timeoutMs()),
            new ControllerNodeProvider()) {

            @Override
            public AbstractRequest.Builder createRequest(int timeoutMs) {
                return new CreateTopicsRequest.Builder(
                    new CreateTopicsRequestData().
                        setTopics(topics).
                        setTimeoutMs(timeoutMs).
                        setValidateOnly(options.shouldValidateOnly()));
            }

            @Override
            public void handleResponse(AbstractResponse abstractResponse) {
                CreateTopicsResponse response = (CreateTopicsResponse) abstractResponse;
                // Check for controller change
                for (Errors error : response.errorCounts().keySet()) {
                    if (error == Errors.NOT_CONTROLLER) {
                        metadataManager.clearController();
                        metadataManager.requestUpdate();
                        throw error.exception();
                    }
                }
                // Handle server responses for particular topics.
                for (CreatableTopicResult result : response.data().topics()) {
                    KafkaFutureImpl<Void> future = topicFutures.get(result.name());
                    if (future == null) {
                        log.warn("Server response mentioned unknown topic {}", result.name());
                    } else {
                        ApiError error = new ApiError(
                            Errors.forCode(result.errorCode()), result.errorMessage());
                        ApiException exception = error.exception();
                        if (exception != null) {
                            future.completeExceptionally(exception);
                        } else {
                            future.complete(null);
                        }
                    }
                }
                // The server should send back a response for every topic. But do a sanity check anyway.
                for (Map.Entry<String, KafkaFutureImpl<Void>> entry : topicFutures.entrySet()) {
                    KafkaFutureImpl<Void> future = entry.getValue();
                    if (!future.isDone()) {
                        future.completeExceptionally(new ApiException("The server response did not " +
                            "contain a reference to node " + entry.getKey()));
                    }
                }
            }

            @Override
            void handleFailure(Throwable throwable) {
                completeAllExceptionally(topicFutures.values(), throwable);
            }
        };
        if (!topics.isEmpty()) {
            runnable.call(call, now);
        }
        return new CreateTopicsResult(new HashMap<>(topicFutures));
    }
}