// clone pairs:646:91%
// 1072:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java

public class Nicad_t2_maven_91_957
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
                tgt.setLocation( "", src.getLocation( "" ) );
                target.setIssueManagement( tgt );
                mergeIssueManagement( tgt, src, sourceDominant, context );
            }
        }
    }
}