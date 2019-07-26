// clone pairs:12610:70%
// 14827:flink/flink-core/src/main/java/org/apache/flink/core/fs/FileSystem.java

public class Nicad_t1_flink_new21033
{
		public boolean equals(final Object obj) {
			if (obj == this) {
				return true;
			}
			else if (obj != null && obj.getClass() == FSKey.class) {
				final FSKey that = (FSKey) obj;
				return this.scheme.equals(that.scheme) &&
						(this.authority == null ? that.authority == null :
								(that.authority != null && this.authority.equals(that.authority)));
			}
			else {
				return false;
			}
		}
}