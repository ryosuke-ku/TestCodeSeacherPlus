// clone pairs:508:76%
// 790:kylin/core-metadata/src/main/java/org/apache/kylin/metadata/datatype/DataType.java

public class Nicad_t1_kylin67
{
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DataType other = (DataType) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (precision != other.precision)
            return false;
        if (scale != other.scale)
            return false;
        return true;
    }
}