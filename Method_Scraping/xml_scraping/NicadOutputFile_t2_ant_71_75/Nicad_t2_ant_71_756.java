// clone pairs:514:72%
// 833:ant/src/main/org/apache/tools/ant/taskdefs/Concat.java

public class Nicad_t2_ant_71_756
{
    public void add(ResourceCollection c) {
        synchronized (this) {
            if (rc == null) {
                rc = new Resources();
                rc.setProject(getProject());
                rc.setCache(true);
            }
        }
        rc.add(c);
    }
}