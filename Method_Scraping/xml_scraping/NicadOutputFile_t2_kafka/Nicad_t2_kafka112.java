// clone pairs:1219:81%
// 584:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/assignment/SubscriptionInfo.java

public class Nicad_t2_kafka112
{
    private ByteBuffer encodeVersionTwo() {
        final byte[] endPointBytes = prepareUserEndPoint();

        final ByteBuffer buf = ByteBuffer.allocate(getVersionTwoByteLength(endPointBytes));

        buf.putInt(2); // version
        encodeClientUUID(buf);
        encodeTasks(buf, prevTasks);
        encodeTasks(buf, standbyTasks);
        encodeUserEndPoint(buf, endPointBytes);

        return buf;
    }
}