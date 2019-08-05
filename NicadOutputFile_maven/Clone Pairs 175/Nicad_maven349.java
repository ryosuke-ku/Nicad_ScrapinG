//1060:maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//None

public class Nicad_maven349
{
    protected void mergeModel_IssueManagement( Model target, Model source, boolean sourceDominant,
                                               Map<Object, Object> context )
    {
        IssueManagement src = source.getIssueManagement();
        if ( src != null )
        {
            IssueManagement tgt = target.getIssueManagement();
            if ( tgt == null )
            {
                tgt = new IssueManagement();
                target.setIssueManagement( tgt );
            }
            mergeIssueManagement( tgt, src, sourceDominant, context );
        }
}