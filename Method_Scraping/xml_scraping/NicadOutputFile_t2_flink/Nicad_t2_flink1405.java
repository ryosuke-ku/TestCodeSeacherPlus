// clone pairs:22078:100%
// 32798:flink/flink-runtime-web/src/main/java/org/apache/flink/runtime/webmonitor/handlers/JarListInfo.java

public class Nicad_t2_flink1405
{
		public JarFileInfo(
				@JsonProperty(JAR_FILE_FIELD_ID) String id,
				@JsonProperty(JAR_FILE_FIELD_NAME) String name,
				@JsonProperty(JAR_FILE_FIELD_UPLOADED) long uploaded,
				@JsonProperty(JAR_FILE_FIELD_ENTRY) List<JarEntryInfo> jarEntryList) {
			this.id = checkNotNull(id);
			this.name = checkNotNull(name);
			this.uploaded = uploaded;
			this.jarEntryList = checkNotNull(jarEntryList);
		}
}