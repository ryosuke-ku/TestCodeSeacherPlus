// clone pairs:426:84%
// 693:ant/src/main/org/apache/tools/ant/types/resources/FileResource.java

public class Nicad_t1_ant_new69
{
    public boolean equals(Object another) {
        if (this == another) {
            return true;
        }
        if (isReference()) {
            return getRef().equals(another);
        }
        if (another == null || !(another.getClass().equals(getClass()))) {
            return false;
        }
        FileResource otherfr = (FileResource) another;
        return getFile() == null
            ? otherfr.getFile() == null
            : getFile().equals(otherfr.getFile()) && getName().equals(otherfr.getName());
    }
}