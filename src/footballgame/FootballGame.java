package footballgame;

import java.util.List;

public class FootballGame {

    private List<Reporter> reporters;

    public FootballGame(List<Reporter> reporters) {
        this.reporters = reporters;
    }

    public void teamScored(String scoringTeam) {
        reporters.forEach(reporter -> reporter.reactToGoal(scoringTeam));
    }
}
