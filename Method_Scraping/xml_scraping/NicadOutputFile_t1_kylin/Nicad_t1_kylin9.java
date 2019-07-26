// clone pairs:73:96%
// 95:kylin/core-metadata/src/main/java/org/apache/kylin/metadata/expression/TupleExpressionSerializer.java

public class Nicad_t1_kylin9
{
    public static TupleExpression deserialize(byte[] bytes, IFilterCodeSystem<?> cs) {
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        TupleExpression rootTuple = null;
        Stack<TupleExpression> parentStack = new Stack<>();
        while (buffer.hasRemaining()) {
            int opVal = BytesUtil.readVInt(buffer);
            if (opVal < 0) {
                parentStack.pop();
                continue;
            }

            // deserialize expression
            TupleExpression tuple = createTupleExpression(opVal);
            tuple.deserialize(cs, buffer);

            if (rootTuple == null) {
                // push root to stack
                rootTuple = tuple;
                parentStack.push(tuple);
                BytesUtil.readVInt(buffer);
                continue;
            }

            // add expression to parent
            TupleExpression parentExpression = parentStack.peek();
            if (parentExpression != null) {
                parentExpression.addChild(tuple);
            }

            // push expression to stack or not based on having children or not
            int hasChild = BytesUtil.readVInt(buffer);
            if (hasChild == 1) {
                parentStack.push(tuple);
            }
        }
        return rootTuple;
    }
}