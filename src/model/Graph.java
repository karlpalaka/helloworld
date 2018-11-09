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
        String sourceString;
        String destinationString;
        String distanceString;
        
        for (int i = 0; i < vertices; ++i)
        {
            LinkedList<Edge> list = adjList[i];

            for (int j = 0; j < list.size(); ++j)
            {   
                sourceString = adjList[i].get(j).source.toString();
                destinationString = adjList[i].get(j).destination.toString();
                distanceString = Integer.toString(adjList[i].get(j).weight);
                
                System.out.println(sourceString + " to " + destinationString + " distance " + distanceString);
            }
        }
    }

    private void addEdge(Cities source, Cities destination, RouteColor routeColor, int weight)
    {
        Edge edge = new Edge(source, destination, weight, routeColor);
        adjList[source.ordinal()].addFirst(edge);
    }

    /**
     * Currently ONLY for testing graph.
     * @param args
     */
    public static void main(String[] args)
    {
        int vertices = Cities.values().length;
        Graph graph = new Graph(vertices);

        // top left corner of board
        graph.addEdge(Cities.VANCOUVER, Cities.CALGARY, RouteColor.ANY, 3);
        graph.addEdge(Cities.VANCOUVER, Cities.SEATTLE, RouteColor.ANY, 1);
        graph.addEdge(Cities.VANCOUVER, Cities.SEATTLE, RouteColor.ANY, 1);
        graph.addEdge(Cities.SEATTLE, Cities.CALGARY, RouteColor.ANY, 4);
        graph.addEdge(Cities.SEATTLE, Cities.PORTLAND, RouteColor.ANY, 1);
        graph.addEdge(Cities.SEATTLE, Cities.PORTLAND, RouteColor.ANY, 1);
        graph.addEdge(Cities.PORTLAND, Cities.SAN_FRANCISCO, RouteColor.GREEN, 5);
        graph.addEdge(Cities.PORTLAND, Cities.SAN_FRANCISCO, RouteColor.PURPLE, 5);
        graph.addEdge(Cities.PORTLAND, Cities.SALT_LAKE_CITY, RouteColor.BLUE, 6);
        graph.addEdge(Cities.SAN_FRANCISCO, Cities.LOS_ANGELES, RouteColor.YELLOW, 3);
        graph.addEdge(Cities.SAN_FRANCISCO, Cities.LOS_ANGELES, RouteColor.PURPLE, 3);
        graph.addEdge(Cities.SAN_FRANCISCO, Cities.SALT_LAKE_CITY, RouteColor.WHITE, 5);
        graph.addEdge(Cities.SAN_FRANCISCO, Cities.SALT_LAKE_CITY, RouteColor.ORANGE, 5);

        graph.printGraph();
    }
}