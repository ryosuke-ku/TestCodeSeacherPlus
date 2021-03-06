//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java
// clone pairs:690:75%
// 1147:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java

public class Nicad_t1_maven_0726167
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