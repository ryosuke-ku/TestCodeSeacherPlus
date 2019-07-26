// clone pairs:745:84%
// 1258:flink/flink-runtime/src/main/java/org/apache/flink/runtime/util/NonReusingKeyGroupedIterator.java

public class Nicad_t1_flink_new218
{
	public boolean nextKey() throws IOException {
		
		if (lookahead != null) {
			// common case: whole value-iterator was consumed and a new key group is available.
			this.comparator.setReference(this.lookahead);
			this.valuesIterator.next = this.lookahead;
			this.lastKeyRecord = this.lookahead;
			this.lookahead = null;
			this.valuesIterator.iteratorAvailable = true;
			return true;
		}
		
		// first element, empty/done, or the values iterator was not entirely consumed
		if (this.done) {
			return false;
		}
			
		if (this.valuesIterator != null) {
			// values was not entirely consumed. move to the next key
			// Required if user code / reduce() method did not read the whole value iterator.
			E next;
			while (true) {
				if ((next = this.iterator.next()) != null) {
					if (!this.comparator.equalToReference(next)) {
						// the keys do not match, so we have a new group. store the current key
						this.comparator.setReference(next);
						this.valuesIterator.next = next;
						this.lastKeyRecord = next;
						this.valuesIterator.iteratorAvailable = true;
						return true;
					}
				}
				else {
					// input exhausted
					this.valuesIterator.next = null;
					this.valuesIterator = null;
					this.lastKeyRecord = null;
					this.done = true;
					return false;
				}
			}
		}
		else {
			// first element
			// get the next element
			E first = this.iterator.next();
			if (first != null) {
				this.comparator.setReference(first);
				this.valuesIterator = new ValuesIterator(first);
				this.lastKeyRecord = first;
				return true;
			}
			else {
				// empty input, set everything null
				this.done = true;
				return false;
			}
		}
	}
}