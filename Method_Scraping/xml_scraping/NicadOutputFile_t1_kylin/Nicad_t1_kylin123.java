// clone pairs:716:83%
// 1179:kylin/server-base/src/main/java/org/apache/kylin/rest/controller/StreamingController.java

public class Nicad_t1_kylin123
{
    public List<KafkaConfig> getKafkaConfigs(
            @RequestParam(value = "kafkaConfigName", required = false) String kafkaConfigName,
            @RequestParam(value = "project", required = false) String project,
            @RequestParam(value = "limit", required = false) Integer limit,
            @RequestParam(value = "offset", required = false) Integer offset) {
        try {
            return kafkaConfigService.getKafkaConfigs(kafkaConfigName, project, limit, offset);
        } catch (IOException e) {
            logger.error("Failed to deal with the request:" + e.getLocalizedMessage(), e);
            throw new InternalErrorException("Failed to deal with the request: " + e.getLocalizedMessage(), e);
        }
    }
}