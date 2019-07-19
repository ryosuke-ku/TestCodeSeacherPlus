// clone pairs:1201:70%
// 2102:maven/maven-core/src/main/java/org/apache/maven/lifecycle/MavenExecutionPlan.java

public class Nicad_t2_maven101
{
    private static Iterable<String> getDistinctPhasesInOrderOfExecutionPlanAppearance(
        List<ExecutionPlanItem> planItems )
    {
        LinkedHashSet<String> result = new LinkedHashSet<>();
        for ( ExecutionPlanItem executionPlanItem : planItems )
        {
            final String phase = executionPlanItem.getLifecyclePhase();
            if ( !result.contains( phase ) )
            {
                result.add( phase );
            }
        }
        return result;
    }
}