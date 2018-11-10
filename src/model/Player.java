package model;

public class Player
{
    private String name;
    private TeamColor teamColor;
    private RouteColor[] trainCards;
    // need to add destination cards
    private int trainPieces;
    private int score;

    /**
     * L - Blue <br>
     * R - Red <br>
     * G - Green <br>
     * Y - Yellow <br>
     * B - Black
     * @param name Player's name.
     * @param teamColor Character representing train color.
     */
    public Player(String name, TeamColor teamColor)
    {
        score = 0;
        trainPieces = 45;
        trainCards = new RouteColor[Cards.TRAINCARDS_LIMIT];

        this.name = name;
        this.teamColor = teamColor;
    }

    // ========== other ==========

    /**
     * G - Green <br>
     * P - Pink <br>
     * W - White <br>
     * ! - Wildcard <br>
     * R - Red <br>
     * Y - Yellow <br>
     * B - Blue <br>
     * O - Orange <br>
     * L - Blue
     * @param routeColor The color character representing color <br>
     * of card.
     */
    public void addCardToHand(RouteColor routeColor) { trainCards[trainCards.length] = routeColor; }

    // ========== getters ==========

    /**
     * @return Player's name.
     */
    public String getName() { return name; }

    /**
     * @return Player's score.
     */
    public int getScore() { return score; }

    /**
     * L - Blue <br>
     * R - Red <br>
     * G - Green <br>
     * Y - Yellow <br>
     * B - Black <br>
     * @return Player's train color.
     */
    public TeamColor getTeamColor() { return teamColor; }

    /**
     * @return Player's remaining trains.
     */
    public int getTrainPieces() { return trainPieces; }

    /**
     * @return Player's trainCards.
     */
    public RouteColor[] getTrainCards() { return trainCards; }

    // ========== setters ==========

    /**
     * @param score Initialize score.
     */
    public void setScore(int score) { this.score = score; }

    /**
     * @param trainPieces Player's remaining trains.
     */
    public void setTrainPieces(int trainPieces) { this.trainPieces = trainPieces; }

    /**
     * @param trainCards Player's trainCards.
     */
    public void setTrainCards(RouteColor[] trainCards) { this.trainCards = trainCards; }
}
