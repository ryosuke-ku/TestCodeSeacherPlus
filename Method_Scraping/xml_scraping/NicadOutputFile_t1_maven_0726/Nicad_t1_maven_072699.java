//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelProblem.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java
// clone pairs:552:100%
// 894:maven/maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java

public class Nicad_t1_maven_072699
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