/******************************************************************************
 *  @author: Algs book problem execerise 16 - used by Luigi Aleece
 *  Question
 *  The eccentricity of a vertex v is the length of the shortest path from that
 *  vertex to the furthest vertex from v. The diameter of a graph is the maximum
 *  eccentricity of any vertex. The radius of a graph is the smallest
 *  eccentricity of any vertex. A center is a vertex whose eccentricity is the 
 *  radius. Implement the following API:
 *  GraphProperties(Graph G)
 *  int eccentricity(int v)
 *  int diameter()
 *  int radius()
 *  int center()
 ******************************************************************************/

public class Exercise16 {
    public class GraphProperties {
        private int[] eccentricities;
        private int diameter;
        private int radius;
        private int center;
        GraphProperties(Graph graph) {
            eccentricities = new int[graph.vertices()];
            ConnectedComponentsRecursiveDFS connectedComponents = new ConnectedComponentsRecursiveDFS(graph);
            if (connectedComponents.count() != 1) {
                throw new RuntimeException("Graph must be connected");
            }
            getProperties(graph);
        }
        //O(V * (V + E))
        private void getProperties(Graph graph) {
            diameter = 0;
            radius = Integer.MAX_VALUE;
            center = 0;
            for(int vertex = 0; vertex < graph.vertices(); vertex++) {
                BreadthFirstPaths breadthFirstPaths = new BreadthFirstPaths(graph, vertex);
                for(int otherVertex = 0; otherVertex < graph.vertices(); otherVertex++) {
                    if (otherVertex == vertex) {
                        continue;
                    }
                    eccentricities[vertex] = Math.max(eccentricities[vertex], breadthFirstPaths.distTo(otherVertex));
                }
                if (eccentricities[vertex] > diameter) {
                    diameter = eccentricities[vertex];
                }
                if (eccentricities[vertex] < radius) {
                    radius = eccentricities[vertex];
                    center = vertex;
                }
            }
        }
        
        public int diameter() {
            return diameter;
        }
        public int radius() {
            return radius;
        }
        public int center() {
            return center;
        }
    }
    public static void main(String[] args) {
        Exercise16 exercise16 = new Exercise16();
        //Graph
        // 0 --1 --2 --3 --4 --5 --6 --7 --8 --9 --10
        Graph graph = new Graph(11);
        graph.addEdge(0 ,1);
        graph.addEdge(1 ,2);
        graph.addEdge(2 ,3);
        graph.addEdge(3 ,4);
        graph.addEdge(4 ,5);
        graph.addEdge(5 ,6);
        graph.addEdge(6 ,7);
        graph.addEdge(7 ,8);
        graph.addEdge(8 ,9);
        graph.addEdge(9 ,10);
        GraphProperties graphProperties = exercise16.new GraphProperties(graph);
        StdOut.println("Diameter: " + graphProperties.diameter() + " Expected: 10");
        StdOut.println("Radius: " + graphProperties.radius() + " Expected: 5");
        StdOut.println("Center: " + graphProperties.center() + " Expected: 5");
    }
}