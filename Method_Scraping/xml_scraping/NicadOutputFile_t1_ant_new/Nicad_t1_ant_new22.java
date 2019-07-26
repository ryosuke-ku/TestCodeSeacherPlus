// clone pairs:95:100%
// 164:ant/src/main/org/apache/tools/ant/taskdefs/optional/image/Image.java

public class Nicad_t1_ant_new22
{
    public void execute() throws BuildException {

        validateAttributes();

        try {
            File dest = (destDir != null) ? destDir : srcDir;

            int writeCount = 0;

            // build mapper
            final FileNameMapper mapper = mapperElement == null
                ? new IdentityMapper() : mapperElement.getImplementation();

            // deal with specified srcDir
            if (srcDir != null) {
                writeCount += processDir(srcDir,
                    super.getDirectoryScanner(srcDir).getIncludedFiles(), dest,
                    mapper);
            }
            // deal with the filesets
            for (FileSet fs : filesets) {
                writeCount += processDir(fs.getDir(),
                    fs.getDirectoryScanner().getIncludedFiles(),
                    dest, mapper);
            }

            if (writeCount > 0) {
                log("Processed " + writeCount + (writeCount == 1 ? " image." : " images."));
            }

        } catch (Exception err) {
            log(StringUtils.getStackTrace(err), Project.MSG_ERR);
            throw new BuildException(err.getMessage());
        }
    }
}