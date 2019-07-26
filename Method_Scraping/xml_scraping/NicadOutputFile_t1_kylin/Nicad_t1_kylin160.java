// clone pairs:976:72%
// 1562:kylin/core-metadata/src/main/java/org/apache/kylin/measure/hllc/HLLCounter.java

public class Nicad_t1_kylin160
{
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HLLCounter other = (HLLCounter) obj;
        if (!hashFunc.equals(other.hashFunc))
            return false;
        if (p != other.p)
            return false;
        if (!register.equals(other.register))
            return false;
        return true;
    }
}