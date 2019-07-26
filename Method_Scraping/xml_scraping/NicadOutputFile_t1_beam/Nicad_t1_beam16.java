// clone pairs:364:100%
// 205:beam/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/graph/Networks.java

public class Nicad_t1_beam16
{
  public static <NodeT, EdgeT> List<List<NodeT>> allPathsFromRootsToLeaves(
      Network<NodeT, EdgeT> network) {
    ArrayDeque<List<NodeT>> paths = new ArrayDeque<>();
    // Populate the list with all roots
    for (NodeT node : network.nodes()) {
      if (network.inDegree(node) == 0) {
        paths.add(ImmutableList.of(node));
      }
    }

    List<List<NodeT>> distinctPathsFromRootsToLeaves = new ArrayList<>();
    while (!paths.isEmpty()) {
      List<NodeT> path = paths.removeFirst();
      NodeT lastNode = path.get(path.size() - 1);
      if (network.outDegree(lastNode) == 0) {
        distinctPathsFromRootsToLeaves.add(new ArrayList<>(path));
      } else {
        for (EdgeT edge : network.outEdges(lastNode)) {
          paths.addFirst(
              ImmutableList.<NodeT>builder()
                  .addAll(path)
                  .add(network.incidentNodes(edge).target())
                  .build());
        }
      }
    }
    return distinctPathsFromRootsToLeaves;
  }
}