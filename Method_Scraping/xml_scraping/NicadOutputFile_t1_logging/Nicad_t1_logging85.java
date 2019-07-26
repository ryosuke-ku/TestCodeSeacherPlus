// clone pairs:1277:83%
// 708:logging-log4j2/log4j-plugins/src/main/java/org/apache/logging/log4j/plugins/convert/TypeConverterRegistry.java

public class Nicad_t1_logging85
{
    private static Type getTypeConverterSupportedType(@SuppressWarnings("rawtypes") final Class<? extends TypeConverter> typeConverterClass) {
        for (final Type type : typeConverterClass.getGenericInterfaces()) {
            if (type instanceof ParameterizedType) {
                final ParameterizedType pType = (ParameterizedType) type;
                if (TypeConverter.class.equals(pType.getRawType())) {
                    // TypeConverter<T> has only one type argument (T), so return that
                    return pType.getActualTypeArguments()[0];
                }
            }
        }
        return Void.TYPE;
    }
}