// clone pairs:7663:78%
// 7589:flink/flink-core/src/main/java/org/apache/flink/util/ExceptionUtils.java

public class Nicad_t2_flink283
{
	public static <T extends Throwable> Optional<T> findThrowable(Throwable throwable, Class<T> searchType) {
		if (throwable == null || searchType == null) {
			return Optional.empty();
		}

		Throwable t = throwable;
		while (t != null) {
			if (searchType.isAssignableFrom(t.getClass())) {
				return Optional.of(searchType.cast(t));
			} else {
				t = t.getCause();
			}
		}

		return Optional.empty();
	}
}