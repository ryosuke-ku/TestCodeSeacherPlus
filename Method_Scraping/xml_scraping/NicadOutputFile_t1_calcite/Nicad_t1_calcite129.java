// clone pairs:1253:90%
// 2168:calcite/core/src/main/java/org/apache/calcite/plan/RelOptUtil.java

public class Nicad_t1_calcite129
{
    public Logic negate() {
      switch (this) {
      case UNKNOWN_AS_FALSE:
      case TRUE:
        return UNKNOWN_AS_TRUE;
      case UNKNOWN_AS_TRUE:
        return UNKNOWN_AS_FALSE;
      default:
        return this;
      }
    }
}