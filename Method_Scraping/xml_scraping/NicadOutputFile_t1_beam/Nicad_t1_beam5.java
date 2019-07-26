// clone pairs:119:100%
// 35:beam/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/graph/Networks.java

public class Nicad_t1_beam5
{
  public static <NodeT, EdgeT> void replaceDirectedNetworkNodes(
      MutableNetwork<NodeT, EdgeT> network, Function<NodeT, NodeT> function) {
    checkArgument(network.isDirected(), "Only directed networks are supported, given %s", network);
    checkArgument(
        !network.allowsSelfLoops(),
        "Only networks without self loops are supported, given %s",
        network);

    // A map from the existing node to the replacement node
    Map<NodeT, NodeT> oldNodesToNewNodes = new HashMap<>(network.nodes().size());
    for (NodeT currentNode : network.nodes()) {
      NodeT newNode = function.apply(currentNode);
      // Skip updating the network if the old node is equivalent to the new node
      if (!currentNode.equals(newNode)) {
        oldNodesToNewNodes.put(currentNode, newNode);
      }
    }

    // For each replacement, connect up the existing predecessors and successors to the new node
    // and then remove the old node.
    for (Map.Entry<NodeT, NodeT> entry : oldNodesToNewNodes.entrySet()) {
      NodeT oldNode = entry.getKey();
      NodeT newNode = entry.getValue();
      network.addNode(newNode);
      for (NodeT predecessor : ImmutableSet.copyOf(network.predecessors(oldNode))) {
        for (EdgeT edge : ImmutableSet.copyOf(network.edgesConnecting(predecessor, oldNode))) {
          network.removeEdge(edge);
          network.addEdge(predecessor, newNode, edge);
        }
      }
      for (NodeT successor : ImmutableSet.copyOf(network.successors(oldNode))) {
        for (EdgeT edge : ImmutableSet.copyOf(network.edgesConnecting(oldNode, successor))) {
          network.removeEdge(edge);
          network.addEdge(newNode, successor, edge);
        }
      }
      network.removeNode(oldNode);
    }
  }
}