// clone pairs:1073:91%
// 530:kafka/clients/src/main/java/org/apache/kafka/clients/admin/KafkaAdminClient.java

public class Nicad_t2_kafka_91_9512
{
    public AlterConfigsResult alterConfigs(Map<ConfigResource, Config> configs, final AlterConfigsOptions options) {
        final Map<ConfigResource, KafkaFutureImpl<Void>> allFutures = new HashMap<>();
        // We must make a separate AlterConfigs request for every BROKER resource we want to alter
        // and send the request to that specific broker. Other resources are grouped together into
        // a single request that may be sent to any broker.
        final Collection<ConfigResource> unifiedRequestResources = new ArrayList<>();

        for (ConfigResource resource : configs.keySet()) {
            if (resource.type() == ConfigResource.Type.BROKER && !resource.isDefault()) {
                NodeProvider nodeProvider = new ConstantNodeIdProvider(Integer.parseInt(resource.name()));
                allFutures.putAll(alterConfigs(configs, options, Collections.singleton(resource), nodeProvider));
            } else
                unifiedRequestResources.add(resource);
        }
        if (!unifiedRequestResources.isEmpty())
          allFutures.putAll(alterConfigs(configs, options, unifiedRequestResources, new LeastLoadedNodeProvider()));
        return new AlterConfigsResult(new HashMap<>(allFutures));
    }
}