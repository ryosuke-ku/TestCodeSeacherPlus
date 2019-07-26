// clone pairs:687:90%
// 968:ant/src/main/org/apache/tools/ant/taskdefs/optional/SchemaValidate.java

public class Nicad_t2_ant53
{
    public boolean enableXercesSchemaValidation() {
        try {
            setFeature(XmlConstants.FEATURE_XSD, true);
            //set the schema source for the doc
            setNoNamespaceSchemaProperty(XmlConstants.PROPERTY_NO_NAMESPACE_SCHEMA_LOCATION);
        } catch (BuildException e) {
            log(e.toString(), Project.MSG_VERBOSE);
            return false;
        }
        return true;
    }
}