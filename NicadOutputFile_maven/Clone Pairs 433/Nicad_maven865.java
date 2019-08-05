//2094:maven/maven-core/src/main/java/org/apache/maven/lifecycle/MavenExecutionPlan.java
//maven/maven-core/src/test/java/org/apache/maven/lifecycle/MavenExecutionPlanTest.java

public class Nicad_maven865
{
    private static Iterable<String> getDistinctPhasesInOrderOfExecutionPlanAppearance(
        List<ExecutionPlanItem> planItems )
    {
        LinkedHashSet<String> result = new LinkedHashSet<>();
        for ( ExecutionPlanItem executionPlanItem : planItems )
        {
            final String phase = executionPlanItem.getLifecyclePhase();
            if ( !result.contains( phase ) )
            {
                result.add( phase );
            }
        }
        return result;
}