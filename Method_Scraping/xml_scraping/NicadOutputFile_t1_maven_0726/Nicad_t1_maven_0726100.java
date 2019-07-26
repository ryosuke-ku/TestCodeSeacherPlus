//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsProblem.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java
// clone pairs:553:100%
// 896:maven/maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java

public class Nicad_t1_maven_0726100
{
    public String getMessage()
    {
        String msg;

        if ( message != null && message.length() > 0 )
        {
            msg = message;
        }
        else
        {
            msg = exception.getMessage();

            if ( msg == null )
            {
                msg = "";
            }
        }

        return msg;
    }
}