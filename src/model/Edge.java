package model;

public class Edge
{
    Cities source;
    Cities destination;
    int weight;
    RouteColor routeColor;

    public Edge(Cities source, Cities destination, int weight, RouteColor routeColor)
    {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        this.routeColor = routeColor;
    }
}