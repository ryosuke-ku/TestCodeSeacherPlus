// clone pairs:886:76%
// 1522:calcite/linq4j/src/main/java/org/apache/calcite/linq4j/tree/Primitive.java

public class Nicad_t1_calcite75
{
  Primitive(Class primitiveClass, Class boxClass, int family,
      Object defaultValue, Object min, Object maxNegative, Object minPositive,
      Object max, int size) {
    this.primitiveClass = primitiveClass;
    this.family = family;
    this.primitiveName =
        primitiveClass != null ? primitiveClass.getSimpleName() : null;
    this.boxClass = boxClass;
    this.boxName = boxClass != null ? boxClass.getSimpleName() : null;
    this.defaultValue = defaultValue;
    this.min = min;
    this.maxNegative = maxNegative;
    this.minPositive = minPositive;
    this.max = max;
    this.size = size;
  }
}