//2093:maven/maven-core/src/main/java/org/apache/maven/lifecycle/MavenExecutionPlan.java
//maven/maven-core/src/test/java/org/apache/maven/lifecycle/MavenExecutionPlanTest.java

public class Nicad_maven864
{
    public Set<MojoDescriptor> getNonThreadSafeMojos()
    {
        Set<MojoDescriptor> mojos = new HashSet<>();
        for ( ExecutionPlanItem executionPlanItem : planItem )
        {
            final MojoExecution mojoExecution = executionPlanItem.getMojoExecution();
            if ( !mojoExecution.getMojoDescriptor().isThreadSafe() )
            {
                mojos.add( mojoExecution.getMojoDescriptor() );
            }
        }
        return mojos;
}