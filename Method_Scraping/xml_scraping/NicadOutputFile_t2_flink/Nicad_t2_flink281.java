// clone pairs:7661:85%
// 7585:flink/flink-core/src/main/java/org/apache/flink/util/ExceptionUtils.java

public class Nicad_t2_flink281
{
	public static Optional<Throwable> findThrowable(Throwable throwable, Predicate<Throwable> predicate) {
		if (throwable == null || predicate == null) {
			return Optional.empty();
		}

		Throwable t = throwable;
		while (t != null) {
			if (predicate.test(t)) {
				return Optional.of(t);
			} else {
				t = t.getCause();
			}
		}

		return Optional.empty();
	}
}