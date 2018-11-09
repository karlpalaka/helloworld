package model;

import java.util.Scanner;

public class Controller
{
    public static void main(String[] args)
    {
        Graph gameBoard = new Graph(Cities.values().length);
        Player jas = new Player("Jas", TeamColor.BLACK);
        Player rey = new Player("Rey", TeamColor.RED);
        Player gabe = new Player("Gabe", TeamColor.GREEN);

        // this is our end condition when a player has <= 2 trains left
        boolean playersHaveTrains = true;
        boolean temp = false;

        // main game loop
        while(playersHaveTrains)
        {
            temp = playerTurn(jas);
            temp = playerTurn(rey);
            temp = playerTurn(gabe);

            // the SOLE end condition for the game
            if (rey.getTrainPieces() <= 2 || jas.getTrainPieces() <= 2 || gabe.getTrainPieces() <= 2) break;
        }
    }

    private static boolean playerTurn(Player player)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("1 for Draw Train Cards");
        System.out.println("2 for Claim a Route");
        System.out.println("3 for Draw Destination Tickets");
        System.out.print("Choose an option: ");

        int choice = input.nextInt();

        switch (choice)
        {
            case 1:
                return drawTrainCards(player);
            case 2:
                return claimRoute(player);
            case 3:
                return drawDestinationTickets(player);
        }

        return false;
    }

    private static boolean drawTrainCards(Player player) {

        int timesDrawn = 0;

        do {
            System.out.println("1 for Draw From Face Up Deck");
            System.out.println("2 for Draw From Face Down Deck");
            System.out.println("3 to stop drawing");

            boolean success = true;
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Drawing from face up Deck");
                    break;
                case 2:
                    System.out.println("Drawing from face down deck");
                    break;
                case 3:
                    if (timesDrawn == 0) {
                        System.out.println("You must draw at least 1 card from either deck");
                        success = false;
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            if (success)
                timesDrawn++;
        } while (timesDrawn < 2);

        return true;
    }


    private static boolean claimRoute(Player player) {
        System.out.println("Choose a route:");
        System.out.println("Choose a Train Car color");
        // does player have
        return true;
    }


    private static boolean drawDestinationTickets(Player player) {
        // draw 3 and show the player
        System.out.println("Choose which ones to keep: 1, 2, 3.");
        return true;
    }

}
