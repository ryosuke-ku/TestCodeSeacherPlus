// clone pairs:708:83%
// 1186:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java

public class Nicad_t2_maven_81_8511
{
    protected void mergeSite_Url( Site target, Site source, boolean sourceDominant, Map<Object, Object> context )
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
                target.setUrl( extrapolateChildUrl( src, source.isChildSiteUrlInheritAppendPath(), context ) );
                target.setLocation( "url", source.getLocation( "url" ) );
            }
        }
    }
}