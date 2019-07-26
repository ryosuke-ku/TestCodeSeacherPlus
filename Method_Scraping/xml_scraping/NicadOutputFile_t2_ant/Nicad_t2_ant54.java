// clone pairs:688:90%
// 970:ant/src/main/org/apache/tools/ant/ProjectHelperRepository.java

public class Nicad_t2_ant54
{
    public ProjectHelper getProjectHelperForBuildFile(Resource buildFile) throws BuildException {
        ProjectHelper ph = StreamUtils.iteratorAsStream(getHelpers())
                .filter(helper -> helper.canParseBuildFile(buildFile))
                .findFirst().orElse(null);

        if (ph == null) {
            throw new BuildException("BUG: at least the ProjectHelper2 should "
                    + "have supported the file " + buildFile);
        }
        if (DEBUG) {
            System.out.println("ProjectHelper " + ph.getClass().getName()
                    + " selected for the build file " + buildFile);
        }
        return ph;
    }
}