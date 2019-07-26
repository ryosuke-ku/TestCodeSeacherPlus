// clone pairs:1945:75%
// 761:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/time/internal/format/FastDateParser.java

public class Nicad_t1_logging91
{
        static Strategy getStrategy(final int tokenLen) {
            switch(tokenLen) {
            case 1:
                return ISO_8601_1_STRATEGY;
            case 2:
                return ISO_8601_2_STRATEGY;
            case 3:
                return ISO_8601_3_STRATEGY;
            default:
                throw new IllegalArgumentException("invalid number of X");
            }
        }
}