// clone pairs:1037:70%
// 1796:maven/maven-settings-builder/src/main/java/org/apache/maven/settings/validation/DefaultSettingsValidator.java

public class Nicad_301
{
    private static boolean validateStringNotEmpty( SettingsProblemCollector problems, String fieldName, String string,
                                            String sourceHint )
    {
        if ( !validateNotNull( problems, fieldName, string, sourceHint ) )
        {
            return false;
        }

        if ( string.length() > 0 )
        {
            return true;
        }

        addViolation( problems, Severity.ERROR, fieldName, sourceHint, "is missing" );

        return false;
    }
}