//1020:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven309
{
    protected void mergeNotifier_Configuration( Notifier target, Notifier source, boolean sourceDominant,
                                                Map<Object, Object> context )
    {
        Properties merged = new Properties();
        if ( sourceDominant )
        {
            merged.putAll( target.getConfiguration() );
            merged.putAll( source.getConfiguration() );
        }
        else
        {
            merged.putAll( source.getConfiguration() );
            merged.putAll( target.getConfiguration() );
        }
        target.setConfiguration( merged );
}