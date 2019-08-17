// clone pairs:638:83%
// 1053:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java

public class Nicad_t1_maven_new127
{
    protected void mergeModel_Organization( Model target, Model source, boolean sourceDominant,
                                            Map<Object, Object> context )
    {
        Organization src = source.getOrganization();
        if ( src != null )
        {
            Organization tgt = target.getOrganization();
            if ( tgt == null )
            {
                tgt = new Organization();
                tgt.setLocation( "", src.getLocation( "" ) );
                target.setOrganization( tgt );
                mergeOrganization( tgt, src, sourceDominant, context );
            }
        }
    }
}