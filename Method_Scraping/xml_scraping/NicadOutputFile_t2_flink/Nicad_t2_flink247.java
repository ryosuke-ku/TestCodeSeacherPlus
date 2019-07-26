// clone pairs:6871:100%
// 7028:flink/flink-runtime/src/main/java/org/apache/flink/runtime/rest/handler/job/metrics/AggregatingJobsMetricsHandler.java

public class Nicad_t2_flink247
{
	Collection<? extends MetricStore.ComponentMetricStore> getStores(MetricStore store, HandlerRequest<EmptyRequestBody, AggregatedJobMetricsParameters> request) {
		List<JobID> jobs = request.getQueryParameter(JobsFilterQueryParameter.class);
		if (jobs.isEmpty()) {
			return store.getJobs().values();
		} else {
			Collection<MetricStore.ComponentMetricStore> jobStores = new ArrayList<>(jobs.size());
			for (JobID job : jobs) {
				MetricStore.ComponentMetricStore jobMetricStore = store.getJobMetricStore(job.toString());
				if (jobMetricStore != null) {
					jobStores.add(jobMetricStore);
				}
			}
			return jobStores;
		}
	}
}