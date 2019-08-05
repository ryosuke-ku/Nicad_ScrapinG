//795:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven219
{
    protected void mergeModel_Parent( Model target, Model source, boolean sourceDominant, Map<Object, Object> context )
    {
        Parent src = source.getParent();
        if ( src != null )
        {
            Parent tgt = target.getParent();
            if ( tgt == null )
            {
                tgt = new Parent();
                tgt.setRelativePath( null );
                target.setParent( tgt );
            }
            mergeParent( tgt, src, sourceDominant, context );
        }
}