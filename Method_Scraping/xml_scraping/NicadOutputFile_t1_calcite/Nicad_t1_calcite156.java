// clone pairs:1483:70%
// 2514:calcite/core/src/main/java/org/apache/calcite/sql/SqlOperator.java

public class Nicad_t1_calcite156
{
  protected SqlOperator(
      String name,
      SqlKind kind,
      int leftPrecedence,
      int rightPrecedence,
      SqlReturnTypeInference returnTypeInference,
      SqlOperandTypeInference operandTypeInference,
      SqlOperandTypeChecker operandTypeChecker) {
    assert kind != null;
    this.name = name;
    this.kind = kind;
    this.leftPrec = leftPrecedence;
    this.rightPrec = rightPrecedence;
    this.returnTypeInference = returnTypeInference;
    this.operandTypeInference = operandTypeInference;
    this.operandTypeChecker = operandTypeChecker;
  }
}