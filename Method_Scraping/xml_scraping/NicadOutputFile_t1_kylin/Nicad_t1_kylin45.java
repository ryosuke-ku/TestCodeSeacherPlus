// clone pairs:379:73%
// 557:kylin/core-storage/src/main/java/org/apache/kylin/storage/hybrid/HybridManager.java

public class Nicad_t1_kylin45
{
    private HybridManager(KylinConfig cfg) throws IOException {
        logger.info("Initializing HybridManager with config " + cfg);
        this.config = cfg;
        this.hybridMap = new CaseInsensitiveStringCache<HybridInstance>(config, "hybrid");
        this.crud = new CachedCrudAssist<HybridInstance>(getStore(), ResourceStore.HYBRID_RESOURCE_ROOT,
                HybridInstance.class, hybridMap) {
            @Override
            protected HybridInstance initEntityAfterReload(HybridInstance hybridInstance, String resourceName) {
                hybridInstance.setConfig(config);
                return hybridInstance; // noop
            }
        };

        // touch lower level metadata before registering my listener
        crud.reloadAll();
        Broadcaster.getInstance(config).registerListener(new HybridSyncListener(), "hybrid", "cube");
    }
}