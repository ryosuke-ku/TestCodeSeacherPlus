// clone pairs:1218:90%
// 582:kafka/streams/src/main/java/org/apache/kafka/streams/processor/internals/assignment/SubscriptionInfo.java

public class Nicad_t2_kafka_86_908
{
    private ByteBuffer encodeVersionThree() {
        final byte[] endPointBytes = prepareUserEndPoint();

        final ByteBuffer buf = ByteBuffer.allocate(getVersionThreeAndFourByteLength(endPointBytes));

        buf.putInt(3); // used version
        buf.putInt(LATEST_SUPPORTED_VERSION); // supported version
        encodeClientUUID(buf);
        encodeTasks(buf, prevTasks);
        encodeTasks(buf, standbyTasks);
        encodeUserEndPoint(buf, endPointBytes);

        return buf;
    }
}