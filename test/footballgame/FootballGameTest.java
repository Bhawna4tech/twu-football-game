package footballgame;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FootballGameTest {

    private List<Reporter> reporters;
    private List<Fan> fans;
    private FootballGame footballGame;

    @Before
    public void setUp() throws Exception {
        Reporter reporter1 = mock(Reporter.class);
        Reporter reporter2 = mock(Reporter.class);
        Fan fan1 = mock(Fan.class);
        Fan fan2 = mock(Fan.class);
        reporters = Arrays.asList(reporter1, reporter2);
        fans = Arrays.asList(fan1, fan2);
        footballGame = new FootballGame(reporters, fans);
    }

    @Test
    public void reporterShouldReactToGoalScoredByTeamA() {
        footballGame.teamScored("Team A");
        verify(reporters.get(0)).reactToGoal("Team A");
        verify(reporters.get(1)).reactToGoal("Team A");
    }

    @Test
    public void FansShouldReactToGoalScoredByTeamA() {
        footballGame.teamScored("Team A");
        verify(fans.get(0)).reactToGoal("Team A");
        verify(fans.get(1)).reactToGoal("Team A");
    }
}
