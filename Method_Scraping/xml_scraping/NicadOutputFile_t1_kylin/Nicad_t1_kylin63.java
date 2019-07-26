// clone pairs:498:84%
// 770:kylin/core-metadata/src/main/java/org/apache/kylin/metadata/streaming/StreamingManager.java

public class Nicad_t1_kylin63
{
    private StreamingManager(KylinConfig config) throws IOException {
        this.config = config;
        this.streamingMap = new CaseInsensitiveStringCache<StreamingConfig>(config, "streaming");
        this.crud = new CachedCrudAssist<StreamingConfig>(getStore(), ResourceStore.STREAMING_RESOURCE_ROOT,
                StreamingConfig.class, streamingMap) {
            @Override
            protected StreamingConfig initEntityAfterReload(StreamingConfig t, String resourceName) {
                return t; // noop
            }
        };

        // touch lower level metadata before registering my listener
        crud.reloadAll();
        Broadcaster.getInstance(config).registerListener(new StreamingSyncListener(), "streaming");
    }
}