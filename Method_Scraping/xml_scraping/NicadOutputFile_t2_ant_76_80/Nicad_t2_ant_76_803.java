// clone pairs:237:76%
// 373:ant/src/main/org/apache/tools/ant/taskdefs/condition/ParserSupports.java

public class Nicad_t2_ant_76_803
{
    public boolean evalFeature() {
        XMLReader reader = getReader();
        if (value == null) {
            value = "true";
        }
        boolean v = Project.toBoolean(value);
        try {
            reader.setFeature(feature, v);
        } catch (SAXNotRecognizedException e) {
            log(FEATURE + NOT_RECOGNIZED + feature, Project.MSG_VERBOSE);
            return false;
        } catch (SAXNotSupportedException e) {
            log(FEATURE + NOT_SUPPORTED + feature, Project.MSG_VERBOSE);
            return false;
        }
        return true;
    }
}