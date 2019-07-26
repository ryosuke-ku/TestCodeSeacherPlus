// clone pairs:56:74%
// 75:kylin/core-job/src/main/java/org/apache/kylin/job/JoinedFlatTable.java

public class Nicad_t1_kylin8
{
    static void appendJoinStatement(IJoinedFlatTableDesc flatDesc, StringBuilder sql, boolean singleLine) {
        final String sep = singleLine ? " " : "\n";
        Set<TableRef> dimTableCache = new HashSet<>();

        DataModelDesc model = flatDesc.getDataModel();
        TableRef rootTable = model.getRootFactTable();
        sql.append(" FROM ").append(flatDesc.getDataModel().getRootFactTable().getTableIdentityQuoted(FlatTableSqlQuoteUtils.getQuote()))
                .append(" as ").append(quoteIdentifier(rootTable.getAlias())).append(sep);

        for (JoinTableDesc lookupDesc : model.getJoinTables()) {
            JoinDesc join = lookupDesc.getJoin();
            if (join != null && join.getType().equals("") == false) {
                TableRef dimTable = lookupDesc.getTableRef();
                if (!dimTableCache.contains(dimTable)) {
                    TblColRef[] pk = join.getPrimaryKeyColumns();
                    TblColRef[] fk = join.getForeignKeyColumns();
                    if (pk.length != fk.length) {
                        throw new RuntimeException("Invalid join condition of lookup table:" + lookupDesc);
                    }
                    String joinType = join.getType().toUpperCase(Locale.ROOT);

                    sql.append(joinType).append(" JOIN ").append(dimTable.getTableIdentityQuoted(FlatTableSqlQuoteUtils.getQuote()))
                            .append(" as ").append(quoteIdentifier(dimTable.getAlias())).append(sep);
                    sql.append("ON ");
                    for (int i = 0; i < pk.length; i++) {
                        if (i > 0) {
                            sql.append(" AND ");
                        }
                        sql.append(getQuotedColExpressionInSourceDB(flatDesc, fk[i])).append(" = ")
                                .append(getQuotedColExpressionInSourceDB(flatDesc, pk[i]));
                    }
                    sql.append(sep);

                    dimTableCache.add(dimTable);
                }
            }
        }
    }
}