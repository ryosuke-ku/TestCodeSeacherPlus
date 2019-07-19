// clone pairs:499:83%
// 804:ant/src/main/org/apache/tools/ant/types/AbstractFileSet.java

public class Nicad_ant75
{
    protected AbstractFileSet(AbstractFileSet fileset) {
        this.dir = fileset.dir;
        this.defaultPatterns = fileset.defaultPatterns;
        this.additionalPatterns = fileset.additionalPatterns;
        this.selectors = fileset.selectors;
        this.useDefaultExcludes = fileset.useDefaultExcludes;
        this.caseSensitive = fileset.caseSensitive;
        this.followSymlinks = fileset.followSymlinks;
        this.errorOnMissingDir = fileset.errorOnMissingDir;
        this.maxLevelsOfSymlinks = fileset.maxLevelsOfSymlinks;
        setProject(fileset.getProject());
    }
}