package model;

public class Board
{
    private char[][] board = {{'*', 'P', '*', 'W', '*'},
                             {'G', ' ', '!', ' ', 'L'},
                             {'*', ' ', '*', ' ', '*'},
                             {'R', ' ', ' ', ' ', 'Y'},
                             {'*', 'B', '*', 'O', '*'}};

    // ========== getters ==========

    /**
     * This is the game board where <br>
     * the game will revolve around. <br>
     * Players will accumulate trainCards <br>
     * of a particular color and trace <br>
     * and claim a path using their <br>
     * trainCars.
     * @return Game board array.
     */
    public char[][] getBoard()
    {
        return board;
    }

    // ========== setters ==========


}