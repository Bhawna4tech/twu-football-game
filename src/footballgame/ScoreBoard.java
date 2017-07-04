package footballgame;

public class ScoreBoard extends Spectator{
    @Override
    public String reactToGoal(String scoringTeam) {
        return scoringTeam + " scored";
    }
}
