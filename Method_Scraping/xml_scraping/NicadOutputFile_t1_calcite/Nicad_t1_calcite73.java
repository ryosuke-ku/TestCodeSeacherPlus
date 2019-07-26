// clone pairs:882:76%
// 1514:calcite/linq4j/src/main/java/org/apache/calcite/linq4j/tree/Primitive.java

public class Nicad_t1_calcite73
{
  public boolean isNumeric() {
    // Per Java: Boolean and Character do not extend Number
    switch (this) {
    case BYTE:
    case SHORT:
    case INT:
    case LONG:
    case FLOAT:
    case DOUBLE:
      return true;
    default:
      return false;
    }
  }
}