public class Main {
    public static void main(String[] args) {
        var graph = new WeightedGraph();

        // graph.addNode("A");
        // graph.addNode("B");
        // graph.addNode("C");
        // graph.addEdge("A", "B", 1);
        // graph.addEdge("B", "C", 2);
        // graph.addEdge("A", "C", 10);
        // var path = graph.getShortestPath("A", "C");
        // System.out.println(path);

        // graph.addNode("A");
        // graph.addNode("B");
        // graph.addNode("C");
        // graph.addEdge("A", "B", 0);
        // graph.addEdge("B", "C", 0);
        // graph.addEdge("C", "A", 0);
        // System.out.println(graph.hasCycle());

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A", "B", 3);
        graph.addEdge("B", "D", 4);
        graph.addEdge("C", "D", 5);
        graph.addEdge("A", "C", 1);
        graph.addEdge("B", "C", 2);
        var tree = graph.getMinimumSpanningTree();
        tree.print();
    }
}