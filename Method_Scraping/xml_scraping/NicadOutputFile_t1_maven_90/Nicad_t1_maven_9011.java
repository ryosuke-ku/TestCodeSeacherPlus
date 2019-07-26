// clone pairs:553:100%
// 900:maven/maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java

public class Nicad_t1_maven_9011
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