//1790:maven/maven-settings-builder/src/main/java/org/apache/maven/settings/validation/DefaultSettingsValidator.java
//maven/maven-settings-builder/src/test/java/org/apache/maven/settings/validation/DefaultSettingsValidatorTest.java

public class Nicad_maven771
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