//350:maven/maven-artifact/src/main/java/org/apache/maven/artifact/versioning/ComparableVersion.java
//maven/maven-artifact/src/test/java/org/apache/maven/artifact/versioning/ComparableVersionTest.java

public class Nicad_maven164
{
        public int compareTo( Item item )
        {
            if ( item == null )
            {
                return ( value == 0 ) ? 0 : 1; // 1.0 == 1, 1.1 > 1
            }

            switch ( item.getType() )
            {
                case INT_ITEM:
                    return 1;
                case LONG_ITEM:
                    long itemValue = ( (LongItem) item ).value;
                    return ( value < itemValue ) ? -1 : ( ( value == itemValue ) ? 0 : 1 );
                case BIGINTEGER_ITEM:
                    return -1;

                case STRING_ITEM:
                    return 1; // 1.1 > 1-sp

                case LIST_ITEM:
                    return 1; // 1.1 > 1-1

                default:
                    throw new IllegalStateException( "invalid item: " + item.getClass() );
            }
}