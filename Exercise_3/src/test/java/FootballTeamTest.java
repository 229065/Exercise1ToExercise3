import org.junit.Test;

import static org.junit.Assert.*;

public class FootballTeamTest {
    private FootballTeam f;
    @org.junit.Test
    public void updatePoints() {
        f=new FootballTeam("Chelsea",33,"Happy Foot");
        f.updatePoints("Drawn");
        f.updatePoints("Lose");
        assertEquals(34,f.getPoints());
    }

    @Test
    public void getTeamName() {
        f=new FootballTeam("Liverpool",45,"Bet Company");
        assertEquals("Liverpool",f.getTeamName());
    }

    @Test
    public void getPoints() {
        f=new FootballTeam("Manchester United",37,"Nice Stadium");
        assertEquals(37,f.getPoints());
    }

    @Test
    public void getSponsor() {
        f=new FootballTeam("Manchester United",37,"Nice Stadium");
        assertEquals("Nice Stadium",f.getSponsor());
    }
}