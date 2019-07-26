// clone pairs:9552:91%
// 10322:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/RowTypeInfo.java

public class Nicad_t1_flink_new2407
{
	public String toString() {
		StringBuilder bld = new StringBuilder("Row");
		if (types.length > 0) {
			bld.append('(').append(fieldNames[0]).append(": ").append(types[0]);

			for (int i = 1; i < types.length; i++) {
				bld.append(", ").append(fieldNames[i]).append(": ").append(types[i]);
			}

			bld.append(')');
		}
		return bld.toString();
	}
}