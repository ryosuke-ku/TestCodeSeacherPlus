// clone pairs:1199:100%
// 2098:maven/maven-core/src/main/java/org/apache/maven/lifecycle/MavenExecutionPlan.java

public class Nicad_t2_flink99
{
    public Set<Plugin> getNonThreadSafePlugins()
    {
        Set<Plugin> plugins = new HashSet<>();
        for ( ExecutionPlanItem executionPlanItem : planItem )
        {
            final MojoExecution mojoExecution = executionPlanItem.getMojoExecution();
            if ( !mojoExecution.getMojoDescriptor().isThreadSafe() )
            {
                plugins.add( mojoExecution.getPlugin() );
            }
        }
        return plugins;
    }
}