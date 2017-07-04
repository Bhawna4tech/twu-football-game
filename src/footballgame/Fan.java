package footballgame;

public class Fan extends Spectator{
    private String footBallTeam;

    public Fan(String footBallTeam) {
        this.footBallTeam = footBallTeam;
    }

    @Override
    public String reactToGoal(String scoringTeam) {
        if (this.footBallTeam.equals(scoringTeam)) {
            return "YAY";
        }
        else {
            return "BOO";
        }
    }
}
