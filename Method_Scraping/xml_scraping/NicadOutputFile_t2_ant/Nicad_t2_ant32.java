// clone pairs:516:81%
// 837:ant/src/main/org/apache/tools/tar/TarEntry.java

public class Nicad_t2_ant32
{
    public void writeEntryHeader(byte[] outbuf) {
        try {
            writeEntryHeader(outbuf, TarUtils.DEFAULT_ENCODING, false);
        } catch (IOException ex) {
            try {
                writeEntryHeader(outbuf, TarUtils.FALLBACK_ENCODING, false);
            } catch (IOException ex2) {
                // impossible
                throw new RuntimeException(ex2); //NOSONAR
            }
        }
    }
}