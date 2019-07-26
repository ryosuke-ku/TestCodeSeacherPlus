// clone pairs:28724:70%
// 44709:flink/flink-filesystems/flink-s3-fs-base/src/main/java/org/apache/flink/fs/s3/common/writer/S3RecoverableFsDataOutputStream.java

public class Nicad_t2_flink2848
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