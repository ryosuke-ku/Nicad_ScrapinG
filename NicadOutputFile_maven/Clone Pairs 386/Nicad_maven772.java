//1791:maven/maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java
//maven/maven-model-builder/src/test/java/org/apache/maven/model/validation/DefaultModelValidatorTest.java

public class Nicad_maven772
{
    private boolean validateStringNotEmpty( String fieldName, ModelProblemCollector problems, Severity severity,
                                            Version version, String string, String sourceHint,
                                            InputLocationTracker tracker )
    {
        if ( !validateNotNull( fieldName, problems, severity, version, string, sourceHint, tracker ) )
        {
            return false;
        }

        if ( string.length() > 0 )
        {
            return true;
        }

        addViolation( problems, severity, version, fieldName, sourceHint, "is missing.", tracker );

        return false;
}