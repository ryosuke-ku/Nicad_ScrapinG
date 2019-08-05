//37:maven/maven-model-builder/src/main/java/org/apache/maven/model/profile/DefaultProfileInjector.java
//None

public class Nicad_maven35
{
        protected void mergeReportPlugin_ReportSets( ReportPlugin target, ReportPlugin source, boolean sourceDominant,
                                                     Map<Object, Object> context )
        {
            List<ReportSet> src = source.getReportSets();
            if ( !src.isEmpty() )
            {
                List<ReportSet> tgt = target.getReportSets();
                Map<Object, ReportSet> merged = new LinkedHashMap<>( ( src.size() + tgt.size() ) * 2 );

                for ( ReportSet element : tgt )
                {
                    Object key = getReportSetKey( element );
                    merged.put( key, element );
                }

                for ( ReportSet element : src )
                {
                    Object key = getReportSetKey( element );
                    ReportSet existing = merged.get( key );
                    if ( existing != null )
                    {
                        mergeReportSet( existing, element, sourceDominant, context );
                    }
                    else
                    {
                        merged.put( key, element );
                    }
                }

                target.setReportSets( new ArrayList<>( merged.values() ) );
            }
}