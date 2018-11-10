package model;

public class Edge
{
    private Cities source;
    private Cities destination;
    private RouteColor routeColor;
    private int weight;
    private static int numberOfEdges = 0;

    public Cities getSource() { return source; }
    public Cities getDestination() { return destination; }
    public int getWeight() { return weight; }
    public RouteColor getRouteColor() { return routeColor; }
    public static int getNumberOfEdges() { return numberOfEdges; }

    public Edge(Cities source, Cities destination, RouteColor routeColor, int weight)
    {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        this.routeColor = routeColor;

        ++numberOfEdges;
    }
}