package model;

public class Edge
{
    int source;
    int destination;
    int weight;
    RouteColor routeColor;

    public Edge(int source, int destination, int weight, RouteColor routeColor)
    {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        this.routeColor = routeColor;
    }
}