// clone pairs:1493:70%
// 2534:calcite/core/src/main/java/org/apache/calcite/runtime/SqlFunctions.java

public class Nicad_t1_calcite159
{
  public static Object element(List list) {
    switch (list.size()) {
    case 0:
      return null;
    case 1:
      return list.get(0);
    default:
      throw RESOURCE.moreThanOneValueInList(list.toString()).ex();
    }
  }
}