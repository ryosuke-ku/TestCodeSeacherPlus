// clone pairs:624:100%
// 1028:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java

public class Nicad_t2_flink40
{
    protected void mergeModel_Url( Model target, Model source, boolean sourceDominant, Map<Object, Object> context )
    {
        String src = source.getUrl();
        if ( src != null )
        {
            if ( sourceDominant )
            {
                target.setUrl( src );
                target.setLocation( "url", source.getLocation( "url" ) );
            }
            else if ( target.getUrl() == null )
            {
                target.setUrl( extrapolateChildUrl( src, source.isChildProjectUrlInheritAppendPath(), context ) );
                target.setLocation( "url", source.getLocation( "url" ) );
            }
        }
    }
}