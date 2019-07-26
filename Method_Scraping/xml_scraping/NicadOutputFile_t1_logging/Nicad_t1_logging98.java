// clone pairs:2371:72%
// 822:logging-log4j2/log4j-taglib/src/main/java/org/apache/logging/log4j/taglib/ExitTag.java

public class Nicad_t1_logging98
{
    public int doEndTag() throws JspException {
        final Log4jTaglibLogger logger = this.getLogger();

        if (TagUtils.isEnabled(logger, Level.TRACE, null)) {
            if (this.result == null) {
                logger.exit(FQCN, null);
            } else {
                logger.exit(FQCN, this.result);
            }
        }

        return Tag.EVAL_PAGE;
    }
}