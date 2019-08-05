//880:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven267
{
    protected void mergeContributor_Properties( Contributor target, Contributor source, boolean sourceDominant,
                                                Map<Object, Object> context )
    {
        Properties merged = new Properties();
        if ( sourceDominant )
        {
            merged.putAll( target.getProperties() );
            merged.putAll( source.getProperties() );
        }
        else
        {
            merged.putAll( source.getProperties() );
            merged.putAll( target.getProperties() );
        }
        target.setProperties( merged );
        target.setLocation( "properties", InputLocation.merge( target.getLocation( "properties" ),
                                                               source.getLocation( "properties" ), sourceDominant ) );
}