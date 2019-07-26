// clone pairs:7849:76%
// 7871:flink/flink-connectors/flink-orc/src/main/java/org/apache/flink/orc/OrcBatchReader.java

public class Nicad_t2_flink295
{
		public Object apply(Object o) {
			if (o == null) {
				return null;
			} else {
				Row r = (Row) o;
				Row copy = new Row(copyFields.length);
				for (int i = 0; i < copyFields.length; i++) {
					copy.setField(i, copyFields[i].apply(r.getField(i)));
				}
				return copy;
			}
		}
}