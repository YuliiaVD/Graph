package app;

public class Graph {

    private boolean[][] adjacencyMatrix;
    private int numVertices;


    public void addVertex(int vertex) {
        this.numVertices = vertex;
        adjacencyMatrix = new boolean[vertex][vertex];
    }

    public  void removeVertex(int vertex) {
        // checking if the vertex is present
        if (vertex > numVertices) {
            System.out.println("\nVertex not present!");
        }
        else {

            // removing the vertex
            while (vertex < numVertices-1) {

                // shifting the rows to left side
                for (int i = 0; i < numVertices; ++i) {
                    adjacencyMatrix[i][vertex] = adjacencyMatrix[i][vertex + 1];
                }

                // shifting the columns upwards
                for (int i = 0; i < numVertices; ++i) {
                    adjacencyMatrix[vertex][i] = adjacencyMatrix[vertex + 1][i];
                }
                vertex++;
            }

            // decreasing the number of vertices
            numVertices--;
        }
   }

    //Method to check whether the vertex exists
    public boolean hasVertex(int vertex)
    {
        return vertex < getNumVertices();
    }

    public int getNumVertices() {
        return numVertices;
    }

    // Method to add an edge between two vertices
    public void addEdge(int source, int destination)
    {
        adjacencyMatrix[source][destination] = true;
        adjacencyMatrix[destination][source] = true;
    }

    // Method to remove an edge between two vertices
    public void removeEdge(int source, int destination)
    {
        adjacencyMatrix[source][destination] = false;
        adjacencyMatrix[destination][source] = false;
    }

    // Method to check whether an edge exists between two
    // vertices
    public boolean hasEdge(int source, int destination)
    {
        return adjacencyMatrix[source][destination];
    }

    // Method to print the adjacency matrix representation
    // of the graph
    public void printGraph()
    {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(
                        adjacencyMatrix[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

}
