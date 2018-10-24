package model;

public class Player
{
    private String name;
    private int score;
    private char trainColor;
    private int trainsRemaining = 45;
    private Cards cards;

    public Player(String name, char trainColor)
    {
        cards = new Cards();

        score = 0;

        this.name = name;
        this.trainColor = trainColor;
    }

    // ========== getters ==========

    public String getName()
    {
        return name;
    }

    public int getScore()
    {
        return score;
    }

    public char getTrainColor()
    {
        return trainColor;
    }

    public int getTrainsRemaining()
    {
        return trainsRemaining;
    }

    public Cards getCards()
    {
        return cards;
    }

    // ========== setters ==========

    public void setScore(int score)
    {
        this.score = score;
    }

    public void setTrainsRemaining(int trainsRemaining)
    {
        this.trainsRemaining = trainsRemaining;
    }

    public void setCards(Cards cards)
    {
        this.cards = cards;
    }
}
