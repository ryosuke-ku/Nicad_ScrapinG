//1827:maven/maven-model-builder/src/main/java/org/apache/maven/model/validation/DefaultModelValidator.java
//maven/maven-model-builder/src/test/java/org/apache/maven/model/validation/DefaultModelValidatorTest.java

public class Nicad_maven782
{
    private boolean isValidIdWithWildCards( String id )
    {
        for ( int i = 0; i < id.length(); i++ )
        {
            char c = id.charAt( i );
            if ( !isValidIdWithWildCardCharacter( c ) )
            {
                return false;
            }
        }
        return true;
}