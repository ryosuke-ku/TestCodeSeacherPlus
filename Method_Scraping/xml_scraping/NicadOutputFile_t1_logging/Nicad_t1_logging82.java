// clone pairs:679:92%
// 625:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/appender/OutputStreamManager.java

public class Nicad_t1_logging82
{
    protected void setOutputStream(final OutputStream os) {
        final byte[] header = layout.getHeader();
        if (header != null) {
            try {
                os.write(header, 0, header.length);
                this.outputStream = os; // only update field if os.write() succeeded
            } catch (final IOException ioe) {
                logError("Unable to write header", ioe);
            }
        } else {
            this.outputStream = os;
        }
    }
}