//69:maven/maven-model-builder/src/main/java/org/apache/maven/model/profile/DefaultProfileInjector.java
//None

public class Nicad_maven57
{
        protected void mergeReporting_Plugins( Reporting target, Reporting source, boolean sourceDominant,
                                               Map<Object, Object> context )
        {
            List<ReportPlugin> src = source.getPlugins();
            if ( !src.isEmpty() )
            {
                List<ReportPlugin> tgt = target.getPlugins();
                Map<Object, ReportPlugin> merged =
                    new LinkedHashMap<>( ( src.size() + tgt.size() ) * 2 );

                for ( ReportPlugin element : tgt )
                {
                    Object key = getReportPluginKey( element );
                    merged.put( key, element );
                }

                for ( ReportPlugin element : src )
                {
                    Object key = getReportPluginKey( element );
                    ReportPlugin existing = merged.get( key );
                    if ( existing == null )
                    {
                        merged.put( key, element );
                    }
                    else
                    {
                        mergeReportPlugin( existing, element, sourceDominant, context );
                    }
                }

                target.setPlugins( new ArrayList<>( merged.values() ) );
            }
}