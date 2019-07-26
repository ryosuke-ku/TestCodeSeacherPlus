// clone pairs:5616:83%
// 5985:flink/flink-libraries/flink-cep/src/main/java/org/apache/flink/cep/nfa/compiler/NFACompiler.java

public class Nicad_t2_flink139
{
		private State<T> createGroupPatternState(
			final GroupPattern<T, ?> groupPattern,
			final State<T> sinkState,
			final State<T> proceedState,
			final boolean isOptional) {
			final IterativeCondition<T> proceedCondition = getTrueFunction();

			Pattern<T, ?> oldCurrentPattern = currentPattern;
			Pattern<T, ?> oldFollowingPattern = followingPattern;
			GroupPattern<T, ?> oldGroupPattern = currentGroupPattern;

			State<T> lastSink = sinkState;
			currentGroupPattern = groupPattern;
			currentPattern = groupPattern.getRawPattern();
			lastSink = createMiddleStates(lastSink);
			lastSink = convertPattern(lastSink);
			if (isOptional) {
				// for the first state of a group pattern, its PROCEED edge should point to
				// the following state of that group pattern
				lastSink.addProceed(proceedState, proceedCondition);
			}
			currentPattern = oldCurrentPattern;
			followingPattern = oldFollowingPattern;
			currentGroupPattern = oldGroupPattern;
			return lastSink;
		}
}