// clone pairs:984:72%
// 1576:kylin/core-dictionary/src/main/java/org/apache/kylin/dict/TrieDictionaryForest.java

public class Nicad_t1_kylin164
{
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TrieDictionaryForest other = (TrieDictionaryForest) obj;
        if (baseId != other.baseId)
            return false;
        if (trees == null) {
            if (other.trees != null)
                return false;
        } else if (!trees.equals(other.trees))
            return false;
        return true;
    }
}