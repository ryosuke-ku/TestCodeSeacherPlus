// clone pairs:736:100%
// 282:kafka/streams/src/main/java/org/apache/kafka/streams/state/internals/CachingWindowStore.java

public class Nicad_t2_kafka48
{
        public boolean hasNext() {
            if (current == null) {
                return false;
            }

            if (current.hasNext()) {
                return true;
            }

            while (!current.hasNext()) {
                getNextSegmentIterator();
                if (current == null) {
                    return false;
                }
            }
            return true;
        }
}