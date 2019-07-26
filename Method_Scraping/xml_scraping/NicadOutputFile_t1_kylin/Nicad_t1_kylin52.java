// clone pairs:449:85%
// 682:kylin/engine-mr/src/main/java/org/apache/kylin/engine/mr/common/HadoopCmdOutput.java

public class Nicad_t1_kylin52
{
    public Map<String, String> getInfo() {
        if (job != null) {
            Map<String, String> status = new HashMap<String, String>();
            if (null != job.getJobID()) {
                status.put(ExecutableConstants.MR_JOB_ID, job.getJobID().toString());
            }
            if (null != job.getTrackingURL()) {
                status.put(ExecutableConstants.YARN_APP_URL, job.getTrackingURL().toString());
            }
            return status;
        } else {
            return Collections.emptyMap();
        }
    }
}