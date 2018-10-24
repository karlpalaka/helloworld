package model;

public class Controller
{
    public static void main(String[] args)
    {
        // init game with board, player, cards
        // player does one of three things
        // alternate players

        Board board = new Board();
        Cards cards = new Cards();
        Player jas = new Player("Jas", 'O');
        Player rey = new Player("Rey", 'R');
        Player gabe = new Player("Gabe", 'B');

        // this is our end condition when a player has <= 2 trains left
        boolean hasTrains = true;
        int option;

        while(hasTrains)
        {

        }
    }
}
