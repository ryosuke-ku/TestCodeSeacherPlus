// clone pairs:710:83%
// 1188:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java

public class Nicad_t2_flink55
{
    protected void mergeScm_Url( Scm target, Scm source, boolean sourceDominant, Map<Object, Object> context )
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
                target.setUrl( extrapolateChildUrl( src, source.isChildScmUrlInheritAppendPath(), context ) );
                target.setLocation( "url", source.getLocation( "url" ) );
            }
        }
    }
}