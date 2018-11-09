package model;

import java.util.LinkedList;

public class Graph
{
    private int vertices;
    private LinkedList<Edge>[] adjList;

    public Graph(int vertices)
    {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];

        //initialize adjacency lists for all the vertices
        for (int i = 0; i < vertices; ++i)
        {
            adjList[i] = new LinkedList<>();
        }
    }

    public void printGraph()
    {
        for (int i = 0; i < vertices; ++i)
        {
            LinkedList<Edge> list = adjList[i];

            for (int j = 0; j < list.size(); ++j)
            {
                System.out.println("vertex-" + i + " is connected to " + list.get(j).destination + " with weight " + list.get(j).weight);
            }
        }
    }

    private void addEdge(Cities source, Cities destination, int weight)
    {
        int sourceCode = source.ordinal();
        int destinationCode = destination.ordinal();

        Edge edge = new Edge(sourceCode, destinationCode, weight);
        adjList[sourceCode].addFirst(edge);
    }

    /**
     * Currently ONLY for testing graph.
     * @param args
     */
    public static void main(String[] args)
    {
        int vertices = 3;
        Graph graph = new Graph(vertices);

        // top left corner of board
        graph.addEdge(Cities.VANCOUVER, Cities.CALGARY, 3);
        graph.addEdge(Cities.VANCOUVER, Cities.SEATTLE, 1);
        graph.addEdge(Cities.SEATTLE, Cities.CALGARY, 4);

        graph.printGraph();
    }
}