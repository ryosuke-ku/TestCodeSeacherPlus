// clone pairs:15265:70%
// 19505:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/dataformat/DataFormatConverters.java

public class Nicad_t1_flink_new21917
{
		public MapConverter(TypeInformation keyTypeInfo, TypeInformation valueTypeInfo) {
			this.keyType = TypeConverters.createInternalTypeFromTypeInfo(keyTypeInfo);
			this.valueType = TypeConverters.createInternalTypeFromTypeInfo(valueTypeInfo);
			this.keyConverter = DataFormatConverters.getConverterForTypeInfo(keyTypeInfo);
			this.valueConverter = DataFormatConverters.getConverterForTypeInfo(valueTypeInfo);
			this.keyElementSize = BinaryArray.calculateFixLengthPartSize(keyType);
			this.valueElementSize = BinaryArray.calculateFixLengthPartSize(valueType);
			this.keyComponentClass = keyTypeInfo.getTypeClass();
			this.valueComponentClass = valueTypeInfo.getTypeClass();
		}
}