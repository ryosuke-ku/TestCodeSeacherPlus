// clone pairs:593:70%
// 903:ant/src/main/org/apache/tools/zip/ZipEntry.java

public class Nicad_t1_ant_new101
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