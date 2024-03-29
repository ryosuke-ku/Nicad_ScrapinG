//1084:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven373
{
    protected void mergeModelBase_Reporting( ModelBase target, ModelBase source, boolean sourceDominant,
                                             Map<Object, Object> context )
    {
        Reporting src = source.getReporting();
        if ( src != null )
        {
            Reporting tgt = target.getReporting();
            if ( tgt == null )
            {
                tgt = new Reporting();
                target.setReporting( tgt );
            }
            mergeReporting( tgt, src, sourceDominant, context );
        }
}