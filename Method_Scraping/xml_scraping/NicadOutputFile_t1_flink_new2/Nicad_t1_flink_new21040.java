// clone pairs:12639:100%
// 14874:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/runtime/PojoComparator.java

public class Nicad_t1_flink_new21040
{
	public void getFlatComparator(List<TypeComparator> flatComparators) {
		for(int i = 0; i < comparators.length; i++) {
			if(comparators[i] instanceof CompositeTypeComparator) {
				((CompositeTypeComparator)comparators[i]).getFlatComparator(flatComparators);
			} else {
				flatComparators.add(comparators[i]);
			}
		}
	}
}