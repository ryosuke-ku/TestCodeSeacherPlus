// clone pairs:787:83%
// 1306:kylin/core-dictionary/src/main/java/org/apache/kylin/dict/lookup/SnapshotManager.java

public class Nicad_t1_kylin147
{
    private String checkDupByInfo(SnapshotTable snapshot) throws IOException {
        ResourceStore store = getStore();
        String resourceDir = snapshot.getResourceDir();
        NavigableSet<String> existings = store.listResources(resourceDir);
        if (existings == null)
            return null;

        TableSignature sig = snapshot.getSignature();
        for (String existing : existings) {
            SnapshotTable existingTable = load(existing, false); // skip cache,
            // direct load from store
            if (existingTable != null && sig.equals(existingTable.getSignature()))
                return existing;
        }

        return null;
    }
}