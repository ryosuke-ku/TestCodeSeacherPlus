// clone pairs:8116:80%
// 12406:beam/sdks/java/io/xml/src/main/java/org/apache/beam/sdk/io/xml/JAXBCoder.java

public class Nicad_t1_beam2395
{
  private JAXBContext getContext() throws JAXBException {
    if (jaxbContext == null) {
      synchronized (this) {
        if (jaxbContext == null) {
          jaxbContext = JAXBContext.newInstance(jaxbClass);
        }
      }
    }
    return jaxbContext;
  }
}