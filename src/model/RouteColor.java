package model;

public enum RouteColor
{
    PURPLE,
    BLUE,
    ORANGE,
    WHITE,
    GREEN,
    YELLOW,
    BLACK,
    RED,
    ANY;

    private static RouteColor[] allValues = values();

    public static RouteColor fromOrdinal(int n) { return allValues[n]; }
}
