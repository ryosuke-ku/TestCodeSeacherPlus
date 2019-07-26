// clone pairs:911:72%
// 1454:kylin/server-base/src/main/java/org/apache/kylin/rest/controller/JobController.java

public class Nicad_t1_kylin155
{
    public JobInstance get(@PathVariable String jobId) {
        JobInstance jobInstance = null;
        try {
            jobInstance = jobService.getJobInstance(jobId);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            throw new InternalErrorException(e);
        }

        return jobInstance;
    }
}