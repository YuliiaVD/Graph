package app;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(5);
        graph.printGraph();

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(1, 3);

        // Print the adjacency matrix representation of the
        // graph
        System.out.println(
                "Graph Representation (Adjacency Matrix):");
        graph.printGraph();

        //Check if there's vertex in matrix
        System.out.println(
                "Checking if there's a vertex in Adjacency Matrix: "
                        + graph.hasVertex(4));
        System.out.println(
                "Checking if there's a vertex in Adjacency Matrix: "
                        + graph.hasVertex(5));

        // Check if there's an edge between vertices 0 and 1
        System.out.println(
                "Checking if there's an edge between vertices 0 and 1: "
                        + graph.hasEdge(0, 1));

        // Check if there's an edge between vertices 0 and 3
        System.out.println(
                "Checking if there's an edge between vertices 0 and 3: "
                        + graph.hasEdge(0, 3));

        // Remove the edge between vertices 1 and 2
        graph.removeEdge(1, 2);
        System.out.println(
                "After removing edge between vertices 1 and 2:");

        graph.printGraph();

        //Remove the Vertex from Graph
        graph.removeVertex(3);
        System.out.println(
                "After removing Vertex from Graph:");

        graph.printGraph();

    }
}
