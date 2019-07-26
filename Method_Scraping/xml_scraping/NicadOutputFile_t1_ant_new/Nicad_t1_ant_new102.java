// clone pairs:658:100%
// 910:ant/src/main/org/apache/tools/ant/types/XMLCatalog.java

public class Nicad_t1_ant_new102
{
    public Path createCatalogPath() {
        if (isReference()) {
            throw noChildrenAllowed();
        }
        if (this.catalogPath == null) {
            this.catalogPath = new Path(getProject());
        }
        setChecked(false);
        return this.catalogPath.createPath();
    }
}