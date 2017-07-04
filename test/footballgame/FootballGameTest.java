package footballgame;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FootballGameTest {

    private List<Reporter> reporters;
    private FootballGame footballGame;

    @Before
    public void setUp() throws Exception {
        Reporter reporter1 = mock(Reporter.class);
        Reporter reporter2 = mock(Reporter.class);
        reporters = Arrays.asList(reporter1,reporter2);
        footballGame = new FootballGame(reporters);
    }

    @Test
    public void reporterShouldReactToGoalScoredByTeamA() {
        footballGame.teamScored("Team A");
        verify(reporters.get(0)).reactToGoal("Team A");
        verify(reporters.get(1)).reactToGoal("Team A");
    }
}
