package model;

public class Controller
{
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
        int option;

        // this is the main game loop
        while(playersHaveTrains)
        {
            // jas's turn first
            // rey's turn second
            // gabe's turn third
            // we run each object's turn phase
            // here we have players play

            // the SOLE end condition for the game
            if (rey.getTrainsRemaining() <= 2 || jas.getTrainsRemaining() <= 2 || gabe.getTrainsRemaining() <= 2) break;
        }
    }


    private boolean drawTrainCards(Player player) {
        
    }


    private boolean claimRoute(Player player) {

    }


    private boolean drawDestinationTickets(Player player) {

    }
}
