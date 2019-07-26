// clone pairs:62:100%
// 113:maven/maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java

public class Nicad_t1_maven_1005
{
    public String getLocation()
    {
        StringBuilder buffer = new StringBuilder( 256 );

        if ( getSource().length() > 0 )
        {
            if ( buffer.length() > 0 )
            {
                buffer.append( ", " );
            }
            buffer.append( getSource() );
        }

        if ( getLineNumber() > 0 )
        {
            if ( buffer.length() > 0 )
            {
                buffer.append( ", " );
            }
            buffer.append( "line " ).append( getLineNumber() );
        }

        if ( getColumnNumber() > 0 )
        {
            if ( buffer.length() > 0 )
            {
                buffer.append( ", " );
            }
            buffer.append( "column " ).append( getColumnNumber() );
        }

        return buffer.toString();
    }
}