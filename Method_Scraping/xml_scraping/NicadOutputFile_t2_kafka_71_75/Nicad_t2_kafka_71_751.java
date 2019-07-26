// clone pairs:27:75%
// 5:kafka/clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java

public class Nicad_t2_kafka_71_751
{
    public CreateAclsResult createAcls(Collection<AclBinding> acls, CreateAclsOptions options) {
        final long now = time.milliseconds();
        final Map<AclBinding, KafkaFutureImpl<Void>> futures = new HashMap<>();
        final List<AclCreation> aclCreations = new ArrayList<>();
        for (AclBinding acl : acls) {
            if (futures.get(acl) == null) {
                KafkaFutureImpl<Void> future = new KafkaFutureImpl<>();
                futures.put(acl, future);
                String indefinite = acl.toFilter().findIndefiniteField();
                if (indefinite == null) {
                    aclCreations.add(new AclCreation(acl));
                } else {
                    future.completeExceptionally(new InvalidRequestException("Invalid ACL creation: " +
                        indefinite));
                }
            }
        }
        runnable.call(new Call("createAcls", calcDeadlineMs(now, options.timeoutMs()),
            new LeastLoadedNodeProvider()) {

            @Override
            AbstractRequest.Builder createRequest(int timeoutMs) {
                return new CreateAclsRequest.Builder(aclCreations);
            }

            @Override
            void handleResponse(AbstractResponse abstractResponse) {
                CreateAclsResponse response = (CreateAclsResponse) abstractResponse;
                List<AclCreationResponse> responses = response.aclCreationResponses();
                Iterator<AclCreationResponse> iter = responses.iterator();
                for (AclCreation aclCreation : aclCreations) {
                    KafkaFutureImpl<Void> future = futures.get(aclCreation.acl());
                    if (!iter.hasNext()) {
                        future.completeExceptionally(new UnknownServerException(
                            "The broker reported no creation result for the given ACL."));
                    } else {
                        AclCreationResponse creation = iter.next();
                        if (creation.error().isFailure()) {
                            future.completeExceptionally(creation.error().exception());
                        } else {
                            future.complete(null);
                        }
                    }
                }
            }

            @Override
            void handleFailure(Throwable throwable) {
                completeAllExceptionally(futures.values(), throwable);
            }
        }, now);
        return new CreateAclsResult(new HashMap<>(futures));
    }
}