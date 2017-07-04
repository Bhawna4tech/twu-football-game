package footballgame;

public class Reporter implements Reactor{

    @Override
    public String reactToGoal(String scoringTeam) {
        return "GOAL by " + scoringTeam;
    }
}
