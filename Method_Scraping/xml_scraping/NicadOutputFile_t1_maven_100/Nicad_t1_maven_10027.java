// clone pairs:1038:100%
// 1799:maven/maven-core/src/main/java/org/apache/maven/toolchain/building/DefaultToolchainsBuilder.java

public class Nicad_t1_maven_10027
{
    private boolean hasErrors( List<Problem> problems )
    {
        if ( problems != null )
        {
            for ( Problem problem : problems )
            {
                if ( Problem.Severity.ERROR.compareTo( problem.getSeverity() ) >= 0 )
                {
                    return true;
                }
            }
        }

        return false;
    }
}