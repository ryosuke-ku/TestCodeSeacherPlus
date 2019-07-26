// clone pairs:1162:100%
// 1886:kylin/core-metadata/src/main/java/org/apache/kylin/metadata/expression/TupleExpressionSerializer.java

public class Nicad_t1_kylin180
{
    private static void serializeExpression(int flag, TupleExpression expr, ByteBuffer buffer,
                                            IFilterCodeSystem<?> cs) {
        if (flag < 0) {
            BytesUtil.writeVInt(-1, buffer);
        } else {
            int opVal = expr.getOperator().getValue();
            BytesUtil.writeVInt(opVal, buffer);
            expr.serialize(cs, buffer);
            BytesUtil.writeVInt(flag, buffer);
        }
    }
}