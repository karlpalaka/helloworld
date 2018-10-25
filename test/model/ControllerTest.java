package model;
import model.Controller;
import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest
{


    @Test
    public void drawTrainCardsTest()
    {
        Controller con = new Controller();
        con.setAccessible(true);

        Player player = new Player("john", 'R');
        assertTrue(con.drawTrainCards(player));
    }
}