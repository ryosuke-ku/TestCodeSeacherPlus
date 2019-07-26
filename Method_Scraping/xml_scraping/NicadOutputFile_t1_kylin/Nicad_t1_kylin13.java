// clone pairs:122:78%
// 179:kylin/core-job/src/main/java/org/apache/kylin/job/JoinedFlatTable.java

public class Nicad_t1_kylin13
{
    private static void appendWhereStatement(IJoinedFlatTableDesc flatDesc, StringBuilder sql, boolean singleLine) {
        final String sep = singleLine ? " " : "\n";

        StringBuilder whereBuilder = new StringBuilder();
        whereBuilder.append("WHERE 1=1");

        DataModelDesc model = flatDesc.getDataModel();
        if (StringUtils.isNotEmpty(model.getFilterCondition())) {
            String quotedFilterCondition = quoteIdentifierInSqlExpr(flatDesc,
                    model.getFilterCondition());
            whereBuilder.append(" AND (").append(quotedFilterCondition).append(") "); // -> filter condition contains special character may cause bug
        }
        if (flatDesc.getSegment() != null) {
            PartitionDesc partDesc = model.getPartitionDesc();
            if (partDesc != null && partDesc.getPartitionDateColumn() != null) {
                SegmentRange segRange = flatDesc.getSegRange();

                if (segRange != null && !segRange.isInfinite()) {
                    whereBuilder.append(" AND (");
                    String quotedPartitionCond = quoteIdentifierInSqlExpr(flatDesc,
                            partDesc.getPartitionConditionBuilder().buildDateRangeCondition(partDesc, flatDesc.getSegment(), segRange, null));
                    whereBuilder.append(quotedPartitionCond);
                    whereBuilder.append(")" + sep);
                }
            }
        }

        sql.append(whereBuilder.toString());
    }
}