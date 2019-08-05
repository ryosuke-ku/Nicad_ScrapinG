//810:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java
//maven/maven-model-builder/src/test/java/org/apache/maven/model/merge/MavenModelMergerTest.java

public class Nicad_maven234
{
    protected void mergeDistributionManagement_Site( DistributionManagement target, DistributionManagement source,
                                                     boolean sourceDominant, Map<Object, Object> context )
    {
        Site src = source.getSite();
        if ( src != null )
        {
            Site tgt = target.getSite();
            if ( sourceDominant || tgt == null || isSiteEmpty( tgt ) )
            {
                if ( tgt == null )
                {
                    tgt = new Site();
                }
                tgt.setLocation( "", src.getLocation( "" ) );
                target.setSite( tgt );
                mergeSite( tgt, src, sourceDominant, context );
            }
            mergeSite_ChildSiteUrlInheritAppendPath( tgt, src, sourceDominant, context );
        }
}