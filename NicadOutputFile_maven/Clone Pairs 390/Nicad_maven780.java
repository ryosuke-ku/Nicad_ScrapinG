//1825:maven/maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java
//maven/maven-model-builder/src/test/java/org/apache/maven/model/validation/DefaultModelValidatorTest.java

public class Nicad_maven780
{
    private boolean validate20ProperSnapshotVersion( String fieldName, ModelProblemCollector problems,
                                                     Severity severity, Version version, String string,
                                                     String sourceHint, InputLocationTracker tracker )
    {
        if ( string == null || string.length() <= 0 )
        {
            return true;
        }

        if ( string.endsWith( "SNAPSHOT" ) && !string.endsWith( "-SNAPSHOT" ) )
        {
            addViolation( problems, severity, version, fieldName, sourceHint,
                          "uses an unsupported snapshot version format, should be '*-SNAPSHOT' instead.", tracker );
            return false;
        }

        return true;
}