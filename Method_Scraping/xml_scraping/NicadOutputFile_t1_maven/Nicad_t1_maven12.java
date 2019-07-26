// clone pairs:22:73%
// 36:maven/maven-model-builder/src/main/java/org/apache/maven/model/inheritance/DefaultInheritanceAssembler.java

public class Nicad_t1_maven12
{
        protected void mergeReporting_Plugins( Reporting target, Reporting source, boolean sourceDominant,
                                               Map<Object, Object> context )
        {
            List<ReportPlugin> src = source.getPlugins();
            if ( !src.isEmpty() )
            {
                List<ReportPlugin> tgt = target.getPlugins();
                Map<Object, ReportPlugin> merged =
                    new LinkedHashMap<>( ( src.size() + tgt.size() ) * 2 );

                for ( ReportPlugin element :  src )
                {
                    Object key = getReportPluginKey( element );
                    if ( element.isInherited() )
                    {
                        // NOTE: Enforce recursive merge to trigger merging/inheritance logic for executions as well
                        ReportPlugin plugin = new ReportPlugin();
                        plugin.setLocation( "", element.getLocation( "" ) );
                        plugin.setGroupId( null );
                        mergeReportPlugin( plugin, element, sourceDominant, context );

                        merged.put( key, plugin );
                    }
                }

                for ( ReportPlugin element : tgt )
                {
                    Object key = getReportPluginKey( element );
                    ReportPlugin existing = merged.get( key );
                    if ( existing != null )
                    {
                        mergeReportPlugin( element, existing, sourceDominant, context );
                    }
                    merged.put( key, element );
                }

                target.setPlugins( new ArrayList<>( merged.values() ) );
            }
        }
}