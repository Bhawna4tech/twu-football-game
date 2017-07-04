package footballgame;

import java.util.List;

public class FootballGame {

    List<Reporter> reporters;

    public FootballGame(List<Reporter> reporters) {
        this.reporters = reporters;
    }

    public void teamScored(String scoringTeam) {
        for (Reporter reporter : reporters) {
            reporter.reactToGoal(scoringTeam);
        }
    }
}
