//129:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven117
{
    protected void mergePlugin_Executions( Plugin target, Plugin source, boolean sourceDominant,
                                           Map<Object, Object> context )
    {
        List<PluginExecution> src = source.getExecutions();
        if ( !src.isEmpty() )
        {
            List<PluginExecution> tgt = target.getExecutions();

            Map<Object, PluginExecution> merged =
                new LinkedHashMap<>( ( src.size() + tgt.size() ) * 2 );

            for ( PluginExecution element : tgt )
            {
                Object key = getPluginExecutionKey( element );
                merged.put( key, element );
            }

            for ( PluginExecution element : src )
            {
                Object key = getPluginExecutionKey( element );
                if ( sourceDominant || !merged.containsKey( key ) )
                {
                    merged.put( key, element );
                }
            }

            target.setExecutions( new ArrayList<>( merged.values() ) );
        }
}