// clone pairs:318:100%
// 478:kylin/core-dictionary/src/main/java/org/apache/kylin/dict/lookup/cache/RocksDBLookupTableCache.java

public class Nicad_t1_kylin34
{
    public static RocksDBLookupTableCache getInstance(KylinConfig config) {
        RocksDBLookupTableCache r = SERVICE_CACHE.get(config);
        if (r == null) {
            synchronized (RocksDBLookupTableCache.class) {
                r = SERVICE_CACHE.get(config);
                if (r == null) {
                    r = new RocksDBLookupTableCache(config);
                    SERVICE_CACHE.put(config, r);
                    if (SERVICE_CACHE.size() > 1) {
                        logger.warn("More than one singleton exist");
                    }
                }
            }
        }
        return r;
    }
}