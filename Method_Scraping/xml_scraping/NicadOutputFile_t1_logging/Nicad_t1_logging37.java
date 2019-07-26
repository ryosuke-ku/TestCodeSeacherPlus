// clone pairs:276:76%
// 229:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/util/CronExpression.java

public class Nicad_t1_logging37
{
    TreeSet<Integer> getSet(final int type) {
        switch (type) {
            case SECOND:
                return seconds;
            case MINUTE:
                return minutes;
            case HOUR:
                return hours;
            case DAY_OF_MONTH:
                return daysOfMonth;
            case MONTH:
                return months;
            case DAY_OF_WEEK:
                return daysOfWeek;
            case YEAR:
                return years;
            default:
                return null;
        }
    }
}