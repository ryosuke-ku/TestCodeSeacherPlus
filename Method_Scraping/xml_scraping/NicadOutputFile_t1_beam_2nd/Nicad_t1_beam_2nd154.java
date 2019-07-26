// clone pairs:1950:72%
// 1752:beam/sdks/java/io/rabbitmq/src/main/java/org/apache/beam/sdk/io/rabbitmq/RabbitMqIO.java

public class Nicad_t1_beam_2nd154
{
    public void stop() throws IOException {
      if (channel != null) {
        try {
          channel.close();
        } catch (Exception e) {
          // ignore
        }
      }
      if (connection != null) {
        connection.close();
      }
    }
}