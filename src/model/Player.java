package model;

public class Player
{
    private String name;
    private int score;
    private char trainColor;
    private int trainsRemaining = 45;
    private Cards pieces;

    public Player(String name, char trainColor)
    {
        pieces = new Cards();

        score = 0;

        this.name = name;
        this.trainColor = trainColor;
    }

    // ========== getters/setters ==========


}
