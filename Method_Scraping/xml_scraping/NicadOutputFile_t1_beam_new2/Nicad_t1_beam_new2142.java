// clone pairs:1890:72%
// 1701:beam/sdks/java/io/rabbitmq/src/main/java/org/apache/beam/sdk/io/rabbitmq/RabbitMqIO.java

public class Nicad_t1_beam_new2142
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