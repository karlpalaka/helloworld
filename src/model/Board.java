package model;

public class Board
{
    private char[][] board = {{'*', 'P', '*', 'W', '*'},
                             {'G', ' ', '!', ' ', 'L'},
                             {'*', ' ', '*', ' ', '*'},
                             {'R', ' ', ' ', ' ', 'Y'},
                             {'*', 'B', '*', 'O', '*'}};

    // ========== getters/setters ==========

    public char[][] getBoard()
    {
        return board;
    }
}