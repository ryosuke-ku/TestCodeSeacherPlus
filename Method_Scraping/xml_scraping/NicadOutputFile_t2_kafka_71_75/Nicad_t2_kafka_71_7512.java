// clone pairs:566:72%
// 209:kafka/clients/src/main/java/org/apache/kafka/common/config/ConfigDef.java

public class Nicad_t2_kafka_71_7512
{
        public ConfigKey(String name, Type type, Object defaultValue, Validator validator,
                         Importance importance, String documentation, String group,
                         int orderInGroup, Width width, String displayName,
                         List<String> dependents, Recommender recommender,
                         boolean internalConfig) {
            this.name = name;
            this.type = type;
            this.defaultValue = NO_DEFAULT_VALUE.equals(defaultValue) ? NO_DEFAULT_VALUE : parseType(name, defaultValue, type);
            this.validator = validator;
            this.importance = importance;
            if (this.validator != null && hasDefault())
                this.validator.ensureValid(name, this.defaultValue);
            this.documentation = documentation;
            this.dependents = dependents;
            this.group = group;
            this.orderInGroup = orderInGroup;
            this.width = width;
            this.displayName = displayName;
            this.recommender = recommender;
            this.internalConfig = internalConfig;
        }
}