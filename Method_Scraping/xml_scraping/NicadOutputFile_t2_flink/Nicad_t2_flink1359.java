// clone pairs:21996:90%
// 32636:flink/flink-runtime-web/src/main/java/org/apache/flink/runtime/webmonitor/handlers/JarListInfo.java

public class Nicad_t2_flink1359
{
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}

			if (null == o || this.getClass() != o.getClass()) {
				return false;
			}

			JarFileInfo that = (JarFileInfo) o;
			return Objects.equals(id, that.id) &&
				Objects.equals(name, that.name) &&
				uploaded == that.uploaded &&
				Objects.equals(jarEntryList, that.jarEntryList);
		}
}