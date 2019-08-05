//1062:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven351
{
    protected void mergeModel_Organization( Model target, Model source, boolean sourceDominant,
                                            Map<Object, Object> context )
    {
        Organization src = source.getOrganization();
        if ( src != null )
        {
            Organization tgt = target.getOrganization();
            if ( tgt == null )
            {
                tgt = new Organization();
                target.setOrganization( tgt );
            }
            mergeOrganization( tgt, src, sourceDominant, context );
        }
}