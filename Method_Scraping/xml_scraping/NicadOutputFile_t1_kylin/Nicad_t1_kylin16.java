// clone pairs:171:71%
// 264:kylin/core-cube/src/main/java/org/apache/kylin/cube/common/SegmentPruner.java

public class Nicad_t1_kylin16
{
    private String tsRangeToStr(long ts, PartitionDesc part) {
        String value;
        DataType partitionColType = part.getPartitionDateColumnRef().getType();
        if (partitionColType.isDate()) {
            value = DateFormat.formatToDateStr(ts);
        } else if (partitionColType.isTimeFamily()) {
            value = DateFormat.formatToTimeWithoutMilliStr(ts);
        } else if (partitionColType.isStringFamily() || partitionColType.isIntegerFamily()) {//integer like 20160101
            String partitionDateFormat = part.getPartitionDateFormat();
            if (StringUtils.isEmpty(partitionDateFormat)) {
                value = "" + ts;
            } else {
                value = DateFormat.formatToDateStr(ts, partitionDateFormat);
            }
        } else {
            throw new RuntimeException("Type " + partitionColType + " is not valid partition column type");
        }
        return value;
    }
}