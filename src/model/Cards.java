package model;

import java.util.Arrays;
import java.util.Random;

public class Cards
{
    public static int CARD_LIMIT = 96;

    // todo should be 30 for final game, but here are 9 destination cards
    // todo also missing points per card
    private char[][] destinationCards = {{0, 0, 2, 0}, // G
                                         {0, 0, 0, 2}, // P
                                         {0, 2, 0, 4}, // W
                                         {0, 2, 2, 2}, // !
                                         {2, 0, 4, 0}, // R
                                         {2, 4, 4, 4}, // Y
                                         {4, 0, 4, 2}, // B
                                         {4, 2, 4, 2}, // O
                                         {0, 4, 2, 4}}; // L (Blue)

    // todo should be 110 for final game, missing 14 wildcards
    private char[] trainCards;

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

        randomizeArray(trainCards);
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
     * Used for player placement conditions. <br>
     * If player has enough of a certain color, <br>
     * they can place trains on the Board.
     * @return Array of cards.
     */
    public char[] getTrainCards()
    {
        return trainCards;
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

    private static char[] randomizeArray(char[] array)
    {
        Random rand = new Random();

        for (int i = 0; i < array.length; ++i)
        {
            int randomPosition = rand.nextInt(array.length);
            char temp = array[i];

            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

        return array;
    }
}
