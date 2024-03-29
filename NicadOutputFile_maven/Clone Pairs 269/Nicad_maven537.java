//1466:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven537
{
    protected void mergeModelBase( ModelBase target, ModelBase source, boolean sourceDominant,
                                   Map<Object, Object> context )
    {
        mergeModelBase_DistributionManagement( target, source, sourceDominant, context );
        mergeModelBase_Modules( target, source, sourceDominant, context );
        mergeModelBase_Repositories( target, source, sourceDominant, context );
        mergeModelBase_PluginRepositories( target, source, sourceDominant, context );
        mergeModelBase_Dependencies( target, source, sourceDominant, context );
        mergeModelBase_Reporting( target, source, sourceDominant, context );
        mergeModelBase_DependencyManagement( target, source, sourceDominant, context );
        mergeModelBase_Properties( target, source, sourceDominant, context );
}