// clone pairs:9741:83%
// 10638:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/dataformat/DataFormatConverters.java

public class Nicad_t2_flink385
{
		T toExternalImpl(BaseRow value) {
			try {
				T pojo = t.getTypeClass().newInstance();
				for (int i = 0; i < t.getArity(); i++) {
					fields[i].getField().set(pojo, converters[i].toExternal(value, i));
				}
				return pojo;
			} catch (InstantiationException | IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}
}