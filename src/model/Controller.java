package model;

import java.util.Scanner;

public class Controller
{
    public static void main(String[] args)
    {
        Graph gameBoard = new Graph(Cities.values().length);
        createMap(gameBoard);

        gameBoard.printGraph();

        Player jas = new Player("Jas", TeamColor.BLACK);
        Player rey = new Player("Rey", TeamColor.RED);
        Player gabe = new Player("Gabe", TeamColor.GREEN);

        // this is our end condition when a player has <= 2 trains left
        boolean playersHaveTrains = true;
        boolean temp = false;

        // at start of game, players each draw 3 destinationCards
        // players must choose 2 or 3 before continuing
        // then, every player getse a total of 4 cards to start
        // then, main game loop where players choose what they want to do

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
        // get input
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
        boolean wildcard = false;
        System.out.println("Please draw Two cards...");

        //loop till player picks up at least 2 train cards or picks up 1 wild card from face up
        //if choice is 1 pick up from face up, timesdrawn++
        //2 pick up from face down, timesdrawn++
        //end loop
        while(timesDrawn < 2 || wildcard == true)
        {
            System.out.println("1 for Draw From Face Up Deck");
            System.out.println("2 for Draw From Face Down Deck");
//            System.out.println("3 to stop drawing");
            System.out.println("Choose an option: ");
            //boolean success = true;

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Drawing from face up Deck"); // add face up deck
                    // draw from face up deck
                    // if card is wildcard, wildcard = true;
                    ++timesDrawn;
                    break;
                case 2:
                    System.out.println("Drawing from face down Deck");
                    // draw from face down
                    ++timesDrawn;
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }

        }

//            switch (choice)
//            {
//                case 1:
//                    System.out.println("Drawing from face up Deck");
//                    break;
//
//                case 2:
//                    System.out.println("Drawing from face down deck");
//                    break;
//
//                case 3:
//                    if (timesDrawn == 0) {
//                        System.out.println("You must draw at least 1 card from either deck");
//                        success = false;
//                    }
//                    break;
//
//                default:
//                    System.out.println("Invalid choice!");
//                    break;
//            }
//
//            if (success)
//                timesDrawn++;
//        } while (timesDrawn < 2);

        return true;
    }


    private static boolean claimRoute(Player player)
    {
        System.out.println("Choose a route:");
        // display routes for user to choose from

        System.out.println("Choose a Train Car color");
        // display players different train car card colors
        System.out.println("")
        // if train card color == routes Color and players train cards == number of route cards
        // place players trainCards, decrement their trainCards, decrement their train cars
        // else return false
        // take out the claimed route from map.
        if()
        return true;
    }


    private static boolean drawDestinationTickets(Player player)
    {
        // draw 3 and show the player
        System.out.println("Choose which ones to keep: 1, 2, 3.");
        
        return true;
    }

    private static void createMap(Graph graph)
    {
        graph.addEdge(Cities.VANCOUVER, Cities.CALGARY, RouteColor.ANY, 3);
        graph.addEdge(Cities.VANCOUVER, Cities.SEATTLE, RouteColor.ANY, 1);
        graph.addEdge(Cities.VANCOUVER, Cities.SEATTLE, RouteColor.ANY, 1);

        graph.addEdge(Cities.SEATTLE, Cities.CALGARY, RouteColor.ANY, 4);
        graph.addEdge(Cities.SEATTLE, Cities.PORTLAND, RouteColor.ANY, 1);
        graph.addEdge(Cities.SEATTLE, Cities.PORTLAND, RouteColor.ANY, 1);
        graph.addEdge(Cities.SEATTLE, Cities.HELENA, RouteColor.YELLOW, 6);

        graph.addEdge(Cities.PORTLAND, Cities.SAN_FRANCISCO, RouteColor.GREEN, 5);
        graph.addEdge(Cities.PORTLAND, Cities.SAN_FRANCISCO, RouteColor.PURPLE, 5);
        graph.addEdge(Cities.PORTLAND, Cities.SALT_LAKE_CITY, RouteColor.BLUE, 6);

        graph.addEdge(Cities.SAN_FRANCISCO, Cities.LOS_ANGELES, RouteColor.YELLOW, 3);
        graph.addEdge(Cities.SAN_FRANCISCO, Cities.LOS_ANGELES, RouteColor.PURPLE, 3);
        graph.addEdge(Cities.SAN_FRANCISCO, Cities.SALT_LAKE_CITY, RouteColor.WHITE, 5);
        graph.addEdge(Cities.SAN_FRANCISCO, Cities.SALT_LAKE_CITY, RouteColor.ORANGE, 5);

        graph.addEdge(Cities.HELENA, Cities.SALT_LAKE_CITY, RouteColor.PURPLE, 3);

        graph.addEdge(Cities.SALT_LAKE_CITY, Cities.LAS_VEGAS, RouteColor.ORANGE, 3);

        graph.addEdge(Cities.LAS_VEGAS, Cities.LOS_ANGELES, RouteColor.ANY, 2);

        graph.addEdge(Cities.LOS_ANGELES, Cities.PHOENIX, RouteColor.ANY, 3);
        graph.addEdge(Cities.LOS_ANGELES, Cities.EL_PASO, RouteColor.BLACK, 6);

        graph.addEdge(Cities.EL_PASO, Cities.PHOENIX, RouteColor.ANY, 3);
        graph.addEdge(Cities.EL_PASO, Cities.HOUSTON, RouteColor.GREEN, 6);

        graph.addEdge(Cities.PHOENIX, Cities.SANTA_FE, RouteColor.ANY, 3);
        graph.addEdge(Cities.PHOENIX, Cities.DENVER, RouteColor.WHITE, 5);

        graph.addEdge(Cities.DENVER, Cities.SALT_LAKE_CITY, RouteColor.YELLOW, 3);
        graph.addEdge(Cities.DENVER, Cities.SALT_LAKE_CITY, RouteColor.RED, 3);
        graph.addEdge(Cities.DENVER, Cities.KANSAS_CITY, RouteColor.BLACK, 4);
        graph.addEdge(Cities.DENVER, Cities.KANSAS_CITY, RouteColor.ORANGE, 4);
        graph.addEdge(Cities.DENVER, Cities.OKLAHOMA_CITY, RouteColor.RED, 4);
        graph.addEdge(Cities.DENVER, Cities.SANTA_FE, RouteColor.ANY, 2);
        graph.addEdge(Cities.DENVER, Cities.HELENA, RouteColor.GREEN, 4);
        graph.addEdge(Cities.DENVER, Cities.OMAHA, RouteColor.PURPLE, 4);

        graph.addEdge(Cities.SANTA_FE, Cities.EL_PASO, RouteColor.ANY, 2);

        graph.addEdge(Cities.OKLAHOMA_CITY, Cities.SANTA_FE, RouteColor.BLUE, 3);
        graph.addEdge(Cities.OKLAHOMA_CITY, Cities.EL_PASO, RouteColor.YELLOW, 5);
        graph.addEdge(Cities.OKLAHOMA_CITY, Cities.DALLAS, RouteColor.ANY, 2);
        graph.addEdge(Cities.OKLAHOMA_CITY, Cities.DALLAS, RouteColor.ANY, 2);
        graph.addEdge(Cities.OKLAHOMA_CITY, Cities.LITTLE_ROCK, RouteColor.ANY, 2);
        graph.addEdge(Cities.OKLAHOMA_CITY, Cities.KANSAS_CITY, RouteColor.ANY, 2);
        graph.addEdge(Cities.OKLAHOMA_CITY, Cities.KANSAS_CITY, RouteColor.ANY, 2);

        graph.addEdge(Cities.DALLAS, Cities.EL_PASO, RouteColor.RED, 4);
        graph.addEdge(Cities.DALLAS, Cities.HOUSTON, RouteColor.ANY, 1);
        graph.addEdge(Cities.DALLAS, Cities.HOUSTON, RouteColor.ANY, 1);
        graph.addEdge(Cities.DALLAS, Cities.LITTLE_ROCK, RouteColor.ANY, 2);

        graph.addEdge(Cities.HOUSTON, Cities.NEW_ORLEANS, RouteColor.ANY, 2);

        graph.addEdge(Cities.NEW_ORLEANS, Cities.LITTLE_ROCK, RouteColor.GREEN, 3);
        graph.addEdge(Cities.NEW_ORLEANS, Cities.ATLANTA, RouteColor.YELLOW, 4);
        graph.addEdge(Cities.NEW_ORLEANS, Cities.ATLANTA, RouteColor.ORANGE, 4);
        graph.addEdge(Cities.NEW_ORLEANS, Cities.MIAMI, RouteColor.RED, 6);

        graph.addEdge(Cities.ATLANTA, Cities.MIAMI, RouteColor.BLUE, 5);
        graph.addEdge(Cities.ATLANTA, Cities.CHARLESTON, RouteColor.ANY, 2);
        graph.addEdge(Cities.ATLANTA, Cities.RALEIGH, RouteColor.ANY, 2);
        graph.addEdge(Cities.ATLANTA, Cities.RALEIGH, RouteColor.ANY, 2);
        graph.addEdge(Cities.ATLANTA, Cities.NASHVILLE, RouteColor.ANY, 1);

        graph.addEdge(Cities.LITTLE_ROCK, Cities.NASHVILLE, RouteColor.WHITE, 3);
        graph.addEdge(Cities.LITTLE_ROCK, Cities.SAINT_LOUIS, RouteColor.ANY, 2);

        graph.addEdge(Cities.SAINT_LOUIS, Cities.PITTSBURG, RouteColor.GREEN, 5);
        graph.addEdge(Cities.SAINT_LOUIS, Cities.NASHVILLE, RouteColor.ANY, 2);

        graph.addEdge(Cities.KANSAS_CITY, Cities.SAINT_LOUIS, RouteColor.PURPLE, 2);
        graph.addEdge(Cities.KANSAS_CITY, Cities.SAINT_LOUIS, RouteColor.BLUE, 2);
        graph.addEdge(Cities.KANSAS_CITY, Cities.OMAHA, RouteColor.ANY, 1);
        graph.addEdge(Cities.KANSAS_CITY, Cities.OMAHA, RouteColor.ANY, 1);

        graph.addEdge(Cities.OMAHA, Cities.CHICAGO, RouteColor.BLUE, 4);
        graph.addEdge(Cities.OMAHA, Cities.DULUTH, RouteColor.ANY, 2);
        graph.addEdge(Cities.OMAHA, Cities.DULUTH, RouteColor.ANY, 2);
        graph.addEdge(Cities.OMAHA, Cities.HELENA, RouteColor.RED, 5);

        graph.addEdge(Cities.DULUTH, Cities.HELENA, RouteColor.ORANGE, 6);
        graph.addEdge(Cities.DULUTH, Cities.WINNIPEG, RouteColor.BLACK, 4);
        graph.addEdge(Cities.DULUTH, Cities.SAULT_ST_MARIE, RouteColor.ANY, 3);
        graph.addEdge(Cities.DULUTH, Cities.TORONTO, RouteColor.PURPLE, 6);
        graph.addEdge(Cities.DULUTH, Cities.CHICAGO, RouteColor.RED, 3);

        graph.addEdge(Cities.CHICAGO, Cities.TORONTO, RouteColor.WHITE, 4);
        graph.addEdge(Cities.CHICAGO, Cities.PITTSBURG, RouteColor.ORANGE, 3);
        graph.addEdge(Cities.CHICAGO, Cities.PITTSBURG, RouteColor.BLACK, 3);
        graph.addEdge(Cities.CHICAGO, Cities.SAINT_LOUIS, RouteColor.GREEN, 2);

        graph.addEdge(Cities.PITTSBURG, Cities.NASHVILLE, RouteColor.YELLOW, 4);
        graph.addEdge(Cities.PITTSBURG, Cities.RALEIGH, RouteColor.ANY, 2);
        graph.addEdge(Cities.PITTSBURG, Cities.WASHINGTON, RouteColor.ANY, 2);
        graph.addEdge(Cities.PITTSBURG, Cities.NEW_YORK, RouteColor.GREEN, 2);
        graph.addEdge(Cities.PITTSBURG, Cities.NEW_YORK, RouteColor.WHITE, 2);
        graph.addEdge(Cities.PITTSBURG, Cities.TORONTO, RouteColor.ANY, 2);

        graph.addEdge(Cities.NASHVILLE, Cities.RALEIGH, RouteColor.BLACK, 3);

        graph.addEdge(Cities.RALEIGH, Cities.WASHINGTON, RouteColor.ANY, 2);
        graph.addEdge(Cities.RALEIGH, Cities.WASHINGTON, RouteColor.ANY, 2);
        graph.addEdge(Cities.RALEIGH, Cities.CHARLESTON, RouteColor.ANY, 2);

        graph.addEdge(Cities.CHARLESTON, Cities.MIAMI, RouteColor.PURPLE, 4);

        graph.addEdge(Cities.WASHINGTON, Cities.NEW_YORK, RouteColor.ORANGE, 2);
        graph.addEdge(Cities.WASHINGTON, Cities.NEW_YORK, RouteColor.BLACK, 2);

        graph.addEdge(Cities.NEW_YORK, Cities.BOSTON, RouteColor.RED, 2);
        graph.addEdge(Cities.NEW_YORK, Cities.BOSTON, RouteColor.YELLOW, 2);
        graph.addEdge(Cities.NEW_YORK, Cities.MONTREAL, RouteColor.BLUE, 3);

        graph.addEdge(Cities.BOSTON, Cities.MONTREAL, RouteColor.ANY, 2);
        graph.addEdge(Cities.BOSTON, Cities.MONTREAL, RouteColor.ANY, 2);

        graph.addEdge(Cities.MONTREAL, Cities.TORONTO, RouteColor.ANY, 3);
        graph.addEdge(Cities.MONTREAL, Cities.SAULT_ST_MARIE, RouteColor.BLACK, 5);

        graph.addEdge(Cities.SAULT_ST_MARIE, Cities.TORONTO, RouteColor.ANY, 2);
        graph.addEdge(Cities.SAULT_ST_MARIE, Cities.WINNIPEG, RouteColor.ANY, 6);

        graph.addEdge(Cities.WINNIPEG, Cities.HELENA, RouteColor.BLUE, 4);

        graph.addEdge(Cities.HELENA, Cities.CALGARY, RouteColor.ANY, 4);

        graph.addEdge(Cities.CALGARY, Cities.WINNIPEG, RouteColor.WHITE, 6);
    }
}
