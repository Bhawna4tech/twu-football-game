package footballgame;

import java.util.ArrayList;

public class FootballGame {

    private ArrayList<Reporter> reporters;
    private ArrayList<Fan> fans;

    public FootballGame(ArrayList<Reporter> reporters, ArrayList<Fan> fans) {
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

    public void addReporter(Reporter reporter) {
        reporters.add(reporter);
    }

    public void addFan(Fan fan) {
        fans.add(fan);
    }
}
