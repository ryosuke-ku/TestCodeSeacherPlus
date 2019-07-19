// clone pairs:1412:80%
// 725:kafka/clients/src/main/java/org/apache/kafka/clients/consumer/internals/ConsumerProtocol.java

public class Nicad_kafka58
{
    public static ByteBuffer serializeSubscription(PartitionAssignor.Subscription subscription) {
        Struct struct = new Struct(SUBSCRIPTION_V0);
        struct.set(USER_DATA_KEY_NAME, subscription.userData());
        struct.set(TOPICS_KEY_NAME, subscription.topics().toArray());
        ByteBuffer buffer = ByteBuffer.allocate(CONSUMER_PROTOCOL_HEADER_V0.sizeOf() + SUBSCRIPTION_V0.sizeOf(struct));
        CONSUMER_PROTOCOL_HEADER_V0.writeTo(buffer);
        SUBSCRIPTION_V0.write(buffer, struct);
        buffer.flip();
        return buffer;
    }
}