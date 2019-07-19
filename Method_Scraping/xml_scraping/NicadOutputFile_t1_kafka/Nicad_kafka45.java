// clone pairs:1084:72%
// 550:kafka/clients/src/main/java/org/apache/kafka/clients/consumer/internals/Heartbeat.java

public class Nicad_kafka45
{
    public Heartbeat(Time time,
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