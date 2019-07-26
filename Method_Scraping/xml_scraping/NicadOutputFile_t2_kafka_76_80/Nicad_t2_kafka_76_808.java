// clone pairs:440:76%
// 169:kafka/clients/src/main/java/org/apache/kafka/common/utils/ImplicitLinkedHashMultiCollection.java

public class Nicad_t2_kafka_76_808
{
    int findElementToRemove(Object key) {
        if (key == null) {
            return INVALID_INDEX;
        }
        int slot = slot(elements, key);
        int bestSlot = INVALID_INDEX;
        for (int seen = 0; seen < elements.length; seen++) {
            Element element = elements[slot];
            if (element == null) {
                return bestSlot;
            }
            if (key == element) {
                return slot;
            } else if (key.equals(element)) {
                bestSlot = slot;
            }
            slot = (slot + 1) % elements.length;
        }
        return INVALID_INDEX;
    }
}