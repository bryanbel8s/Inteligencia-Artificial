package Dijkstra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
public class Dijkstra {
    public static void computePaths(Node source) {
        source.minDistance = 0.;
        PriorityQueue<Node> vertexQueue = new PriorityQueue<Node>();
        vertexQueue.add(source);

        while (!vertexQueue.isEmpty()) {
            Node u = vertexQueue.poll();

            // Visita cada arista que sale de u
            for (Edge e : u.adjacencies) {
                Node v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
                if (distanceThroughU < v.minDistance) {
                    vertexQueue.remove(v);
                    v.minDistance = distanceThroughU;
                    v.previous = u;
                    vertexQueue.add(v);
                }
            }
        }
    }

    public static List<Node> getShortestPathTo(Node target) {
        List<Node> path = new ArrayList<Node>();
        for (Node node = target; node != null; node = node.previous) {
            path.add(node);
        }
        Collections.reverse(path);
        return path;
    }

   
}
