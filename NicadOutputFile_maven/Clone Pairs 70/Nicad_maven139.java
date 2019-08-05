//151:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven139
{
    protected void mergeModel_Contributors( Model target, Model source, boolean sourceDominant,
                                            Map<Object, Object> context )
    {
        List<Contributor> src = source.getContributors();
        if ( !src.isEmpty() )
        {
            List<Contributor> tgt = target.getContributors();
            Map<Object, Contributor> merged = new LinkedHashMap<>( ( src.size() + tgt.size() ) * 2 );

            for ( Contributor element : tgt )
            {
                Object key = getContributorKey( element );
                merged.put( key, element );
            }

            for ( Contributor element : src )
            {
                Object key = getContributorKey( element );
                if ( sourceDominant || !merged.containsKey( key ) )
                {
                    merged.put( key, element );
                }
            }

            target.setContributors( new ArrayList<>( merged.values() ) );
        }
}