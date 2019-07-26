//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java
// clone pairs:655:83%
// 1087:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java

public class Nicad_t1_maven_0726140
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