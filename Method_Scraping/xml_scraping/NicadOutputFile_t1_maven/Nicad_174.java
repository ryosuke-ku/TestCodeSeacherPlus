// clone pairs:692:75%
// 1155:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java

public class Nicad_174
{
    protected void mergeDistributionManagement_Repository( DistributionManagement target,
                                                           DistributionManagement source, boolean sourceDominant,
                                                           Map<Object, Object> context )
    {
        DeploymentRepository src = source.getRepository();
        if ( src != null )
        {
            DeploymentRepository tgt = target.getRepository();
            if ( sourceDominant || tgt == null )
            {
                tgt = new DeploymentRepository();
                tgt.setLocation( "", src.getLocation( "" ) );
                target.setRepository( tgt );
                mergeDeploymentRepository( tgt, src, sourceDominant, context );
            }
        }
    }
}