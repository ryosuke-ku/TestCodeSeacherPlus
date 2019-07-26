// clone pairs:840:78%
// 365:kafka/clients/src/main/java/org/apache/kafka/common/record/DefaultRecordBatch.java

public class Nicad_t2_kafka_76_8018
{
    public static int sizeInBytes(long baseOffset, Iterable<Record> records) {
        Iterator<Record> iterator = records.iterator();
        if (!iterator.hasNext())
            return 0;

        int size = RECORD_BATCH_OVERHEAD;
        Long firstTimestamp = null;
        while (iterator.hasNext()) {
            Record record = iterator.next();
            int offsetDelta = (int) (record.offset() - baseOffset);
            if (firstTimestamp == null)
                firstTimestamp = record.timestamp();
            long timestampDelta = record.timestamp() - firstTimestamp;
            size += DefaultRecord.sizeInBytes(offsetDelta, timestampDelta, record.key(), record.value(),
                    record.headers());
        }
        return size;
    }
}