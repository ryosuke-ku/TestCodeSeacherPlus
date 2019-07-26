// clone pairs:6480:81%
// 6575:flink/flink-runtime/src/main/java/org/apache/flink/runtime/concurrent/FutureUtils.java

public class Nicad_t1_flink_new292
{
	public static CompletableFuture<Void> composeAfterwards(
			CompletableFuture<?> future,
			Supplier<CompletableFuture<?>> composedAction) {
		final CompletableFuture<Void> resultFuture = new CompletableFuture<>();

		future.whenComplete(
			(Object outerIgnored, Throwable outerThrowable) -> {
				final CompletableFuture<?> composedActionFuture = composedAction.get();

				composedActionFuture.whenComplete(
					(Object innerIgnored, Throwable innerThrowable) -> {
						if (innerThrowable != null) {
							resultFuture.completeExceptionally(ExceptionUtils.firstOrSuppressed(innerThrowable, outerThrowable));
						} else if (outerThrowable != null) {
							resultFuture.completeExceptionally(outerThrowable);
						} else {
							resultFuture.complete(null);
						}
					});
			});

		return resultFuture;
	}
}