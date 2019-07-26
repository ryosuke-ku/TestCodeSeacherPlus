// clone pairs:7002:86%
// 7156:flink/flink-runtime/src/main/java/org/apache/flink/runtime/throwable/ThrowableClassifier.java

public class Nicad_t2_flink263
{
	public static Optional<Throwable> findThrowableOfThrowableType(Throwable throwable, ThrowableType throwableType) {
		if (throwable == null || throwableType == null) {
			return Optional.empty();
		}

		Throwable t = throwable;
		while (t != null) {
			final ThrowableAnnotation annotation = t.getClass().getAnnotation(ThrowableAnnotation.class);
			if (annotation != null && annotation.value() == throwableType) {
				return Optional.of(t);
			} else {
				t = t.getCause();
			}
		}

		return Optional.empty();
	}
}