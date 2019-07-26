// clone pairs:4861:85%
// 5453:flink/flink-table/flink-table-runtime-blink/src/main/java/org/apache/flink/table/dataformat/BinaryRow.java

public class Nicad_t1_flink_new242
{
	public void setDecimal(int pos, Decimal value, int precision) {
		assertIndexIsValid(pos);

		if (Decimal.isCompact(precision)) {
			// compact format
			setLong(pos, value.toUnscaledLong());
		} else {
			int fieldOffset = getFieldOffset(pos);
			int cursor = (int) (segments[0].getLong(fieldOffset) >>> 32);
			assert cursor > 0 : "invalid cursor " + cursor;
			// zero-out the bytes
			SegmentsUtil.setLong(segments, offset + cursor, 0L);
			SegmentsUtil.setLong(segments, offset + cursor + 8, 0L);

			if (value == null) {
				setNullAt(pos);
				// keep the offset for future update
				segments[0].putLong(fieldOffset, ((long) cursor) << 32);
			} else {

				byte[] bytes = value.toUnscaledBytes();
				assert bytes.length <= 16;

				// Write the bytes to the variable length portion.
				SegmentsUtil.copyFromBytes(segments, offset + cursor, bytes, 0, bytes.length);
				setLong(pos, ((long) cursor << 32) | ((long) bytes.length));
			}
		}
	}
}