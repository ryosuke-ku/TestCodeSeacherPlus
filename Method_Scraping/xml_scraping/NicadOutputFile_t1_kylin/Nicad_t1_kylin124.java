// clone pairs:717:83%
// 1181:kylin/server-base/src/main/java/org/apache/kylin/rest/controller/StreamingController.java

public class Nicad_t1_kylin124
{
    public List<StreamingConfig> getStreamings(@RequestParam(value = "table", required = false) String table,
            @RequestParam(value = "project", required = false) String project,
            @RequestParam(value = "limit", required = false) Integer limit,
            @RequestParam(value = "offset", required = false) Integer offset) {
        try {
            return streamingService.getStreamingConfigs(table, project, limit, offset);
        } catch (IOException e) {

            logger.error("Failed to deal with the request:" + e.getLocalizedMessage(), e);
            throw new InternalErrorException("Failed to deal with the request: " + e.getLocalizedMessage(), e);
        }
    }
}