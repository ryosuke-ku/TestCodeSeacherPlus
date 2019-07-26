// clone pairs:685:70%
// 964:ant/src/main/org/apache/tools/ant/taskdefs/optional/SchemaValidate.java

public class Nicad_t2_ant51
{
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof SchemaLocation)) {
                return false;
            }

            final SchemaLocation schemaLocation = (SchemaLocation) o;

            return (file == null ? schemaLocation.file == null : file.equals(schemaLocation.file))
                    && (namespace == null ? schemaLocation.namespace == null : namespace.equals(schemaLocation.namespace))
                    && (url == null ? schemaLocation.url == null : url.equals(schemaLocation.url));
        }
}