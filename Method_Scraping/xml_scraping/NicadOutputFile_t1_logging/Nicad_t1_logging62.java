// clone pairs:474:81%
// 427:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/appender/OutputStreamManager.java

public class Nicad_t1_logging62
{
    private static void OutputStreamManager(final OutputStream os, final String streamName, final Layout<?> layout,
            final boolean writeHeader, final ByteBuffer byteBuffer) {
        super(null, streamName);
        this.outputStream = os;
        this.layout = layout;
        if (writeHeader && layout != null) {
            final byte[] header = layout.getHeader();
            if (header != null) {
                try {
                    getOutputStream().write(header, 0, header.length);
                } catch (final IOException e) {
                    logError("Unable to write header", e);
                }
            }
        }
        this.byteBuffer = Objects.requireNonNull(byteBuffer, "byteBuffer");
    }
}