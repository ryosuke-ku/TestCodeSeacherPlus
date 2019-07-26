// clone pairs:224:77%
// 341:kylin/server-base/src/main/java/org/apache/kylin/rest/controller/StreamingController.java

public class Nicad_t1_kylin20
{
    private KafkaConfig deserializeKafkaSchemalDesc(StreamingRequest streamingRequest) {
        KafkaConfig desc = null;
        try {
            logger.debug("Saving KafkaConfig " + streamingRequest.getKafkaConfig());
            desc = JsonUtil.readValue(streamingRequest.getKafkaConfig(), KafkaConfig.class);
            updateRequest(streamingRequest, true, null);
        } catch (JsonParseException e) {
            logger.error("The KafkaConfig definition is invalid.", e);
            updateRequest(streamingRequest, false, e.getMessage());
        } catch (JsonMappingException e) {
            logger.error("The data KafkaConfig definition is invalid.", e);
            updateRequest(streamingRequest, false, e.getMessage());
        } catch (IOException e) {
            logger.error("Failed to deal with the request.", e);
            throw new InternalErrorException("Failed to deal with the request:" + e.getMessage(), e);
        }
        return desc;
    }
}