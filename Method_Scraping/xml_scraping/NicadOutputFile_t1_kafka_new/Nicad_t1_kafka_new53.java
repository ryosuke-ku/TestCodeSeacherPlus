// clone pairs:1298:81%
// 618:kafka/clients/src/main/java/org/apache/kafka/common/security/oauthbearer/internals/expiring/ExpiringCredentialRefreshingLogin.java

public class Nicad_t1_kafka_new53
{
    public void close() {
        if (refresherThread != null && refresherThread.isAlive()) {
            refresherThread.interrupt();
            try {
                refresherThread.join();
            } catch (InterruptedException e) {
                log.warn("[Principal={}]: Interrupted while waiting for re-login thread to shutdown.",
                        principalLogText(), e);
                Thread.currentThread().interrupt();
            }
        }
    }
}