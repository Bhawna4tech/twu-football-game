package footballgame;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by yxhuang on 04/07/2017.
 */
public class ScoreBoardTest {
    @Test
    public void shouldReportWhichTeamScored() {
        ScoreBoard scoreBoard = new ScoreBoard();
        assertThat(scoreBoard.reactToGoal("Team A"), is("Team A scored"));
        assertThat(scoreBoard.reactToGoal("Team B"), is("Team B scored"));
    }
}