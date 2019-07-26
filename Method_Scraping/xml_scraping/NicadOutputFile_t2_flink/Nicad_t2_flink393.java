// clone pairs:10016:91%
// 10898:flink/flink-formats/flink-csv/src/main/java/org/apache/flink/formats/csv/CsvRowFormatFactory.java

public class Nicad_t2_flink393
{
	public DeserializationSchema<Row> createDeserializationSchema(Map<String, String> properties) {
		final DescriptorProperties descriptorProperties = getValidatedProperties(properties);

		final CsvRowDeserializationSchema.Builder schemaBuilder = new CsvRowDeserializationSchema.Builder(
			createTypeInformation(descriptorProperties));

		descriptorProperties.getOptionalCharacter(CsvValidator.FORMAT_FIELD_DELIMITER)
			.ifPresent(schemaBuilder::setFieldDelimiter);

		descriptorProperties.getOptionalCharacter(CsvValidator.FORMAT_QUOTE_CHARACTER)
			.ifPresent(schemaBuilder::setQuoteCharacter);

		descriptorProperties.getOptionalBoolean(CsvValidator.FORMAT_ALLOW_COMMENTS)
			.ifPresent(schemaBuilder::setAllowComments);

		descriptorProperties.getOptionalBoolean(CsvValidator.FORMAT_IGNORE_PARSE_ERRORS)
			.ifPresent(schemaBuilder::setIgnoreParseErrors);

		descriptorProperties.getOptionalString(CsvValidator.FORMAT_ARRAY_ELEMENT_DELIMITER)
			.ifPresent(schemaBuilder::setArrayElementDelimiter);

		descriptorProperties.getOptionalCharacter(CsvValidator.FORMAT_ESCAPE_CHARACTER)
			.ifPresent(schemaBuilder::setEscapeCharacter);

		descriptorProperties.getOptionalString(CsvValidator.FORMAT_NULL_LITERAL)
			.ifPresent(schemaBuilder::setNullLiteral);

		return schemaBuilder.build();
	}
}