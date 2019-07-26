// clone pairs:157:94%
// 243:ant/src/main/org/apache/tools/ant/taskdefs/optional/TraXLiaison.java

public class Nicad_t2_ant_91_951
{
    private Source getSource(final InputStream is, final File infile)
        throws ParserConfigurationException, SAXException {
        // todo: is this comment still relevant ??
        // FIXME: need to use a SAXSource as the source for the transform
        // so we can plug in our own entity resolver
        Source src = null;
        if (entityResolver != null) {
            if (getFactory().getFeature(SAXSource.FEATURE)) {
                final SAXParserFactory spFactory = SAXParserFactory.newInstance();
                spFactory.setNamespaceAware(true);
                final XMLReader reader = spFactory.newSAXParser().getXMLReader();
                reader.setEntityResolver(entityResolver);
                src = new SAXSource(reader, new InputSource(is));
            } else {
                throw new IllegalStateException("xcatalog specified, but "
                    + "parser doesn't support SAX");
            }
        } else {
            // WARN: Don't use the StreamSource(File) ctor. It won't work with
            // xalan prior to 2.2 because of systemid bugs.
            src = new StreamSource(is);
        }
        src.setSystemId(JAXPUtils.getSystemId(infile));
        return src;
    }
}