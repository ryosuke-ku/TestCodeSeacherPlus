// clone pairs:1019:80%
// 1639:kylin/stream-coordinator/src/main/java/org/apache/kylin/stream/coordinator/Coordinator.java

public class Nicad_t1_kylin173
{
    public static Coordinator getInstance() {
        if (instance == null) {
            synchronized (Coordinator.class) {
                if (instance == null) {
                    instance = new Coordinator();
                }
            }
        }
        return instance;
    }
}