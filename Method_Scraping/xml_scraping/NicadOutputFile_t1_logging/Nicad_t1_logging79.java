// clone pairs:665:71%
// 614:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/appender/RandomAccessFileAppender.java

public class Nicad_t1_logging79
{
    private static void RandomAccessFileAppender(final String name, final Layout<? extends Serializable> layout,
            final Filter filter, final RandomAccessFileManager manager, final String filename,
            final boolean ignoreExceptions, final boolean immediateFlush, final Advertiser advertiser) {

        super(name, layout, filter, ignoreExceptions, immediateFlush, null, manager);
        if (advertiser != null) {
            final Map<String, String> configuration = new HashMap<>(
                    layout.getContentFormat());
            configuration.putAll(manager.getContentFormat());
            configuration.put("contentType", layout.getContentType());
            configuration.put("name", name);
            advertisement = advertiser.advertise(configuration);
        }
        this.fileName = filename;
        this.advertiser = advertiser;
    }
}