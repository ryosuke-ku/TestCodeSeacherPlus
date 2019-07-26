// clone pairs:461:71%
// 181:kafka/clients/src/main/java/org/apache/kafka/clients/producer/internals/TransactionManager.java

public class Nicad_t2_kafka_71_759
{
        public void handleResponse(AbstractResponse response) {
            InitProducerIdResponse initProducerIdResponse = (InitProducerIdResponse) response;
            Errors error = initProducerIdResponse.error();

            if (error == Errors.NONE) {
                ProducerIdAndEpoch producerIdAndEpoch = new ProducerIdAndEpoch(initProducerIdResponse.data.producerId(),
                        initProducerIdResponse.data.producerEpoch());
                setProducerIdAndEpoch(producerIdAndEpoch);
                transitionTo(State.READY);
                lastError = null;
                result.done();
            } else if (error == Errors.NOT_COORDINATOR || error == Errors.COORDINATOR_NOT_AVAILABLE) {
                lookupCoordinator(FindCoordinatorRequest.CoordinatorType.TRANSACTION, transactionalId);
                reenqueue();
            } else if (error == Errors.COORDINATOR_LOAD_IN_PROGRESS || error == Errors.CONCURRENT_TRANSACTIONS) {
                reenqueue();
            } else if (error == Errors.TRANSACTIONAL_ID_AUTHORIZATION_FAILED) {
                fatalError(error.exception());
            } else {
                fatalError(new KafkaException("Unexpected error in InitProducerIdResponse; " + error.message()));
            }
        }
}