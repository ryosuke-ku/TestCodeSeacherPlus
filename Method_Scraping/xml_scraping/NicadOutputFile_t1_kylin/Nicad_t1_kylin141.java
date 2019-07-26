// clone pairs:771:83%
// 1276:kylin/core-metadata/src/main/java/org/apache/kylin/measure/hllc/HLLCounterOld.java

public class Nicad_t1_kylin141
{
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HLLCounterOld other = (HLLCounterOld) obj;
        if (hashFunc == null) {
            if (other.hashFunc != null)
                return false;
        } else if (!hashFunc.equals(other.hashFunc))
            return false;
        if (p != other.p)
            return false;
        if (!Arrays.equals(registers, other.registers))
            return false;
        return true;
    }
}