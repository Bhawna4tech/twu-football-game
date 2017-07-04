package footballgame;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReporterTest {

    @Test
    public void shouldReportWhichTeamScored() {
        Reporter reporter = new Reporter();
        assertThat(reporter.reactToGoal("Team A"), is("GOAL by Team A"));
        assertThat(reporter.reactToGoal("Team B"), is("GOAL by Team B"));
    }
}