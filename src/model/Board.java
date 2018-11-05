package model;

@Deprecated
public class Board
{
    public static final int R_LIM = 5;
    public static final int C_LIM = 5;

    /**
     * Board representing map. <br>
     * Letters correspond to colored path. <br><br>
     *
     * * - City <br><br>
     *
     * G - Green <br>
     * P - Pink <br>
     * W - White <br>
     * ! - Wildcard <br>
     * R - Red <br>
     * Y - Yellow <br>
     * B - Blue <br>
     * O - Orange <br>
     * L - Blue
     */
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

    /**
     * Return the element (city, track, wildcard, or <br>
     * nothing on the corresponding map coordinate.
     * @param r Row index.
     * @param c Column index.
     * @return
     */
    public char getElement(int r, int c)
    {
        if (r < 0 || r >= R_LIM || c < 0 || c >= C_LIM) throw new ArrayIndexOutOfBoundsException();

        return board[r][c];
    }

    // ========== setters ==========
}