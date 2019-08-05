//1183:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java
//maven/maven-model-builder/src/test/java/org/apache/maven/model/merge/MavenModelMergerTest.java

public class Nicad_maven472
{
    protected void mergeScm_Connection( Scm target, Scm source, boolean sourceDominant, Map<Object, Object> context )
    {
        String src = source.getConnection();
        if ( src != null )
        {
            if ( sourceDominant )
            {
                target.setConnection( src );
                target.setLocation( "connection", source.getLocation( "connection" ) );
            }
            else if ( target.getConnection() == null )
            {
                target.setConnection( extrapolateChildUrl( src, source.isChildScmConnectionInheritAppendPath(),
                                                           context ) );
                target.setLocation( "connection", source.getLocation( "connection" ) );
            }
        }
}