// clone pairs:48:76%
// 65:kylin/core-job/src/main/java/org/apache/kylin/job/impl/threadpool/DefaultScheduler.java

public class Nicad_t1_kylin6
{
    public synchronized void init(JobEngineConfig jobEngineConfig, JobLock lock) throws SchedulerException {
        jobLock = lock;

        String serverMode = jobEngineConfig.getConfig().getServerMode();
        if (!("job".equals(serverMode.toLowerCase(Locale.ROOT)) || "all".equals(serverMode.toLowerCase(Locale.ROOT)))) {
            logger.info("server mode: " + serverMode + ", no need to run job scheduler");
            return;
        }
        logger.info("Initializing Job Engine ....");

        if (!initialized) {
            initialized = true;
        } else {
            return;
        }

        this.jobEngineConfig = jobEngineConfig;

        if (jobLock.lockJobEngine() == false) {
            throw new IllegalStateException("Cannot start job scheduler due to lack of job lock");
        }

        //load all executable, set them to a consistent status
        fetcherPool = Executors.newScheduledThreadPool(1);
        int corePoolSize = jobEngineConfig.getMaxConcurrentJobLimit();
        jobPool = new ThreadPoolExecutor(corePoolSize, corePoolSize, Long.MAX_VALUE, TimeUnit.DAYS,
                new SynchronousQueue<Runnable>());
        context = new DefaultContext(Maps.<String, Executable> newConcurrentMap(), jobEngineConfig.getConfig());

        logger.info("Starting resume all running jobs.");
        ExecutableManager executableManager = getExecutableManager();
        executableManager.resumeAllRunningJobs();
        logger.info("Finishing resume all running jobs.");

        int pollSecond = jobEngineConfig.getPollIntervalSecond();

        logger.info("Fetching jobs every {} seconds", pollSecond);
        JobExecutor jobExecutor = new JobExecutor() {
            @Override
            public void execute(AbstractExecutable executable) {
                jobPool.execute(new JobRunner(executable));
            }
        };
        fetcher = jobEngineConfig.getJobPriorityConsidered()
                ? new PriorityFetcherRunner(jobEngineConfig, context, jobExecutor)
                : new DefaultFetcherRunner(jobEngineConfig, context, jobExecutor);
        logger.info("Creating fetcher pool instance:" + System.identityHashCode(fetcher));
        fetcherPool.scheduleAtFixedRate(fetcher, pollSecond / 10, pollSecond, TimeUnit.SECONDS);
        hasStarted = true;
    }
}