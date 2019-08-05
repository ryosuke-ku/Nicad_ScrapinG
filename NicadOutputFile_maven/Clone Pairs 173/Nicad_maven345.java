//1056:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven345
{
    protected void mergeModel_Build( Model target, Model source, boolean sourceDominant, Map<Object, Object> context )
    {
        Build src = source.getBuild();
        if ( src != null )
        {
            Build tgt = target.getBuild();
            if ( tgt == null )
            {
                tgt = new Build();
                target.setBuild( tgt );
            }
            mergeBuild( tgt, src, sourceDominant, context );
        }
}