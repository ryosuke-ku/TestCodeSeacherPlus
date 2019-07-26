// clone pairs:222:77%
// 337:kylin/server-base/src/main/java/org/apache/kylin/rest/controller/StreamingController.java

public class Nicad_t1_kylin19
{
    private StreamingConfig deserializeSchemalDesc(StreamingRequest streamingRequest) {
        StreamingConfig desc = null;
        try {
            logger.debug("Saving StreamingConfig " + streamingRequest.getStreamingConfig());
            desc = JsonUtil.readValue(streamingRequest.getStreamingConfig(), StreamingConfig.class);
            updateRequest(streamingRequest, true, null);
        } catch (JsonParseException e) {
            logger.error("The StreamingConfig definition is invalid.", e);
            updateRequest(streamingRequest, false, e.getMessage());
        } catch (JsonMappingException e) {
            logger.error("The data StreamingConfig definition is invalid.", e);
            updateRequest(streamingRequest, false, e.getMessage());
        } catch (IOException e) {
            logger.error("Failed to deal with the request.", e);
            throw new InternalErrorException("Failed to deal with the request:" + e.getMessage(), e);
        }
        return desc;
    }
}