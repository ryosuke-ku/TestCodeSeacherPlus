// clone pairs:593:70%
// 905:ant/src/main/org/apache/tools/zip/ZipEntry.java

public class Nicad_ant88
{
    public ZipExtraField getExtraField(final ZipShort type) {
        if (extraFields != null) {
            for (ZipExtraField extraField : extraFields) {
                if (type.equals(extraField.getHeaderId())) {
                    return extraField;
                }
            }
        }
        return null;
    }
}