//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsProblem.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java
// clone pairs:62:100%
// 111:maven/maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java

public class Nicad_t1_maven_072643
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