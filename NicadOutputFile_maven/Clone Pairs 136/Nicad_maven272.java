//895:maven/maven-model-builder/src/main/java/org/apache/maven/model/building/DefaultModelProblem.java
//None

public class Nicad_maven272
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