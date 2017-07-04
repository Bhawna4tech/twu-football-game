package footballgame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FootballGameTest {

    private ArrayList<Spectator> spectators;
    private FootballGame footballGame;

    @Before
    public void setUp() throws Exception {
        Reporter reporter1 = mock(Reporter.class);
        Reporter reporter2 = mock(Reporter.class);
        Fan fan1 = mock(Fan.class);
        Fan fan2 = mock(Fan.class);
        ScoreBoard scoreBoard = mock(ScoreBoard.class);
        spectators = new ArrayList<>();
        spectators.add(reporter1);
        spectators.add(reporter2);
        spectators.add(fan1);
        spectators.add(fan2);
        spectators.add(scoreBoard);

        footballGame = new FootballGame(spectators);
    }

    @Test
    public void reporterShouldReactToGoalScoredByTeamA() {
        footballGame.teamScored("Team A");
        for (Spectator spectator : spectators) {
            verify(spectator).reactToGoal("Team A");
        }
    }

    @Test
    public void reporterShouldReactToGoalScoredByTeamAAfterAddReport() {
        footballGame.addSpectator(mock(Reporter.class));
        footballGame.addSpectator(mock(Fan.class));
        footballGame.addSpectator(mock(ScoreBoard.class));

        footballGame.teamScored("Team A");
        for (Spectator spectator : spectators) {
            verify(spectator).reactToGoal("Team A");
        }
    }
}
