package footballgame;

import java.util.List;

public class FootballGame {

    private List<Reporter> reporters;
    private List<Fan> fans;

    public FootballGame(List<Reporter> reporters, List<Fan> fans) {
        this.reporters = reporters;
        this.fans = fans;
    }

    public void teamScored(String scoringTeam) {
        notifyReporters(scoringTeam);
        notifyFans(scoringTeam);
    }

    private void notifyFans(String scoringTeam) {
        fans.forEach(fan -> fan.reactToGoal(scoringTeam));
    }

    private void notifyReporters(String scoringTeam) {
        reporters.forEach(reporter -> reporter.reactToGoal(scoringTeam));
    }
}
