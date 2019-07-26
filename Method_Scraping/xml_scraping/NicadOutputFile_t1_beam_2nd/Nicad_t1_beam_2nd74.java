// clone pairs:1407:84%
// 1195:beam/sdks/java/io/jdbc/src/main/java/org/apache/beam/sdk/io/jdbc/JdbcIO.java

public class Nicad_t1_beam_2nd74
{
      public void finishBundle() throws Exception {
        executeBatch();
        try {
          if (preparedStatement != null) {
            preparedStatement.close();
          }
        } finally {
          if (connection != null) {
            connection.close();
          }
        }
      }
}