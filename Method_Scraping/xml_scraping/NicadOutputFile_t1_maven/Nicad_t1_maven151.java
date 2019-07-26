// clone pairs:670:83%
// 1111:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java

public class Nicad_t1_maven151
{
    protected void mergeModel_CiManagement( Model target, Model source, boolean sourceDominant,
                                            Map<Object, Object> context )
    {
        CiManagement src = source.getCiManagement();
        if ( src != null )
        {
            CiManagement tgt = target.getCiManagement();
            if ( tgt == null )
            {
                tgt = new CiManagement();
                tgt.setLocation( "", src.getLocation( "" ) );
                target.setCiManagement( tgt );
                mergeCiManagement( tgt, src, sourceDominant, context );
            }
        }
    }
}