//954:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven295
{
    protected void mergeModel_Scm( Model target, Model source, boolean sourceDominant, Map<Object, Object> context )
    {
        Scm src = source.getScm();
        if ( src != null )
        {
            Scm tgt = target.getScm();
            if ( tgt == null )
            {
                tgt = new Scm();
                tgt.setTag( null );
                target.setScm( tgt );
            }
            mergeScm( tgt, src, sourceDominant, context );
        }
}