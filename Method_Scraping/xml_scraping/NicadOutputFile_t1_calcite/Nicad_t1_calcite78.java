// clone pairs:923:76%
// 1573:calcite/core/src/main/java/org/apache/calcite/rex/RexProgram.java

public class Nicad_t1_calcite78
{
  public boolean projectsOnlyIdentity() {
    if (projects.size() != inputRowType.getFieldCount()) {
      return false;
    }
    for (int i = 0; i < projects.size(); i++) {
      RexLocalRef project = projects.get(i);
      if (project.index != i) {
        return false;
      }
    }
    return true;
  }
}