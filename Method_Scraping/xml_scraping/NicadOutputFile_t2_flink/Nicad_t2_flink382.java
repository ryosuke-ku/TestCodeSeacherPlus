// clone pairs:9723:91%
// 10609:flink/flink-optimizer/src/main/java/org/apache/flink/optimizer/costs/DefaultCostEstimator.java

public class Nicad_t2_flink382
{
	public void addLocalSortCost(EstimateProvider estimates, Costs costs) {
		final long s = estimates.getEstimatedOutputSize();
		// we assume a two phase merge sort, so all in all 2 I/O operations per block
		if (s <= 0) {
			costs.setDiskCost(Costs.UNKNOWN);
			costs.setCpuCost(Costs.UNKNOWN);
		} else {
			costs.addDiskCost(2 * s);
			costs.addCpuCost((long) (s * SORTING_CPU_FACTOR));
		}
		costs.addHeuristicDiskCost(2 * HEURISTIC_COST_BASE);
		costs.addHeuristicCpuCost((long) (HEURISTIC_COST_BASE * SORTING_CPU_FACTOR));
	}
}