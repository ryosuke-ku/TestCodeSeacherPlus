// clone pairs:22012:80%
// 32378:flink/flink-runtime-web/src/main/java/org/apache/flink/runtime/webmonitor/handlers/JarListInfo.java

public class Nicad_t1_flink_new24865
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