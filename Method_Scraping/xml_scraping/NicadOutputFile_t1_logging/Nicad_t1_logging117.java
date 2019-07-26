// clone pairs:2841:90%
// 1113:logging-log4j2/log4j-core/src/main/java/org/apache/logging/log4j/core/time/internal/format/FixedDateFormat.java

public class Nicad_t1_logging117
{
    private long calcMidnightMillis(final long time, final int addDays) {
        final Calendar cal = Calendar.getInstance(timeZone);
        cal.setTimeInMillis(time);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        cal.add(Calendar.DATE, addDays);
        return cal.getTimeInMillis();
    }
}