package model;

import java.util.Scanner;

public class Controller
{
    private Cards cards;

    public Controller() {
        cards = new Cards();
    }

    public static void main(String[] args)
    {
        // init game with board, player, cards
        // player does one of three things
        // alternate players


        Board board = new Board();
        Player jas = new Player("Jas", 'O');
        Player rey = new Player("Rey", 'R');
        Player gabe = new Player("Gabe", 'B');

        // this is our end condition when a player has <= 2 trains left,
        // at game init players have 45 each
        boolean playersHaveTrains = true;
        boolean temp = false;

        // this is the main game loop
        while(playersHaveTrains)
        {
            // jas's turn first
            // rey's turn second
            // gabe's turn third
            // we run each object's turn phase
            // here we have players play
            temp = playerTurn(jas);
            temp = playerTurn(rey);
            temp = playerTurn(gabe);

            // the SOLE end condition for the game
            if (rey.getTrainsRemaining() <= 2 || jas.getTrainsRemaining() <= 2 || gabe.getTrainsRemaining() <= 2) break;
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
        return true;
    }


    private static boolean drawDestinationTickets(Player player) {
        return true;
    }

}
