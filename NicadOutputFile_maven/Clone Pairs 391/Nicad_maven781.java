//1826:maven/maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java
//maven/maven-model-builder/src/test/java/org/apache/maven/model/validation/DefaultModelValidatorTest.java

public class Nicad_maven781
{
    private boolean isValidId( String id )
    {
        for ( int i = 0; i < id.length(); i++ )
        {
            char c = id.charAt( i );
            if ( !isValidIdCharacter( c ) )
            {
                return false;
            }
        }
        return true;
}