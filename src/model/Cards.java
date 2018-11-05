package model;

import java.util.Arrays;
import java.util.Random;

public class Cards
{
    public static final int CARD_LIMIT = 96;
    public static final int SHUFFLE_TIMES = 1; // large values will slow game down

    // todo should be 30 for final game, but here are 9 destination cards
    /**
     * A destination card is a pair of coordinates. <br>
     * Consider it as (x1, y1) and (x2, y2). <br>
     * It is used for specifying conditions for <br>
     * to earn points. The last column specifies <br>
     * score earned from completed destination.
     */
    @Deprecated
    private char[][] destinationCards = {{0, 0, 2, 0, 3}, // G
                                           {0, 0, 0, 2, 3}, // P
                                           {0, 2, 0, 4, 3}, // W
                                           {0, 2, 2, 2, 1}, // ! - 1 point because easiest
                                           {2, 0, 4, 0, 3}, // R
                                           {2, 4, 4, 4, 3}, // Y
                                           {4, 0, 4, 2, 3}, // B
                                           {4, 2, 4, 2, 3}, // O
                                           {0, 4, 2, 4, 3}}; // L (Blue)

    // todo should be 110 for final game, missing 14 wildcards
    private char[] trainCards;

    /**
     * Initializes, fills, and randomizes trainCards <br>
     * SHUFFLE_TIMES number of times.
     */
    public Cards()
    {
        trainCards = new char[CARD_LIMIT];

        Arrays.fill(trainCards, 0,  11, 'G');
        Arrays.fill(trainCards, 12, 23, 'P');
        Arrays.fill(trainCards, 24, 35, 'W');
        Arrays.fill(trainCards, 36, 47, 'R');
        Arrays.fill(trainCards, 48, 59, 'Y');
        Arrays.fill(trainCards, 60, 71, 'B');
        Arrays.fill(trainCards, 72, 83, 'O');
        Arrays.fill(trainCards, 84, 95, 'L');

        for (int i = 0; i < SHUFFLE_TIMES; ++i)
        {
            randomizeArray(trainCards);
        }
    }

    // ========== getters ==========

    /**
     * A destination card is a pair of coordinates. <br>
     * Consider it as (x1, y1) and (x2, y2). <br>
     * It is used for specifying conditions for <br>
     * to earn points.
     * @return Destination cards.
     */
    public char[][] getDestinationCards()
    {
        return destinationCards;
    }

    /**
     * Returns a row of destinationCards. <br>
     * A destination card is a pair of coordinates. <br>
     * Consider it as (x1, y1) and (x2, y2). <br>
     * It is used for specifying conditions for <br>
     * to earn points.
     * @param r Specifies row to return.
     * @return Row specified by r.
     */
    public char[] getDesintationCard(int r)
    {
        if (r < 0 || r > 5) throw new ArrayIndexOutOfBoundsException();

        char[] temp = new char[5];

        for (int i = 0; i < 5; ++i)
        {
            temp[i] = destinationCards[r][i];
        }

        return temp;
    }

    /**
     * Used for player placement conditions. <br>
     * If player has enough of a certain color, <br>
     * they can place trains on the Board.
     * @return Array of cards.
     */
    public char[] getTrainCards()
    {
        return this.trainCards;
    }

    // ========== setters ==========

    /**
     * Used for player placement conditions. <br>
     * If player has enough of a certain color, <br>
     * they can place trains on the Board.
     * @param trainCards Array of cards.
     */
    public void setTrainCards(char[] trainCards)
    {
        this.trainCards = trainCards;
    }

    // ========== helpers  ==========

    private static void randomizeArray(char[] array)
    {
        Random rand = new Random();

        for (int i = 0; i < array.length; ++i)
        {
            int randomPosition = rand.nextInt(array.length);
            char temp = array[i];

            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }
    }
}
