// clone pairs:2702:72%
// 901:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/appender/MemoryMappedFileManager.java

public class Nicad_t1_logging110
{
    protected synchronized void write(final byte[] bytes, int offset, int length, final boolean immediateFlush) {
        while (length > mappedBuffer.remaining()) {
            final int chunk = mappedBuffer.remaining();
            mappedBuffer.put(bytes, offset, chunk);
            offset += chunk;
            length -= chunk;
            remap();
        }
        mappedBuffer.put(bytes, offset, length);

        // no need to call flush() if force is true,
        // already done in AbstractOutputStreamAppender.append
    }
}