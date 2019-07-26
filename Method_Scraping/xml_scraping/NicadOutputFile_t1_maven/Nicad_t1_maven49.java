// clone pairs:67:72%
// 122:maven/maven-model-builder/src/main/java/org/apache/maven/model/merge/MavenModelMerger.java

public class Nicad_t1_maven49
{
    protected void mergeReportPlugin_ReportSets( ReportPlugin target, ReportPlugin source, boolean sourceDominant,
                                                 Map<Object, Object> context )
    {
        List<ReportSet> src = source.getReportSets();
        if ( !src.isEmpty() )
        {
            List<ReportSet> tgt = target.getReportSets();
            Map<Object, ReportSet> merged = new LinkedHashMap<>( ( src.size() + tgt.size() ) * 2 );

            for ( ReportSet rset : src )
            {
                if ( sourceDominant || ( rset.getInherited() != null ? rset.isInherited() : source.isInherited() ) )
                {
                    Object key = getReportSetKey( rset );
                    merged.put( key, rset );
                }
            }

            for ( ReportSet element : tgt )
            {
                Object key = getReportSetKey( element );
                ReportSet existing = merged.get( key );
                if ( existing != null )
                {
                    mergeReportSet( element, existing, sourceDominant, context );
                }
                merged.put( key, element );
            }

            target.setReportSets( new ArrayList<>( merged.values() ) );
        }
    }
}