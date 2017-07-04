package footballgame;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FootballGameTest {

    private ArrayList<Reporter> reporters;
    private ArrayList<Fan> fans;
    private FootballGame footballGame;

    @Before
    public void setUp() throws Exception {
        Reporter reporter1 = mock(Reporter.class);
        Reporter reporter2 = mock(Reporter.class);
        Fan fan1 = mock(Fan.class);
        Fan fan2 = mock(Fan.class);
        reporters = new ArrayList<>();
        reporters.add(reporter1);
        reporters.add(reporter2);
        fans = new ArrayList<>();
        fans.add(fan1);
        fans.add(fan2);
        footballGame = new FootballGame(reporters, fans);
    }

    @Test
    public void reporterShouldReactToGoalScoredByTeamA() {
        footballGame.teamScored("Team A");
        verify(reporters.get(0)).reactToGoal("Team A");
        verify(reporters.get(1)).reactToGoal("Team A");
    }

    @Test
    public void reporterShouldReactToGoalScoredByTeamAAfterAddReport() {
        Reporter reporter = mock(Reporter.class);
        footballGame.addReporter(reporter);
        footballGame.teamScored("Team A");
        verify(reporters.get(0)).reactToGoal("Team A");
        verify(reporters.get(1)).reactToGoal("Team A");
        verify(reporters.get(2)).reactToGoal("Team A");
    }

    @Test
    public void fansShouldReactToGoalScoredByTeamA() {
        footballGame.teamScored("Team A");
        verify(fans.get(0)).reactToGoal("Team A");
        verify(fans.get(1)).reactToGoal("Team A");
    }

    @Test
    public void fansShouldReactToGoalScoredByTeamAAfterAddFan() {
        Fan fan = mock(Fan.class);
        footballGame.addFan(fan);
        footballGame.teamScored("Team A");
        verify(fans.get(0)).reactToGoal("Team A");
        verify(fans.get(1)).reactToGoal("Team A");
        verify(fans.get(2)).reactToGoal("Team A");
    }
}
