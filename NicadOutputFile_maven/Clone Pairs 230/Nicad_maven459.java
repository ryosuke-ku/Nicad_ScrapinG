//1170:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven459
{
    protected void mergeModelBase_DistributionManagement( ModelBase target, ModelBase source, boolean sourceDominant,
                                                          Map<Object, Object> context )
    {
        DistributionManagement src = source.getDistributionManagement();
        if ( src != null )
        {
            DistributionManagement tgt = target.getDistributionManagement();
            if ( tgt == null )
            {
                tgt = new DistributionManagement();
                target.setDistributionManagement( tgt );
            }
            mergeDistributionManagement( tgt, src, sourceDominant, context );
        }
}