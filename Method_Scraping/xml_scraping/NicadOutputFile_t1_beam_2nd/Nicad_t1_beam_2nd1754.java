// clone pairs:8117:80%
// 11049:beam/sdks/java/io/xml/src/main/java/org/apache/beam/sdk/io/xml/JAXBCoder.java

public class Nicad_t1_beam_2nd1754
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