package Dijkstra;

public class Node implements Comparable<Node> {
    public final String name;
    public Edge[] adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Node previous;

    public Node(String argName) {
        name = argName;
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Node other) {
        return Double.compare(minDistance, other.minDistance);
    }
}
