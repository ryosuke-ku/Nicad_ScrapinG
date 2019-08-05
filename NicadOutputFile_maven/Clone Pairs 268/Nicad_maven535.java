//1464:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven535
{
    protected void mergeContributor( Contributor target, Contributor source, boolean sourceDominant,
                                     Map<Object, Object> context )
    {
        mergeContributor_Name( target, source, sourceDominant, context );
        mergeContributor_Email( target, source, sourceDominant, context );
        mergeContributor_Url( target, source, sourceDominant, context );
        mergeContributor_Organization( target, source, sourceDominant, context );
        mergeContributor_OrganizationUrl( target, source, sourceDominant, context );
        mergeContributor_Timezone( target, source, sourceDominant, context );
        mergeContributor_Roles( target, source, sourceDominant, context );
        mergeContributor_Properties( target, source, sourceDominant, context );
}