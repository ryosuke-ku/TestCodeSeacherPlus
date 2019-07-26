// clone pairs:5557:78%
// 5957:flink/flink-java/src/main/java/org/apache/flink/api/java/operators/CrossOperator.java

public class Nicad_t2_flink135
{
		public R cross(T1 in1, T2 in2) {
			for (int i = 0; i < fields.length; i++) {
				if (isFromFirst[i]) {
					if (fields[i] >= 0) {
						outTuple.setField(((Tuple) in1).getField(fields[i]), i);
					} else {
						outTuple.setField(in1, i);
					}
				} else {
					if (fields[i] >= 0) {
						outTuple.setField(((Tuple) in2).getField(fields[i]), i);
					} else {
						outTuple.setField(in2, i);
					}
				}
			}
			return outTuple;
		}
}