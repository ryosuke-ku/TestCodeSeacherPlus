// clone pairs:539:72%
// 203:kafka/clients/src/main/java/org/apache/kafka/common/utils/ImplicitLinkedHashCollection.java

public class Nicad_t2_kafka_71_7510
{
    final private int findIndexOfEqualElement(Object key) {
        if (key == null) {
            return INVALID_INDEX;
        }
        int slot = slot(elements, key);
        for (int seen = 0; seen < elements.length; seen++) {
            Element element = elements[slot];
            if (element == null) {
                return INVALID_INDEX;
            }
            if (key.equals(element)) {
                return slot;
            }
            slot = (slot + 1) % elements.length;
        }
        return INVALID_INDEX;
    }
}