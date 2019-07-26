// clone pairs:1084:72%
// 549:kafka/clients/src/main/java/org/apache/kafka/clients/consumer/internals/Heartbeat.java

public class Nicad_t1_kafka_new48
{
    public void Heartbeat(Time time,
                     int sessionTimeoutMs,
                     int heartbeatIntervalMs,
                     int maxPollIntervalMs,
                     long retryBackoffMs) {
        if (heartbeatIntervalMs >= sessionTimeoutMs)
            throw new IllegalArgumentException("Heartbeat must be set lower than the session timeout");

        this.time = time;
        this.sessionTimeoutMs = sessionTimeoutMs;
        this.heartbeatIntervalMs = heartbeatIntervalMs;
        this.maxPollIntervalMs = maxPollIntervalMs;
        this.retryBackoffMs = retryBackoffMs;
        this.heartbeatTimer = time.timer(heartbeatIntervalMs);
        this.sessionTimer = time.timer(sessionTimeoutMs);
        this.pollTimer = time.timer(maxPollIntervalMs);
    }
}