// clone pairs:412:100%
// 666:ant/src/main/org/apache/tools/ant/taskdefs/optional/net/FTP.java

public class Nicad_ant60
{
        private void accountForIncludedFile(String name) {
            if (!filesIncluded.contains(name)
                && !filesExcluded.contains(name)) {

                if (isIncluded(name)) {
                    if (!isExcluded(name)
                        && isSelected(name, scannedDirs.get(name))) {
                        filesIncluded.addElement(name);
                    } else {
                        filesExcluded.addElement(name);
                    }
                } else {
                    filesNotIncluded.addElement(name);
                }
            }
        }
}