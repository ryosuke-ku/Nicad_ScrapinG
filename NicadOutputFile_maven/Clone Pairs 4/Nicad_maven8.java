//8:maven/maven-model-builder/src/main/java/org/apache/maven/model/inheritance/DefaultInheritanceAssembler.java
//maven/maven-model-builder/src/test/java/org/apache/maven/model/inheritance/DefaultInheritanceAssemblerTest.java

public class Nicad_maven8
{
        protected void mergePluginContainer_Plugins( PluginContainer target, PluginContainer source,
                                                     boolean sourceDominant, Map<Object, Object> context )
        {
            List<Plugin> src = source.getPlugins();
            if ( !src.isEmpty() )
            {
                List<Plugin> tgt = target.getPlugins();
                Map<Object, Plugin> master = new LinkedHashMap<>( src.size() * 2 );

                for ( Plugin element : src )
                {
                    if ( element.isInherited() || !element.getExecutions().isEmpty() )
                    {
                        // NOTE: Enforce recursive merge to trigger merging/inheritance logic for executions
                        Plugin plugin = new Plugin();
                        plugin.setLocation( "", element.getLocation( "" ) );
                        plugin.setGroupId( null );
                        mergePlugin( plugin, element, sourceDominant, context );

                        Object key = getPluginKey( element );

                        master.put( key, plugin );
                    }
                }

                Map<Object, List<Plugin>> predecessors = new LinkedHashMap<>();
                List<Plugin> pending = new ArrayList<>();
                for ( Plugin element : tgt )
                {
                    Object key = getPluginKey( element );
                    Plugin existing = master.get( key );
                    if ( existing != null )
                    {
                        mergePlugin( element, existing, sourceDominant, context );

                        master.put( key, element );

                        if ( !pending.isEmpty() )
                        {
                            predecessors.put( key, pending );
                            pending = new ArrayList<>();
                        }
                    }
                    else
                    {
                        pending.add( element );
                    }
                }

                List<Plugin> result = new ArrayList<>( src.size() + tgt.size() );
                for ( Map.Entry<Object, Plugin> entry : master.entrySet() )
                {
                    List<Plugin> pre = predecessors.get( entry.getKey() );
                    if ( pre != null )
                    {
                        result.addAll( pre );
                    }
                    result.add( entry.getValue() );
                }
                result.addAll( pending );

                target.setPlugins( result );
            }
}