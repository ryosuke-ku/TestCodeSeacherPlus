//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-model/src/main/java/org/apache/maven/model/merge/ModelMerger.java
//C:/Users/ryosuke-ku/Desktop/NiCad-5.1/systems/maven/maven-core/src/main/java/org/apache/maven/toolchain/merge/MavenToolchainMerger.java
// clone pairs:547:83%
// 885:maven/maven-core/src/main/java/org/apache/maven/toolchain/merge/MavenToolchainMerger.java

public class Nicad_t1_maven_072698
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
}