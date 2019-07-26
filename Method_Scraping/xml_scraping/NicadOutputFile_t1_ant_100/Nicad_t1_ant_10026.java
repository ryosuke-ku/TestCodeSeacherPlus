// clone pairs:658:100%
// 912:ant/src/main/org/apache/tools/ant/types/XMLCatalog.java

public class Nicad_t1_ant_10026
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