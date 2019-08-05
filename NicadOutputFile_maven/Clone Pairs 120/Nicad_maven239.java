//815:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven239
{
    protected void mergeDistributionManagement_SnapshotRepository( DistributionManagement target,
                                                                   DistributionManagement source,
                                                                   boolean sourceDominant,
                                                                   Map<Object, Object> context )
    {
        DeploymentRepository src = source.getSnapshotRepository();
        if ( src != null )
        {
            DeploymentRepository tgt = target.getSnapshotRepository();
            if ( tgt == null )
            {
                tgt = new DeploymentRepository();
                target.setSnapshotRepository( tgt );
            }
            mergeDeploymentRepository( tgt, src, sourceDominant, context );
        }
}