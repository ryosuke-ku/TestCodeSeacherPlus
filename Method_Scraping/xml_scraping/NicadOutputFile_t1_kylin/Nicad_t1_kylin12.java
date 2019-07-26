// clone pairs:110:87%
// 158:kylin/server-base/src/main/java/org/apache/kylin/rest/controller/StreamingController.java

public class Nicad_t1_kylin12
{
    private TableDesc deserializeTableDesc(StreamingRequest streamingRequest) {
        TableDesc desc = null;
        try {
            logger.debug("Saving TableDesc " + streamingRequest.getTableData());
            desc = JsonUtil.readValue(streamingRequest.getTableData(), TableDesc.class);
            updateRequest(streamingRequest, true, null);
        } catch (JsonParseException e) {
            logger.error("The TableDesc definition is invalid.", e);
            updateRequest(streamingRequest, false, e.getMessage());
        } catch (JsonMappingException e) {
            logger.error("The data TableDesc definition is invalid.", e);
            updateRequest(streamingRequest, false, e.getMessage());
        } catch (IOException e) {
            logger.error("Failed to deal with the request.", e);
            throw new InternalErrorException("Failed to deal with the request:" + e.getMessage(), e);
        }

        if (null != desc) {
            String[] dbTable = HadoopUtil.parseHiveTableName(desc.getName());
            desc.setName(dbTable[1]);
            desc.setDatabase(dbTable[0]);
            desc.getIdentity();
        }
        return desc;
    }
}