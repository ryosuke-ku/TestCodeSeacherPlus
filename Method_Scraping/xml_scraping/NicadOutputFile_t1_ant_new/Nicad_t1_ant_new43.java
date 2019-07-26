// clone pairs:277:75%
// 451:ant/src/main/org/apache/tools/ant/types/resources/TarResource.java

public class Nicad_t1_ant_new43
{
    private void setEntry(TarEntry e) {
        if (e == null) {
            setExists(false);
            return;
        }
        setName(e.getName());
        setExists(true);
        setLastModified(e.getModTime().getTime());
        setDirectory(e.isDirectory());
        setSize(e.getSize());
        setMode(e.getMode());
        userName = e.getUserName();
        groupName = e.getGroupName();
        uid = e.getLongUserId();
        gid = e.getLongGroupId();
    }
}