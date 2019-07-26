// clone pairs:700:75%
// 1167:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java

public class Nicad_t1_maven_new178
{
    protected void mergeDistributionManagement_SnapshotRepository( DistributionManagement target,
                                                                   DistributionManagement source,
                                                                   boolean sourceDominant,
                                                                   Map<Object, Object> context )
    {
        DeploymentRepository src = source.getSnapshotRepository();
        if ( src != null )
        {
            DeploymentRepository tgt = target.getSnapshotRepository();
            if ( sourceDominant || tgt == null )
            {
                tgt = new DeploymentRepository();
                tgt.setLocation( "", src.getLocation( "" ) );
                target.setSnapshotRepository( tgt );
                mergeDeploymentRepository( tgt, src, sourceDominant, context );
            }
        }
    }
}