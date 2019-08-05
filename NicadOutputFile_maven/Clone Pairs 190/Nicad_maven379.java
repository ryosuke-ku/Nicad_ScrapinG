//1090:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven379
{
    protected void mergeModel_CiManagement( Model target, Model source, boolean sourceDominant,
                                            Map<Object, Object> context )
    {
        CiManagement src = source.getCiManagement();
        if ( src != null )
        {
            CiManagement tgt = target.getCiManagement();
            if ( tgt == null )
            {
                tgt = new CiManagement();
                target.setCiManagement( tgt );
            }
            mergeCiManagement( tgt, src, sourceDominant, context );
        }
}