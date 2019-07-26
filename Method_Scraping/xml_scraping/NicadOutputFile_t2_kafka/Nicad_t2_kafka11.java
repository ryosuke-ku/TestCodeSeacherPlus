// clone pairs:257:77%
// 69:kafka/clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java

public class Nicad_t2_kafka11
{
    public CreateDelegationTokenResult createDelegationToken(final CreateDelegationTokenOptions options) {
        final KafkaFutureImpl<DelegationToken> delegationTokenFuture = new KafkaFutureImpl<>();
        final long now = time.milliseconds();
        runnable.call(new Call("createDelegationToken", calcDeadlineMs(now, options.timeoutMs()),
            new LeastLoadedNodeProvider()) {

            @Override
            AbstractRequest.Builder createRequest(int timeoutMs) {
                return new CreateDelegationTokenRequest.Builder(options.renewers(), options.maxlifeTimeMs());
            }

            @Override
            void handleResponse(AbstractResponse abstractResponse) {
                CreateDelegationTokenResponse response = (CreateDelegationTokenResponse) abstractResponse;
                if (response.hasError()) {
                    delegationTokenFuture.completeExceptionally(response.error().exception());
                } else {
                    TokenInformation tokenInfo =  new TokenInformation(response.tokenId(), response.owner(),
                        options.renewers(), response.issueTimestamp(), response.maxTimestamp(), response.expiryTimestamp());
                    DelegationToken token = new DelegationToken(tokenInfo, response.hmacBytes());
                    delegationTokenFuture.complete(token);
                }
            }

            @Override
            void handleFailure(Throwable throwable) {
                delegationTokenFuture.completeExceptionally(throwable);
            }
        }, now);

        return new CreateDelegationTokenResult(delegationTokenFuture);
    }
}