// clone pairs:1004:70%
// 1612:kylin/stream-core/src/main/java/org/apache/kylin/stream/core/storage/columnar/SegmentMemoryStore.java

public class Nicad_t1_kylin169
{
        public void endRead() {
            queryProfile.incScanRows(scanCnt);
            queryProfile.incFilterRows(filterCnt);
            if (queryProfile.isDetailProfileEnable()) {
                String stepName = getQueryStepName();
                StreamingQueryProfile.ProfileStep profileStep = queryProfile.finishStep(stepName);
                profileStep.stepInfo("scan_count", String.valueOf(scanCnt)).stepInfo("filter_count",
                        String.valueOf(filterCnt));
                logger.info("query-{}: segment-{} memory store scan finished, take {} ms", queryProfile.getQueryId(),
                        segmentName, profileStep.getDuration());
            }
        }
}