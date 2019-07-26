// clone pairs:23376:70%
// 34692:flink/flink-runtime/src/main/java/org/apache/flink/runtime/taskmanager/Task.java

public class Nicad_t1_flink_new25382
{
				public void run() {
					try {
						invokable.notifyCheckpointComplete(checkpointID);
						taskStateManager.notifyCheckpointComplete(checkpointID);
					} catch (Throwable t) {
						if (getExecutionState() == ExecutionState.RUNNING) {
							// fail task if checkpoint confirmation failed.
							failExternally(new RuntimeException(
								"Error while confirming checkpoint",
								t));
						}
					}
				}
}