// clone pairs:769:76%
// 1297:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/runtime/PojoComparator.java

public class Nicad_t1_flink_new219
{
	public PojoComparator(Field[] keyFields, TypeComparator<?>[] comparators, TypeSerializer<T> serializer, Class<T> type) {
		this.keyFields = keyFields;
		this.comparators = (TypeComparator<Object>[]) comparators;

		this.type = type;
		this.serializer = serializer;

		// set up auxiliary fields for normalized key support
		this.normalizedKeyLengths = new int[keyFields.length];
		int nKeys = 0;
		int nKeyLen = 0;
		boolean inverted = false;

		for (int i = 0; i < this.comparators.length; i++) {
			TypeComparator<?> k = this.comparators[i];
			if(k == null) {
				throw new IllegalArgumentException("One of the passed comparators is null");
			}
			if(keyFields[i] == null) {
				throw new IllegalArgumentException("One of the passed reflection fields is null");
			}

			// as long as the leading keys support normalized keys, we can build up the composite key
			if (k.supportsNormalizedKey()) {
				if (i == 0) {
					// the first comparator decides whether we need to invert the key direction
					inverted = k.invertNormalizedKey();
				}
				else if (k.invertNormalizedKey() != inverted) {
					// if a successor does not agree on the inversion direction, it cannot be part of the normalized key
					break;
				}

				nKeys++;
				final int len = k.getNormalizeKeyLen();
				if (len < 0) {
					throw new RuntimeException("Comparator " + k.getClass().getName() + " specifies an invalid length for the normalized key: " + len);
				}
				this.normalizedKeyLengths[i] = len;
				nKeyLen += this.normalizedKeyLengths[i];

				if (nKeyLen < 0) {
					// overflow, which means we are out of budget for normalized key space anyways
					nKeyLen = Integer.MAX_VALUE;
					break;
				}
			} else {
				break;
			}
		}
		this.numLeadingNormalizableKeys = nKeys;
		this.normalizableKeyPrefixLen = nKeyLen;
		this.invertNormKey = inverted;
	}
}