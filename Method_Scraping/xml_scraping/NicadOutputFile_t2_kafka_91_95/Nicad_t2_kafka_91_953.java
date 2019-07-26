// clone pairs:713:93%
// 267:kafka/clients/src/main/java/org/apache/kafka/common/utils/ImplicitLinkedHashMultiCollection.java

public class Nicad_t2_kafka_91_953
{
    int addInternal(Element newElement, Element[] addElements) {
        int slot = slot(addElements, newElement);
        for (int seen = 0; seen < addElements.length; seen++) {
            Element element = addElements[slot];
            if (element == null) {
                addElements[slot] = newElement;
                return slot;
            }
            if (element == newElement) {
                return INVALID_INDEX;
            }
            slot = (slot + 1) % addElements.length;
        }
        throw new RuntimeException("Not enough hash table slots to add a new element.");
    }
}