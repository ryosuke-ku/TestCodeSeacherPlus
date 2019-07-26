// clone pairs:312:87%
// 504:ant/src/main/org/apache/tools/ant/taskdefs/GUnzip.java

public class Nicad_t1_ant_new55
{
    protected void extract() {
        if (srcResource.getLastModified() > dest.lastModified()) {
            log("Expanding " + srcResource.getName() + " to "
                        + dest.getAbsolutePath());
            try (OutputStream out = Files.newOutputStream(dest.toPath());
                    GZIPInputStream zIn =
                        new GZIPInputStream(srcResource.getInputStream())) {
                byte[] buffer = new byte[BUFFER_SIZE];
                int count = 0;
                do {
                    out.write(buffer, 0, count);
                    count = zIn.read(buffer, 0, buffer.length);
                } while (count != -1);
            } catch (IOException ioe) {
                String msg = "Problem expanding gzip " + ioe.getMessage();
                throw new BuildException(msg, ioe, getLocation());
            }
        }
    }
}