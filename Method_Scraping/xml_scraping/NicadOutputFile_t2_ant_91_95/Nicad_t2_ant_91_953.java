// clone pairs:399:92%
// 660:ant/src/main/org/apache/tools/ant/types/ZipFileSet.java

public class Nicad_t2_ant_91_953
{
    protected AbstractFileSet getRef(Project p) {
        dieOnCircularReference(p);
        Object o = getRefid().getReferencedObject(p);
        if (o instanceof ZipFileSet) {
            return (AbstractFileSet) o;
        }
        if (o instanceof FileSet) {
            ZipFileSet zfs = new ZipFileSet((FileSet) o);
            configureFileSet(zfs);
            return zfs;
        }
        String msg = getRefid().getRefId() + " doesn\'t denote a zipfileset or a fileset";
        throw new BuildException(msg);
    }
}