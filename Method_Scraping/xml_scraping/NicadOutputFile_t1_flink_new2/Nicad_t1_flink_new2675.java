// clone pairs:11344:70%
// 12760:flink/flink-filesystems/flink-s3-fs-base/src/main/java/org/apache/flink/fs/s3/common/writer/S3RecoverableFsDataOutputStream.java

public class Nicad_t1_flink_new2675
{
	public void close() throws IOException {
		lock();
		try {
			fileStream.flush();
		} finally {
			IOUtils.closeQuietly(fileStream);
			fileStream.release();
			unlock();
		}
	}
}