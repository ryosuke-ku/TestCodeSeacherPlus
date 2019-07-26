// clone pairs:45:70%
// 59:kylin/engine-mr/src/main/java/org/apache/kylin/engine/mr/steps/MergeCuboidJob.java

public class Nicad_t1_kylin5
{
    public int run(String[] args) throws Exception {
        Options options = new Options();

        try {
            options.addOption(OPTION_JOB_NAME);
            options.addOption(OPTION_CUBE_NAME);
            options.addOption(OPTION_SEGMENT_ID);
            options.addOption(OPTION_INPUT_PATH);
            options.addOption(OPTION_OUTPUT_PATH);
            parseOptions(options, args);

            String input = getOptionValue(OPTION_INPUT_PATH);
            String output = getOptionValue(OPTION_OUTPUT_PATH);
            String cubeName = getOptionValue(OPTION_CUBE_NAME).toUpperCase(Locale.ROOT);
            String segmentID = getOptionValue(OPTION_SEGMENT_ID);

            CubeManager cubeMgr = CubeManager.getInstance(KylinConfig.getInstanceFromEnv());
            CubeInstance cube = cubeMgr.getCube(cubeName);
            CubeSegment cubeSeg = cube.getSegmentById(segmentID);

            // start job
            String jobName = getOptionValue(OPTION_JOB_NAME);
            logger.info("Starting: " + jobName);
            job = Job.getInstance(getConf(), jobName);

            setJobClasspath(job, cube.getConfig());

            // add metadata to distributed cache
            Segments<CubeSegment> allSegs = cube.getMergingSegments(cubeSeg);
            allSegs.add(cubeSeg);
            attachSegmentsMetadataWithDict(allSegs, job.getConfiguration());

            // Mapper
            job.setMapperClass(MergeCuboidMapper.class);
            job.setMapOutputKeyClass(Text.class);
            job.setMapOutputValueClass(Text.class);

            // Reducer
            job.setReducerClass(CuboidReducer.class);
            job.setOutputKeyClass(Text.class);
            job.setOutputValueClass(Text.class);

            // set inputs
            IMROutput2.IMRMergeOutputFormat outputFormat = MRUtil.getBatchMergeOutputSide2(cubeSeg).getOutputFormat();
            outputFormat.configureJobInput(job, input);
            addInputDirs(input, job);

            // set output
            outputFormat.configureJobOutput(job, output, cubeSeg);

            // set job configuration
            job.getConfiguration().set(BatchConstants.CFG_CUBE_NAME, cubeName);
            job.getConfiguration().set(BatchConstants.CFG_CUBE_SEGMENT_ID, segmentID);

            return waitForCompletion(job);
        } finally {
            if (job != null)
                cleanupTempConfFile(job.getConfiguration());
        }
    }
}