// clone pairs:76:72%
// 100:kylin/engine-mr/src/main/java/org/apache/kylin/engine/mr/common/MapReduceExecutable.java

public class Nicad_t1_kylin10
{
    protected void onExecuteStart(ExecutableContext executableContext) {
        final Output output = getOutput();
        if (output.getExtra().containsKey(START_TIME)) {
            final String mrJobId = output.getExtra().get(ExecutableConstants.MR_JOB_ID);
            if (mrJobId == null) {
                getManager().updateJobOutput(getId(), ExecutableState.RUNNING, null, null);
                return;
            }
            try {
                Configuration conf = new Configuration(HadoopUtil.getCurrentConfiguration());
                overwriteJobConf(conf, executableContext.getConfig(), getMapReduceParams().trim().split("\\s+"));
                Job job = new Cluster(conf).getJob(JobID.forName(mrJobId));
                if (job == null || job.getJobState() == JobStatus.State.FAILED) {
                    //remove previous mr job info
                    super.onExecuteStart(executableContext);
                } else {
                    getManager().updateJobOutput(getId(), ExecutableState.RUNNING, null, null);
                }
            } catch (IOException | ParseException e) {
                logger.warn("error get hadoop status");
                super.onExecuteStart(executableContext);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                logger.warn("error get hadoop status");
                super.onExecuteStart(executableContext);
            }
        } else {
            super.onExecuteStart(executableContext);
        }
    }
}