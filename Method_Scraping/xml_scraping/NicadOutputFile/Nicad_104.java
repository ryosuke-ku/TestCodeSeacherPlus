// clone pairs:552:100%
// 898:maven/maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java

public class Nicad_104
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