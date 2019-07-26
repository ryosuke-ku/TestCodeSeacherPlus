// clone pairs:2557:70%
// 3880:flink/flink-core/src/main/java/org/apache/flink/api/java/typeutils/ValueTypeInfo.java

public class Nicad_t1_flink_new223
{
	public TypeComparator<T> createComparator(boolean sortOrderAscending, ExecutionConfig executionConfig) {
		if (!isKeyType()) {
			throw new RuntimeException("The type " + type.getName() + " is not Comparable.");
		}

		if (BooleanValue.class.isAssignableFrom(type)) {
			return (TypeComparator<T>) new BooleanValueComparator(sortOrderAscending);
		}
		else if (ByteValue.class.isAssignableFrom(type)) {
			return (TypeComparator<T>) new ByteValueComparator(sortOrderAscending);
		}
		else if (CharValue.class.isAssignableFrom(type)) {
			return (TypeComparator<T>) new CharValueComparator(sortOrderAscending);
		}
		else if (DoubleValue.class.isAssignableFrom(type)) {
			return (TypeComparator<T>) new DoubleValueComparator(sortOrderAscending);
		}
		else if (FloatValue.class.isAssignableFrom(type)) {
			return (TypeComparator<T>) new FloatValueComparator(sortOrderAscending);
		}
		else if (IntValue.class.isAssignableFrom(type)) {
			return (TypeComparator<T>) new IntValueComparator(sortOrderAscending);
		}
		else if (LongValue.class.isAssignableFrom(type)) {
			return (TypeComparator<T>) new LongValueComparator(sortOrderAscending);
		}
		else if (NullValue.class.isAssignableFrom(type)) {
			return (TypeComparator<T>) NullValueComparator.getInstance();
		}
		else if (ShortValue.class.isAssignableFrom(type)) {
			return (TypeComparator<T>) new ShortValueComparator(sortOrderAscending);
		}
		else if (StringValue.class.isAssignableFrom(type)) {
			return (TypeComparator<T>) new StringValueComparator(sortOrderAscending);
		}
		else if (CopyableValue.class.isAssignableFrom(type)) {
			return (TypeComparator<T>) new CopyableValueComparator(sortOrderAscending, type);
		}
		else {
			return (TypeComparator<T>) new ValueComparator(sortOrderAscending, type);
		}
	}
}