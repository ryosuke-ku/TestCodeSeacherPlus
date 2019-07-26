// clone pairs:1407:84%
// 1325:beam/sdks/java/io/jdbc/src/main/java/org/apache/beam/sdk/io/jdbc/JdbcIO.java

public class Nicad_t1_beam76
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