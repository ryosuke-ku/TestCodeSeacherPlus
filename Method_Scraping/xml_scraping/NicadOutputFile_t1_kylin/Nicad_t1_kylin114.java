// clone pairs:683:75%
// 1118:kylin/stream-core/src/main/java/org/apache/kylin/stream/core/storage/CheckPointStore.java

public class Nicad_t1_kylin114
{
    private File getCheckPointFile(CheckPoint cp) {
        File checkPointFile = new File(checkPointFolder, getFileNameFromTimestamp(cp.getCheckPointTime()));
        if (!checkPointFile.exists()) {
            try {
                checkPointFile.createNewFile();
                deleteOldCPFiles();
            } catch (IOException e) {
                throw new IllegalStorageException(e);
            }
        }
        return checkPointFile;
    }
}