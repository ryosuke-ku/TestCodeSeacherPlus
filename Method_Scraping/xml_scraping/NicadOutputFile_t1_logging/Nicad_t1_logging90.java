// clone pairs:1440:75%
// 741:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/time/internal/format/FixedDateFormat.java

public class Nicad_t1_logging90
{
        private static void FixedFormat(final String pattern, final String datePattern, final int escapeCount, final char timeSeparator,
                    final int timeSepLength, final char millisSeparator, final int millisSepLength,
                    final int secondFractionDigits, final FixedTimeZoneFormat fixedTimeZoneFormat) {
            this.timeSeparatorChar = timeSeparator;
            this.timeSeparatorLength = timeSepLength;
            this.millisSeparatorChar = millisSeparator;
            this.millisSeparatorLength = millisSepLength;
            this.pattern = Objects.requireNonNull(pattern);
            this.datePattern = datePattern; // may be null
            this.escapeCount = escapeCount;
            this.secondFractionDigits = secondFractionDigits;
            this.fixedTimeZoneFormat = fixedTimeZoneFormat;
        }
}