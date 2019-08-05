//863:maven/maven-core/src/main/java/org/apache/maven/lifecycle/mapping/LifecyclePhase.java
//maven/maven-core/src/test/java/org/apache/maven/lifecycle/mapping/LifecyclePhaseTest.java

public class Nicad_maven263
{
    public static Map<String, String> toLegacyMap( Map<String, LifecyclePhase> lifecyclePhases )
    {
        if ( lifecyclePhases == null )
        {
            return null;
        }
        
        if ( lifecyclePhases.isEmpty() )
        {
            return Collections.emptyMap();
        }
        
        Map<String, String> phases = new LinkedHashMap<>();
        for ( Map.Entry<String, LifecyclePhase> e: lifecyclePhases.entrySet() )
        {
            phases.put( e.getKey(), e.getValue().toString() );
        }
        return phases;
}