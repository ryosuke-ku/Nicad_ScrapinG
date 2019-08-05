//1130:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven419
{
    protected void mergeRepository_Snapshots( Repository target, Repository source, boolean sourceDominant,
                                              Map<Object, Object> context )
    {
        RepositoryPolicy src = source.getSnapshots();
        if ( src != null )
        {
            RepositoryPolicy tgt = target.getSnapshots();
            if ( tgt == null )
            {
                tgt = new RepositoryPolicy();
                target.setSnapshots( tgt );
            }
            mergeRepositoryPolicy( tgt, src, sourceDominant, context );
        }
}