package model;

public class Board
{ //added board
    private char[][] board = {{'*', 'P', '*', 'W', '*'},
                             {'G', ' ', '!', ' ', 'L'},
                             {'*', ' ', '*', ' ', '*'},
                             {'R', ' ', ' ', ' ', 'Y'},
                             {'*', 'B', '*', 'O', '*'}};

    // ========== getters ==========

    public char[][] getBoard()
    {
        return board;
    }

    // ========== setters ==========


}