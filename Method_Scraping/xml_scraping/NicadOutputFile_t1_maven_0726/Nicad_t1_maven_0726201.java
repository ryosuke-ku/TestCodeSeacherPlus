//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-embedder/src/main/java/org/apache/maven/cli/configuration/SettingsXmlConfigurationProcessor.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java
// clone pairs:811:100%
// 1353:maven/maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java

public class Nicad_t1_maven_0726201
{
    static File resolveFile( File file, String workingDirectory )
    {
        if ( file == null )
        {
            return null;
        }
        else if ( file.isAbsolute() )
        {
            return file;
        }
        else if ( file.getPath().startsWith( File.separator ) )
        {
            // drive-relative Windows path
            return file.getAbsoluteFile();
        }
        else
        {
            return new File( workingDirectory, file.getPath() ).getAbsoluteFile();
        }
    }
}