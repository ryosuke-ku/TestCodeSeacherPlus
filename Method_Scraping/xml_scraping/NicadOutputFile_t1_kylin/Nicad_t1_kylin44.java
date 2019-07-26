// clone pairs:362:73%
// 532:kylin/stream-core/src/main/java/org/apache/kylin/stream/core/storage/columnar/FragmentCuboidReader.java

public class Nicad_t1_kylin44
{
            public RawRecord next() {
                for (int i = 0; i < dimensionDataReaders.length; i++) {
                    oneRawRecord.setDimension(i, dimValItr[i].next());
                }
                for (int i = 0; i < metricDataReaders.length; i++) {
                    oneRawRecord.setMetric(i, metricsValItr[i].next());
                }
                readRowCount++;
                return oneRawRecord;
            }
}