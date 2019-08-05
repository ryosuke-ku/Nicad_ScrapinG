//1405:maven/maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java
//maven/maven-model-builder/src/test/java/org/apache/maven/model/validation/DefaultModelValidatorTest.java

public class Nicad_maven524
{
    private boolean validateIdWithWildcards( String fieldName, ModelProblemCollector problems, Severity severity,
                                             Version version, String id, String sourceHint,
                                             InputLocationTracker tracker )
    {
        if ( !validateStringNotEmpty( fieldName, problems, severity, version, id, sourceHint, tracker ) )
        {
            return false;
        }
        else
        {
            if ( !isValidIdWithWildCards( id ) )
            {
                addViolation( problems, severity, version, fieldName, sourceHint,
                              "with value '" + id + "' does not match a valid id pattern.", tracker );
                return false;
            }
            return true;
        }
}