//864:maven/maven-core/src/main/java/org/apache/maven/lifecycle/mapping/Lifecycle.java
//None

public class Nicad_maven264
{
    public Map<String, String> getPhases()
    {
        Map<String, LifecyclePhase> lphases = getLifecyclePhases();
        if ( lphases == null )
        {
            return null;
        }

        if ( lphases.isEmpty() )
        {
            return Collections.emptyMap();
        }

        Map<String, String> phases = new LinkedHashMap<>();
        for ( Map.Entry<String, LifecyclePhase> e: lphases.entrySet() )
        {
            phases.put( e.getKey(), e.getValue().toString() );
        }
        return phases;
}