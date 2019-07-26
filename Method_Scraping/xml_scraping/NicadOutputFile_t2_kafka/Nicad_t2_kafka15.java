// clone pairs:305:84%
// 95:kafka/clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java

public class Nicad_t2_kafka15
{
    public RenewDelegationTokenResult renewDelegationToken(final byte[] hmac, final RenewDelegationTokenOptions options) {
        final KafkaFutureImpl<Long>  expiryTimeFuture = new KafkaFutureImpl<>();
        final long now = time.milliseconds();
        runnable.call(new Call("renewDelegationToken", calcDeadlineMs(now, options.timeoutMs()),
            new LeastLoadedNodeProvider()) {

            @Override
            AbstractRequest.Builder createRequest(int timeoutMs) {
                return new RenewDelegationTokenRequest.Builder(hmac, options.renewTimePeriodMs());
            }

            @Override
            void handleResponse(AbstractResponse abstractResponse) {
                RenewDelegationTokenResponse response = (RenewDelegationTokenResponse) abstractResponse;
                if (response.hasError()) {
                    expiryTimeFuture.completeExceptionally(response.error().exception());
                } else {
                    expiryTimeFuture.complete(response.expiryTimestamp());
                }
            }

            @Override
            void handleFailure(Throwable throwable) {
                expiryTimeFuture.completeExceptionally(throwable);
            }
        }, now);

        return new RenewDelegationTokenResult(expiryTimeFuture);
    }
}