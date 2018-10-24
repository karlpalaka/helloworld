package model;

import java.util.Arrays;

public class Cards
{ //
    // should be 30 for final game, but here are 9 destination cards
    private char[][] destinationCards = {{0, 0, 2, 0}, // G
                                         {0, 0, 0, 2}, // P
                                         {0, 2, 0, 4}, // W
                                         {0, 2, 2, 2}, // !
                                         {2, 0, 4, 0}, // R
                                         {2, 4, 4, 4}, // Y
                                         {4, 0, 4, 2}, // B
                                         {4, 2, 4, 2}, // O
                                         {0, 4, 2, 4}}; // L (Blue)

    // should be 110 for final game, missing 14 wildcards
    private char[] trainCards;

    public Cards()
    {
        trainCards = new char[96];

        Arrays.fill(trainCards, 0,  11, 'G');
        Arrays.fill(trainCards, 12, 23, 'P');
        Arrays.fill(trainCards, 24, 35, 'W');
        Arrays.fill(trainCards, 36, 47, 'R');
        Arrays.fill(trainCards, 48, 59, 'Y');
        Arrays.fill(trainCards, 60, 71, 'B');
        Arrays.fill(trainCards, 72, 83, 'O');
        Arrays.fill(trainCards, 84, 95, 'L');
    }

    // ========== getters ==========

    public char[][] getDestinationCards()
    {
        return destinationCards;
    }

    public char[] getTrainCards()
    {
        return trainCards;
    }

    // ========== setters ==========

    public void setTrainCards(char[] trainCards)
    {
        this.trainCards = trainCards;
    }
}
