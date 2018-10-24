package model;

public class Player
{
    private String name;
    private int score;
    private char trainColor;
    private int trainsRemaining = 45;
    private Cards cards;

    /**
     * L - Blue <br>
     * R - Red <br>
     * G - Green <br>
     * Y - Yellow <br>
     * B - Black
     * @param name Player's name.
     * @param trainColor Character representing train color.
     */
    public Player(String name, char trainColor)
    {
        cards = new Cards();

        score = 0;

        this.name = name;
        this.trainColor = trainColor;
    }

    // ========== getters ==========

    /**
     * @return Player's name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return Player's score.
     */
    public int getScore()
    {
        return score;
    }

    /**
     * L - Blue <br>
     * R - Red <br>
     * G - Green <br>
     * Y - Yellow <br>
     * B - Black <br>
     * @return Player's train color.
     */
    public char getTrainColor()
    {
        return trainColor;
    }

    /**
     * @return Player's remaining trains.
     */
    public int getTrainsRemaining()
    {
        return trainsRemaining;
    }

    /**
     * @return Player's cards.
     */
    public Cards getCards()
    {
        return cards;
    }

    // ========== setters ==========

    /**
     * @param score Initialize score.
     */
    public void setScore(int score)
    {
        this.score = score;
    }

    /**
     * @param trainsRemaining Player's remaining trains.
     */
    public void setTrainsRemaining(int trainsRemaining)
    {
        this.trainsRemaining = trainsRemaining;
    }

    /**
     * @param cards Player's cards.
     */
    public void setCards(Cards cards)
    {
        this.cards = cards;
    }
}
