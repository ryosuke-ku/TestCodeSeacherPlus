// clone pairs:773:93%
// 541:beam/runners/core-construction-java/src/main/java/org/apache/beam/runners/core/construction/graph/Networks.java

public class Nicad_t1_beam_2nd33
{
  public static <NodeT, EdgeT> String toDot(Network<NodeT, EdgeT> network) {
    StringBuilder builder = new StringBuilder();
    builder.append(String.format("digraph network {%n"));
    Map<NodeT, String> nodeName = Maps.newIdentityHashMap();
    network.nodes().forEach(node -> nodeName.put(node, "n" + nodeName.size()));
    for (Entry<NodeT, String> nodeEntry : nodeName.entrySet()) {
      builder.append(
          String.format(
              "  %s [fontname=\"Courier New\" label=\"%s\"];%n",
              nodeEntry.getValue(), escapeDot(nodeEntry.getKey().toString())));
    }
    for (EdgeT edge : network.edges()) {
      EndpointPair<NodeT> endpoints = network.incidentNodes(edge);
      builder.append(
          String.format(
              "  %s -> %s [fontname=\"Courier New\" label=\"%s\"];%n",
              nodeName.get(endpoints.source()),
              nodeName.get(endpoints.target()),
              escapeDot(edge.toString())));
    }
    builder.append("}");
    return builder.toString();
  }
}