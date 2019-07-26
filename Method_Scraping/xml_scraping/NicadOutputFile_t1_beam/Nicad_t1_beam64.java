// clone pairs:1302:100%
// 1149:beam/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/graph/Networks.java

public class Nicad_t1_beam64
{
  public static <NodeT, EdgeT> Set<NodeT> reachableNodes(
      Network<NodeT, EdgeT> network, Set<NodeT> startNodes, Set<NodeT> endNodes) {
    Set<NodeT> visitedNodes = new HashSet<>();
    Queue<NodeT> queuedNodes = new ArrayDeque<>();
    queuedNodes.addAll(startNodes);
    // Perform a breadth-first traversal rooted at the input node.
    while (!queuedNodes.isEmpty()) {
      NodeT currentNode = queuedNodes.remove();
      // If we have already visited this node or it is a terminal node than do not add any
      // successors.
      if (!visitedNodes.add(currentNode) || endNodes.contains(currentNode)) {
        continue;
      }
      queuedNodes.addAll(network.successors(currentNode));
    }
    return visitedNodes;
  }
}