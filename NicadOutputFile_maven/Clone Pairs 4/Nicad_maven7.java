//7:maven/maven-model-builder/src/main/java/org/apache/maven/model/profile/DefaultProfileInjector.java
//None

public class Nicad_maven7
{
        protected void mergePluginContainer_Plugins( PluginContainer target, PluginContainer source,
                                                     boolean sourceDominant, Map<Object, Object> context )
        {
            List<Plugin> src = source.getPlugins();
            if ( !src.isEmpty() )
            {
                List<Plugin> tgt = target.getPlugins();
                Map<Object, Plugin> master = new LinkedHashMap<>( tgt.size() * 2 );

                for ( Plugin element : tgt )
                {
                    Object key = getPluginKey( element );
                    master.put( key, element );
                }

                Map<Object, List<Plugin>> predecessors = new LinkedHashMap<>();
                List<Plugin> pending = new ArrayList<>();
                for ( Plugin element : src )
                {
                    Object key = getPluginKey( element );
                    Plugin existing = master.get( key );
                    if ( existing != null )
                    {
                        mergePlugin( existing, element, sourceDominant, context );

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