// clone pairs:601:100%
// 965:kylin/core-dictionary/src/main/java/org/apache/kylin/dict/TrieDictionaryForest.java

public class Nicad_t1_kylin93
{
    public boolean contains(Dictionary other) {
        if (other.getSize() > this.getSize()) {
            return false;
        }

        for (int i = other.getMinId(); i <= other.getMaxId(); ++i) {
            T v = (T) other.getValueFromId(i);
            if (!this.containsValue(v)) {
                return false;
            }
        }
        return true;
    }
}