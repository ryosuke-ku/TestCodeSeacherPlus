// clone pairs:29:100%
// 48:ant/src/main/org/apache/tools/ant/taskdefs/optional/image/Image.java

public class Nicad_ant13
{
    public int processDir(final File srcDir, final String[] srcNames,
                          final File dstDir, final FileNameMapper mapper) {
        int writeCount = 0;

        for (final String srcName : srcNames) {
            final File srcFile = new File(srcDir, srcName).getAbsoluteFile();

            final String[] dstNames = mapper.mapFileName(srcName);
            if (dstNames == null) {
                log(srcFile + " skipped, don't know how to handle it",
                    Project.MSG_VERBOSE);
                continue;
            }

            for (String dstName : dstNames) {
                final File dstFile = new File(dstDir, dstName).getAbsoluteFile();

                if (dstFile.exists()) {
                    // avoid overwriting unless necessary
                    if (!overwrite
                       && srcFile.lastModified() <= dstFile.lastModified()) {

                        log(srcFile + " omitted as " + dstFile
                            + " is up to date.", Project.MSG_VERBOSE);

                        // don't overwrite the file
                        continue;
                    }

                    // avoid extra work while overwriting
                    if (!srcFile.equals(dstFile)) {
                        dstFile.delete();
                    }
                }
                processFile(srcFile, dstFile);
                ++writeCount;
            }
        }

        // run the garbage collector if wanted
        if (garbage_collect) {
            System.gc();
        }

        return writeCount;
    }
}