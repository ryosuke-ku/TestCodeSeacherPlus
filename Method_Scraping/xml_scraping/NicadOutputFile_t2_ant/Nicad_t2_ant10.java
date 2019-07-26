// clone pairs:233:76%
// 365:ant/src/main/org/apache/tools/ant/taskdefs/Manifest.java

public class Nicad_t2_ant10
{
    public boolean equals(Object rhs) {
        if (rhs == null || rhs.getClass() != getClass()) {
            return false;
        }

        if (rhs == this) {
            return true;
        }

        Manifest rhsManifest = (Manifest) rhs;
        if (manifestVersion == null) {
            if (rhsManifest.manifestVersion != null) {
                return false;
            }
        } else if (!manifestVersion.equals(rhsManifest.manifestVersion)) {
            return false;
        }

        return mainSection.equals(rhsManifest.mainSection) && sections.equals(rhsManifest.sections);

    }
}