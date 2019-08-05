//1132:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven421
{
    protected void mergeRepository_Releases( Repository target, Repository source, boolean sourceDominant,
                                             Map<Object, Object> context )
    {
        RepositoryPolicy src = source.getReleases();
        if ( src != null )
        {
            RepositoryPolicy tgt = target.getReleases();
            if ( tgt == null )
            {
                tgt = new RepositoryPolicy();
                target.setReleases( tgt );
            }
            mergeRepositoryPolicy( tgt, src, sourceDominant, context );
        }
}