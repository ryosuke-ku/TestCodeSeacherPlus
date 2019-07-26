// clone pairs:946:84%
// 409:kafka/clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java

public class Nicad_t2_kafka73
{
            public void handleResponse(AbstractResponse abstractResponse) {
                AlterConfigsResponse response = (AlterConfigsResponse) abstractResponse;
                for (Map.Entry<ConfigResource, KafkaFutureImpl<Void>> entry : futures.entrySet()) {
                    KafkaFutureImpl<Void> future = entry.getValue();
                    ApiException exception = response.errors().get(entry.getKey()).exception();
                    if (exception != null) {
                        future.completeExceptionally(exception);
                    } else {
                        future.complete(null);
                    }
                }
            }
}