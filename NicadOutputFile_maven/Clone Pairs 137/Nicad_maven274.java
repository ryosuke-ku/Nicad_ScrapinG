//897:maven/maven-settings-builder/src/main/java/org/apache/maven/settings/building/DefaultSettingsProblem.java
//None

public class Nicad_maven274
{
    public String getMessage()
    {
        String msg;

        if ( message != null && message.length() > 0 )
        {
            msg = message;
        }
        else
        {
            msg = exception.getMessage();

            if ( msg == null )
            {
                msg = "";
            }
        }

        return msg;
}