//819:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven243
{
    protected void mergeModelBase_DependencyManagement( ModelBase target, ModelBase source, boolean sourceDominant,
                                                        Map<Object, Object> context )
    {
        DependencyManagement src = source.getDependencyManagement();
        if ( src != null )
        {
            DependencyManagement tgt = target.getDependencyManagement();
            if ( tgt == null )
            {
                tgt = new DependencyManagement();
                target.setDependencyManagement( tgt );
            }
            mergeDependencyManagement( tgt, src, sourceDominant, context );
        }
}