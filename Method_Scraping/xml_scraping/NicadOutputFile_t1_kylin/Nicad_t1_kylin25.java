// clone pairs:242:77%
// 374:kylin/core-metadata/src/main/java/org/apache/kylin/metadata/expression/TupleExpressionSerializer.java

public class Nicad_t1_kylin25
{
    public static byte[] serialize(TupleExpression rootExpr, Decorator decorator, IFilterCodeSystem<?> cs) {
        ByteBuffer buffer;
        int bufferSize = BUFFER_SIZE;
        while (true) {
            try {
                buffer = ByteBuffer.allocate(bufferSize);
                Serializer serializer = new Serializer(decorator, cs, buffer);
                rootExpr.accept(serializer);
                break;
            } catch (BufferOverflowException e) {
                logger.info("Buffer size {} cannot hold the expression, resizing to 4 times", bufferSize);
                bufferSize *= 4;
            }
        }
        byte[] result = new byte[buffer.position()];
        System.arraycopy(buffer.array(), 0, result, 0, buffer.position());
        return result;
    }
}