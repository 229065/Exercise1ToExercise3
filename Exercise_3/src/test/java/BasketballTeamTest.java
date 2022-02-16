import org.junit.Test;

import static org.junit.Assert.*;

public class BasketballTeamTest {
    private BasketballTeam b;
    @Test
    public void updatePoints()
    {
        b=new BasketballTeam("Los Angeles Lakers",8);
        b.updatePoints("Win");
        assertEquals(10,b.getPoints());
    }

    @Test
    public void getTeamName() {
        b=new BasketballTeam("Cleveland Cavaliers",6);
        assertEquals("Cleveland Cavaliers",b.getTeamName());
    }

    @Test
    public void getPoints() {
        b=new BasketballTeam("Boston Celtics",10);
        assertEquals(10,b.getPoints());
    }
}