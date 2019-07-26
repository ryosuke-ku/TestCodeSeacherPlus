// clone pairs:497:84%
// 767:kylin/core-metadata/src/main/java/org/apache/kylin/metadata/TempStatementManager.java

public class Nicad_t1_kylin62
{
    private TempStatementManager(KylinConfig cfg) throws IOException {
        this.config = cfg;
        this.tmpStatMap = new CaseInsensitiveStringCache<>(config, "temp_statement");
        this.crud = new CachedCrudAssist<TempStatementEntity>(getStore(), ResourceStore.TEMP_STATMENT_RESOURCE_ROOT,
                TempStatementEntity.class, tmpStatMap) {
            @Override
            protected TempStatementEntity initEntityAfterReload(TempStatementEntity t, String resourceName) {
                return t; // noop
            }
        };

        crud.reloadAll();

        // touch lower level metadata before registering my listener
        Broadcaster.getInstance(config).registerListener(new TempStatementSyncListener(), "temp_statement");
    }
}