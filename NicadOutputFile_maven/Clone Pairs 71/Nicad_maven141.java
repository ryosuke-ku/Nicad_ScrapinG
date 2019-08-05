//153:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven141
{
    protected void mergeModelBase_Repositories( ModelBase target, ModelBase source, boolean sourceDominant,
                                                Map<Object, Object> context )
    {
        List<Repository> src = source.getRepositories();
        if ( !src.isEmpty() )
        {
            List<Repository> tgt = target.getRepositories();
            Map<Object, Repository> merged = new LinkedHashMap<>( ( src.size() + tgt.size() ) * 2 );

            for ( Repository element : tgt )
            {
                Object key = getRepositoryKey( element );
                merged.put( key, element );
            }

            for ( Repository element : src )
            {
                Object key = getRepositoryKey( element );
                if ( sourceDominant || !merged.containsKey( key ) )
                {
                    merged.put( key, element );
                }
            }

            target.setRepositories( new ArrayList<>( merged.values() ) );
        }
}