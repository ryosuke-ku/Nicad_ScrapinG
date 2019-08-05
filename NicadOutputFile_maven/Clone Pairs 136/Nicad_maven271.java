//894:maven/maven-builder-support/src/main/java/org/apache/maven/building/DefaultProblem.java
//maven/maven-builder-support/src/test/java/org/apache/maven/building/DefaultProblemTest.java

public class Nicad_maven271
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