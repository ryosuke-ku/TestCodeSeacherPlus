// clone pairs:468:70%
// 183:kafka/streams/src/main/java/org/apache/kafka/streams/kstream/internals/SessionWindowedKStreamImpl.java

public class Nicad_t2_kafka25
{
    private <VR> StoreBuilder<SessionStore<K, VR>> materialize(final MaterializedInternal<K, VR, SessionStore<Bytes, byte[]>> materialized) {
        SessionBytesStoreSupplier supplier = (SessionBytesStoreSupplier) materialized.storeSupplier();
        if (supplier == null) {
            // NOTE: in the future, when we remove Windows#maintainMs(), we should set the default retention
            // to be (windows.inactivityGap() + windows.grace()). This will yield the same default behavior.
            final long retentionPeriod = materialized.retention() != null ? materialized.retention().toMillis() : windows.maintainMs();

            if ((windows.inactivityGap() + windows.gracePeriodMs()) > retentionPeriod) {
                throw new IllegalArgumentException("The retention period of the session store "
                                                       + materialized.storeName()
                                                       + " must be no smaller than the session inactivity gap plus the"
                                                       + " grace period."
                                                       + " Got gap=[" + windows.inactivityGap() + "],"
                                                       + " grace=[" + windows.gracePeriodMs() + "],"
                                                       + " retention=[" + retentionPeriod + "]");
            }
            supplier = Stores.persistentSessionStore(
                materialized.storeName(),
                Duration.ofMillis(retentionPeriod)
            );
        }
        final StoreBuilder<SessionStore<K, VR>> builder = Stores.sessionStoreBuilder(
            supplier,
            materialized.keySerde(),
            materialized.valueSerde()
        );

        if (materialized.loggingEnabled()) {
            builder.withLoggingEnabled(materialized.logConfig());
        } else {
            builder.withLoggingDisabled();
        }

        if (materialized.cachingEnabled()) {
            builder.withCachingEnabled();
        }
        return builder;
    }
}