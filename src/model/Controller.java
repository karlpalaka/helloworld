package model;

import java.util.Scanner;

public class Controller
{
    public static void main(String[] args)
    {
        // init game with board, player, cards
        // player does one of three things
        // alternate players
        Scanner input = new Scanner(System.in);

        Board board = new Board();
        Player jas = new Player("Jas", 'O');
        Player rey = new Player("Rey", 'R');
        Player gabe = new Player("Gabe", 'B');

        // this is our end condition when a player has <= 2 trains left,
        // at game init players have 45 each
        boolean playersHaveTrains = true;
        int option;

        // this is the main game loop
        while(playersHaveTrains)
        {
            // jas's turn first
            // rey's turn second
            // gabe's turn third
            // we run each object's turn phase
            // here we have players play

            System.out.println("1 for Draw Train Cards");
            System.out.println("2 for Claim a Route");
            System.out.println("3 for Draw Destination Tickets");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            boolean temp = false;
            switch (choice)
            {
                case 1:
                    temp = drawTrainCards(jas);
                    break;
                case 2:
                    temp = claimRoute(jas);
                    break;
                case 3:
                    temp  = drawDestinationTickets(jas);
                    break;
            }

            // the SOLE end condition for the game
            if (rey.getTrainsRemaining() <= 2 || jas.getTrainsRemaining() <= 2 || gabe.getTrainsRemaining() <= 2) break;
        }



    }

    private static boolean drawTrainCards(Player player) {
        return true;
    }


    private static boolean claimRoute(Player player) {
        return true;
    }


    private static boolean drawDestinationTickets(Player player) {
        return true;
    }

}
