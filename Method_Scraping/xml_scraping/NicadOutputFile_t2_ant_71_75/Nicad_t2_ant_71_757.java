// clone pairs:517:72%
// 839:ant/src/main/org/apache/tools/ant/AntClassLoader.java

public class Nicad_t2_ant_71_757
{
    private Manifest getJarManifest(final File container) throws IOException {
        if (container.isDirectory()) {
            return null;
        }
        final JarFile jarFile = jarFiles.get(container);
        if (jarFile == null) {
            return null;
        }
        return jarFile.getManifest();
    }
}