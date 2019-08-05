//111:maven/maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java
//maven/maven-builder-support/src/test/java/org/apache/maven/building/DefaultProblemTest.java

public class Nicad_maven99
{
    public String getLocation()
    {
        StringBuilder buffer = new StringBuilder( 256 );

        if ( getSource().length() > 0 )
        {
            if ( buffer.length() > 0 )
            {
                buffer.append( ", " );
            }
            buffer.append( getSource() );
        }

        if ( getLineNumber() > 0 )
        {
            if ( buffer.length() > 0 )
            {
                buffer.append( ", " );
            }
            buffer.append( "line " ).append( getLineNumber() );
        }

        if ( getColumnNumber() > 0 )
        {
            if ( buffer.length() > 0 )
            {
                buffer.append( ", " );
            }
            buffer.append( "column " ).append( getColumnNumber() );
        }

        return buffer.toString();
}