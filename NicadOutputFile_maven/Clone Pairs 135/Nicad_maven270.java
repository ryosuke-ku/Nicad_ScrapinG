//885:maven/maven-core/src/main/java/org/apache/maven/toolchain/merge/MavenToolchainMerger.java
//maven/maven-core/src/test/java/org/apache/maven/toolchain/merge/MavenToolchainMergerTest.java

public class Nicad_maven270
{
    protected void mergeToolchainModelConfiguration( ToolchainModel target,
                                                    ToolchainModel source )
    {
        Xpp3Dom src = (Xpp3Dom) source.getConfiguration();
        if ( src != null )
        {
            Xpp3Dom tgt = (Xpp3Dom) target.getConfiguration();
            if ( tgt == null )
            {
                tgt = Xpp3Dom.mergeXpp3Dom( new Xpp3Dom( src ), tgt );
            }
            else
            {
                tgt = Xpp3Dom.mergeXpp3Dom( tgt, src );
            }
            target.setConfiguration( tgt );
        }
}