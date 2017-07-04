package footballgame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FanTest {

    @Test
    public void shouldReactYAYWhenFansTeamScore() {
        Fan fan = new Fan("Team A");
        assertEquals("YAY", fan.reactToGoal("Team A"));
    }

    @Test
    public void shouldReactBooWhenNotAFansTeamScore() {
        Fan fan = new Fan("Team A");
        assertEquals("BOO", fan.reactToGoal("Team B"));
    }
}
