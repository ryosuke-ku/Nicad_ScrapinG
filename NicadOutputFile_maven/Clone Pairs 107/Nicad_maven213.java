//789:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java
//maven/maven-model-builder/src/test/java/org/apache/maven/model/merge/MavenModelMergerTest.java

public class Nicad_maven213
{
    protected void mergeBuildBase_Filters( BuildBase target, BuildBase source, boolean sourceDominant,
                                           Map<Object, Object> context )
    {
        List<String> src = source.getFilters();
        if ( !src.isEmpty() )
        {
            List<String> tgt = target.getFilters();
            Set<String> excludes = new LinkedHashSet<>( tgt );
            List<String> merged = new ArrayList<>( tgt.size() + src.size() );
            merged.addAll( tgt );
            for ( String s : src )
            {
                if ( !excludes.contains( s ) )
                {
                    merged.add( s );
                }
            }
            target.setFilters( merged );
        }
}