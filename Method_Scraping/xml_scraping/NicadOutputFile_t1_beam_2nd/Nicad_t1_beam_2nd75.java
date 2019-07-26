// clone pairs:1423:91%
// 1201:beam/sdks/java/core/src/main/java/org/apache/beam/sdk/transforms/SimpleFunction.java

public class Nicad_t1_beam_2nd75
{
  public void SimpleFunction() {
    this.fn = null;
    // A subclass must override apply if using this constructor. Check that via
    // reflection.
    try {
      Method methodThatMustBeOverridden =
          SimpleFunction.class.getDeclaredMethod("apply", Object.class);
      Method methodOnSubclass = getClass().getMethod("apply", Object.class);

      if (methodOnSubclass.equals(methodThatMustBeOverridden)) {
        throw new IllegalStateException(
            "Subclass of SimpleFunction must override 'apply' method"
                + " or pass a SerializableFunction to the constructor,"
                + " usually via a lambda or method reference.");
      }

    } catch (NoSuchMethodException exc) {
      throw new RuntimeException("Impossible state: missing 'apply' method entirely", exc);
    }
  }
}