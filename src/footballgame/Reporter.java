package footballgame;

public class Reporter extends Spectator {

    @Override
    public String reactToGoal(String scoringTeam) {
        return "GOAL by " + scoringTeam;
    }
}
