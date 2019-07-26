// clone pairs:93:90%
// 161:ant/src/main/org/apache/tools/ant/taskdefs/MakeUrl.java

public class Nicad_t2_ant2
{
    private String filesetsToURL() {
        if (filesets.isEmpty()) {
            return "";
        }
        int count = 0;
        StringBuilder urls = new StringBuilder();
        for (FileSet fs : filesets) {
            DirectoryScanner scanner = fs.getDirectoryScanner(getProject());
            for (String file : scanner.getIncludedFiles()) {
                File f = new File(scanner.getBasedir(), file);
                validateFile(f);
                String asUrl = toURL(f);
                urls.append(asUrl);
                log(asUrl, Project.MSG_DEBUG);
                urls.append(separator);
                count++;
            }
        }
        //at this point there is one trailing space to remove, if the list is not empty.
        return stripTrailingSeparator(urls, count);
    }
}