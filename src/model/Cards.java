package model;

import java.util.Arrays;
import java.util.Random;

public class Cards
{
    public static final int SHUFFLE_MULTIPLIER = 1;
    public static final int TRAINCARDS_LIMIT = 110;
    public static final int DESTINATIONCARDS_LIMIT = 30;

    private RouteColor[] trainCards;
    private DestinationCard[] destinationCards;

    /**
     * Initializes, fills, and randomizes trainCards <br>
     * and destinationCards SHUFFLE_MULTIPLIER number of times.
     */
    public Cards()
    {
        trainCards = new RouteColor[TRAINCARDS_LIMIT];
        destinationCards = new DestinationCard[DESTINATIONCARDS_LIMIT];

        fillCards();

        for (int i = 0; i < SHUFFLE_MULTIPLIER; ++i)
        {
            randomizeArray(trainCards);
            randomizeArray(destinationCards);
        }
    }

    // ========== getters ==========

    // ========== setters ==========

    // ========== helpers  ==========

    private <T> void randomizeArray(T[] array)
    {
        Random rand = new Random();

        for (int i = 0; i < array.length; ++i)
        {
            int randomPosition = rand.nextInt(array.length);
            T temp = array[i];

            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }
    }

    private void fillCards()
    {
        Arrays.fill(trainCards, 0, 11, RouteColor.PURPLE);
        Arrays.fill(trainCards, 12, 23, RouteColor.WHITE);
        Arrays.fill(trainCards, 24, 35, RouteColor.BLUE);
        Arrays.fill(trainCards, 36, 47, RouteColor.YELLOW);
        Arrays.fill(trainCards, 48, 59, RouteColor.ORANGE);
        Arrays.fill(trainCards, 60, 71, RouteColor.BLACK);
        Arrays.fill(trainCards, 72, 83, RouteColor.RED);
        Arrays.fill(trainCards, 84, 95, RouteColor.GREEN);
        Arrays.fill(trainCards, 96, 110, RouteColor.ANY); // 14 wildcards

        destinationCards[0] = new DestinationCard(Cities.DENVER, Cities.EL_PASO, 4);
        destinationCards[1] = new DestinationCard(Cities.KANSAS_CITY, Cities.HOUSTON, 5);
        destinationCards[2] = new DestinationCard(Cities.NEW_YORK, Cities.ATLANTA, 6);
        destinationCards[3] = new DestinationCard(Cities.CHICAGO, Cities.NEW_ORLEANS, 7);
        destinationCards[4] = new DestinationCard(Cities.CALGARY, Cities.SALT_LAKE_CITY, 7);
        destinationCards[5] = new DestinationCard(Cities.HELENA, Cities.LOS_ANGELES, 8);
        destinationCards[6] = new DestinationCard(Cities.DULUTH, Cities.HOUSTON, 8);
        destinationCards[7] = new DestinationCard(Cities.SAULT_ST_MARIE, Cities.NASHVILLE, 8);
        destinationCards[8] = new DestinationCard(Cities.MONTREAL, Cities.ATLANTA, 9);
        destinationCards[9] = new DestinationCard(Cities.SAULT_ST_MARIE, Cities.OKLAHOMA_CITY, 9);
        destinationCards[10] = new DestinationCard(Cities.SEATTLE, Cities.LOS_ANGELES, 9);
        destinationCards[11] = new DestinationCard(Cities.CHICAGO, Cities.SANTA_FE, 9);
        destinationCards[12] = new DestinationCard(Cities.DULUTH, Cities.EL_PASO, 10);
        destinationCards[13] = new DestinationCard(Cities.TORONTO, Cities.MIAMI, 10);
        destinationCards[14] = new DestinationCard(Cities.PORTLAND, Cities.PHOENIX, 11);
        destinationCards[15] = new DestinationCard(Cities.DALLAS, Cities.NEW_YORK, 11);
        destinationCards[16] = new DestinationCard(Cities.DENVER, Cities.PITTSBURG, 11);
        destinationCards[17] = new DestinationCard(Cities.WINNIPEG, Cities.LITTLE_ROCK, 11);
        destinationCards[18] = new DestinationCard(Cities.WINNIPEG, Cities.HOUSTON, 12);
        destinationCards[19] = new DestinationCard(Cities.BOSTON, Cities.MIAMI, 12);
        destinationCards[20] = new DestinationCard(Cities.VANCOUVER, Cities.SANTA_FE, 13);
        destinationCards[21] = new DestinationCard(Cities.CALGARY, Cities.PHOENIX, 13);
        destinationCards[22] = new DestinationCard(Cities.MONTREAL, Cities.NEW_ORLEANS, 13);
        destinationCards[23] = new DestinationCard(Cities.LOS_ANGELES, Cities.CHICAGO, 16);
        destinationCards[24] = new DestinationCard(Cities.SAN_FRANCISCO, Cities.ATLANTA, 17);
        destinationCards[25] = new DestinationCard(Cities.PORTLAND, Cities.NASHVILLE, 17);
        destinationCards[26] = new DestinationCard(Cities.VANCOUVER, Cities.MONTREAL, 20);
        destinationCards[27] = new DestinationCard(Cities.LOS_ANGELES, Cities.MIAMI, 20);
        destinationCards[28] = new DestinationCard(Cities.LOS_ANGELES, Cities.NEW_YORK, 21);
        destinationCards[29] = new DestinationCard(Cities.SEATTLE, Cities.NEW_YORK, 22);
    }
}
