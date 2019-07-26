// clone pairs:8116:80%
// 11047:beam/sdks/java/io/xml/src/main/java/org/apache/beam/sdk/io/xml/JAXBCoder.java

public class Nicad_t1_beam_new21749
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