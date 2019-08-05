//1824:maven/maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java
//maven/maven-model-builder/src/test/java/org/apache/maven/model/validation/DefaultModelValidatorTest.java

public class Nicad_maven779
{
    private boolean validateVersion( String fieldName, ModelProblemCollector problems, Severity severity,
                                     Version version, String string, String sourceHint, InputLocationTracker tracker )
    {
        if ( string == null || string.length() <= 0 )
        {
            return true;
        }

        if ( hasExpression( string ) )
        {
            addViolation( problems, severity, version, fieldName, sourceHint,
                          "must be a valid version but is '" + string + "'.", tracker );
            return false;
        }

        return validateBannedCharacters( fieldName, problems, severity, version, string, sourceHint, tracker,
                                         ILLEGAL_VERSION_CHARS );

}