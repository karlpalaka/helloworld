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

    private void addEdge(Cities source, Cities destination, RouteColor routeColor, int weight)
    {
        int sourceCode = source.ordinal();
        int destinationCode = destination.ordinal();

        Edge edge = new Edge(sourceCode, destinationCode, weight, routeColor);
        adjList[sourceCode].addFirst(edge);
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
        graph.addEdge(Cities.SEATTLE, Cities.HELENA, RouteColor.YELLOW, 6);
        graph.addEdge(Cities.HELENA, Cities.SALT_LAKE_CITY, RouteColor.PURPLE, 3);
        graph.addEdge(Cities.SALT_LAKE_CITY, Cities.LAS_VEGAS, RouteColor.ORANGE, 3);
        graph.addEdge(Cities.LAS_VEGAS, Cities.LOS_ANGELES, RouteColor.ANY, 2);
        graph.addEdge(Cities.LOS_ANGELES, Cities.PHOENIX, RouteColor.ANY, 3);
        graph.addEdge(Cities.LOS_ANGELES, Cities.EL_PASO, RouteColor.BLACK, 6);
        graph.addEdge(Cities.EL_PASO, Cities.PHOENIX, RouteColor.ANY, 3);
        graph.addEdge(Cities.EL_PASO, Cities.HOUSTON, RouteColor.GREEN, 6);
        graph.addEdge(Cities.PHOENIX, Cities.SANTA_FE, RouteColor.ANY, 3);
        graph.addEdge(Cities.PHOENIX, Cities.DENVER, RouteColor.WHITE, 5);
        graph.addEdge(Cities.DENVER, Cities.SALT_LAKE_CITY, RouteColor.YELLOW, 3);
        graph.addEdge(Cities.DENVER, Cities.SALT_LAKE_CITY, RouteColor.RED, 3);

        graph.addEdge(Cities.DENVER, Cities.KANSAS_CITY, RouteColor.BLACK, 4);
        graph.addEdge(Cities.DENVER, Cities.KANSAS_CITY, RouteColor.ORANGE, 4);
        graph.addEdge(Cities.DENVER, Cities.OKLAHOMA_CITY, RouteColor.RED, 4);
        graph.addEdge(Cities.DENVER, Cities.SANTA_FE, RouteColor.ANY, 2);
        graph.addEdge(Cities.DENVER, Cities.HELENA, RouteColor.GREEN, 4);
        graph.addEdge(Cities.DENVER, Cities.OMAHA, RouteColor.PURPLE, 4);

        graph.addEdge(Cities.OKLAHOMA_CITY, Cities.SANTA_FE, RouteColor.BLUE, 3);
        graph.addEdge(Cities.SANTA_FE, Cities.EL_PASO, RouteColor.ANY, 2);
        graph.addEdge(Cities.OKLAHOMA_CITY, Cities.EL_PASO, RouteColor.YELLOW, 5);
        graph.addEdge(Cities.OKLAHOMA_CITY, Cities.DALLAS, RouteColor.ANY, 2);
        graph.addEdge(Cities.OKLAHOMA_CITY, Cities.DALLAS, RouteColor.ANY, 2);
        graph.addEdge(Cities.OKLAHOMA_CITY, Cities.LITTLE_ROCK, RouteColor.ANY, 2);
        graph.addEdge(Cities.OKLAHOMA_CITY, Cities.KANSAS_CITY, RouteColor.ANY, 2);
        graph.addEdge(Cities.OKLAHOMA_CITY, Cities.KANSAS_CITY, RouteColor.ANY, 2);

        graph.addEdge(Cities.DALLAS, Cities.EL_PASO, RouteColor.RED, 4);
        graph.addEdge(Cities.DALLAS, Cities.HOUSTON, RouteColor.ANY, 1);
        graph.addEdge(Cities.DALLAS, Cities.HOUSTON, RouteColor.ANY, 1);
        graph.addEdge(Cities.DALLAS, Cities.LITTLE_ROCK, RouteColor.ANY, 2);

        graph.addEdge(Cities.HOUSTON, Cities.NEW_ORLEANS, RouteColor.ANY, 2);
        graph.addEdge(Cities.NEW_ORLEANS, Cities.LITTLE_ROCK, RouteColor.GREEN, 3);
        graph.addEdge(Cities.NEW_ORLEANS, Cities.ATLANTA, RouteColor.YELLOW, 4);
        graph.addEdge(Cities.NEW_ORLEANS, Cities.ATLANTA, RouteColor.ORANGE, 4);
        graph.addEdge(Cities.NEW_ORLEANS, Cities.MIAMI, RouteColor.RED, 6);

        graph.addEdge(Cities.ATLANTA, Cities.MIAMI, RouteColor.BLUE, 5);
        graph.addEdge(Cities.ATLANTA, Cities.CHARLESTON, RouteColor.ANY, 2);
        graph.addEdge(Cities.ATLANTA, Cities.RALEIGH, RouteColor.ANY, 2);
        graph.addEdge(Cities.ATLANTA, Cities.RALEIGH, RouteColor.ANY, 2);
        graph.addEdge(Cities.ATLANTA, Cities.NASHVILLE, RouteColor.ANY, 1);

        graph.addEdge(Cities.LITTLE_ROCK, Cities.NASHVILLE, RouteColor.WHITE, 3);
        graph.addEdge(Cities.LITTLE_ROCK, Cities.SAINT_LOUIS, RouteColor.ANY, 2);
        graph.addEdge(Cities.SAINT_LOUIS, Cities.NASHVILLE, RouteColor.ANY, 2);

        graph.addEdge(Cities.KANSAS_CITY, Cities.SAINT_LOUIS, RouteColor.PURPLE, 2);
        graph.addEdge(Cities.KANSAS_CITY, Cities.SAINT_LOUIS, RouteColor.BLUE, 2);
        graph.addEdge(Cities.KANSAS_CITY, Cities.OMAHA, RouteColor.ANY, 1);
        graph.addEdge(Cities.KANSAS_CITY, Cities.OMAHA, RouteColor.ANY, 1);

        graph.addEdge(Cities.OMAHA, Cities.CHICAGO, RouteColor.BLUE, 4);
        graph.addEdge(Cities.OMAHA, Cities.DULUTH, RouteColor.ANY, 2);
        graph.addEdge(Cities.OMAHA, Cities.DULUTH, RouteColor.ANY, 2);
        graph.addEdge(Cities.OMAHA, Cities.HELENA, RouteColor.RED, 5);

        graph.addEdge(Cities.DULUTH, Cities.HELENA, RouteColor.ORANGE, 6);
        graph.addEdge(Cities.DULUTH, Cities.WINNIPEG, RouteColor.BLACK, 4);
        graph.addEdge(Cities.DULUTH, Cities.SAULT_ST_MARIE, RouteColor.ANY, 3);
        graph.addEdge(Cities.DULUTH, Cities.TORONTO, RouteColor.PURPLE, 6);
        graph.addEdge(Cities.DULUTH, Cities.CHICAGO, RouteColor.RED, 3);

        graph.addEdge(Cities.CHICAGO, Cities.TORONTO, RouteColor.WHITE, 4);
        graph.addEdge(Cities.CHICAGO, Cities.PITTSBURG, RouteColor.ORANGE, 3);
        graph.addEdge(Cities.CHICAGO, Cities.PITTSBURG, RouteColor.BLACK, 3);
        graph.addEdge(Cities.CHICAGO, Cities.SAINT_LOUIS, RouteColor.GREEN, 2);

        graph.addEdge(Cities.SAINT_LOUIS, Cities.PITTSBURG, RouteColor.GREEN, 5);
        graph.addEdge(Cities.PITTSBURG, Cities.NASHVILLE, RouteColor.YELLOW, 4);
        graph.addEdge(Cities.PITTSBURG, Cities.RALEIGH, RouteColor.ANY, 2);
        graph.addEdge(Cities.PITTSBURG, Cities.WASHINGTON, RouteColor.ANY, 2);
        graph.addEdge(Cities.PITTSBURG, Cities.NEW_YORK, RouteColor.GREEN, 2);
        graph.addEdge(Cities.PITTSBURG, Cities.NEW_YORK, RouteColor.WHITE, 2);
        graph.addEdge(Cities.PITTSBURG, Cities.TORONTO, RouteColor.ANY, 2);

        graph.addEdge(Cities.NASHVILLE, Cities.RALEIGH, RouteColor.BLACK, 3);
        graph.addEdge(Cities.RALEIGH, Cities.WASHINGTON, RouteColor.ANY, 2);
        graph.addEdge(Cities.RALEIGH, Cities.WASHINGTON, RouteColor.ANY, 2);
        graph.addEdge(Cities.RALEIGH, Cities.CHARLESTON, RouteColor.ANY, 2);
        graph.addEdge(Cities.CHARLESTON, Cities.MIAMI, RouteColor.PURPLE, 4);

        graph.addEdge(Cities.WASHINGTON, Cities.NEW_YORK, RouteColor.ORANGE, 2);
        graph.addEdge(Cities.WASHINGTON, Cities.NEW_YORK, RouteColor.BLACK, 2);
        graph.addEdge(Cities.NEW_YORK, Cities.BOSTON, RouteColor.RED, 2);
        graph.addEdge(Cities.NEW_YORK, Cities.BOSTON, RouteColor.YELLOW, 2);
        graph.addEdge(Cities.NEW_YORK, Cities.MONTREAL, RouteColor.BLUE, 3);

        graph.addEdge(Cities.BOSTON, Cities.MONTREAL, RouteColor.ANY, 2);
        graph.addEdge(Cities.BOSTON, Cities.MONTREAL, RouteColor.ANY, 2);

        graph.addEdge(Cities.MONTREAL, Cities.TORONTO, RouteColor.ANY, 3);
        graph.addEdge(Cities.MONTREAL, Cities.SAULT_ST_MARIE, RouteColor.BLACK, 5);
        graph.addEdge(Cities.SAULT_ST_MARIE, Cities.TORONTO, RouteColor.ANY, 2);

        graph.addEdge(Cities.SAULT_ST_MARIE, Cities.WINNIPEG, RouteColor.ANY, 6);
        graph.addEdge(Cities.WINNIPEG, Cities.HELENA, RouteColor.BLUE, 4);
        graph.addEdge(Cities.HELENA, Cities.CALGARY, RouteColor.ANY, 4);
        graph.addEdge(Cities.CALGARY, Cities.WINNIPEG, RouteColor.WHITE, 6);

        graph.printGraph();
    }
}