// clone pairs:549:100%
// 876:ant/src/main/org/apache/tools/ant/DirectoryScanner.java

public class Nicad_t2_ant_96_1005
{
    public String[] getIncludedFiles() {
        String[] files;
        synchronized (this) {
            if (filesIncluded == null) {
                throw new IllegalStateException("Must call scan() first");
            }
            files = filesIncluded.toArray(new String[filesIncluded.size()]);
        }
        Arrays.sort(files);
        return files;
    }
}