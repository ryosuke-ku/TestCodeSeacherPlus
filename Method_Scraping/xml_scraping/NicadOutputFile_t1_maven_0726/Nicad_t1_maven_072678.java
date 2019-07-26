//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java
// clone pairs:458:73%
// 794:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java

public class Nicad_t1_maven_072678
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
}