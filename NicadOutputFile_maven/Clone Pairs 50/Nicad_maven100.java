//112:maven/maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsProblem.java
//None

public class Nicad_maven100
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