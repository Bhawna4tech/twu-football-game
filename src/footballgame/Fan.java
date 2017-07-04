package footballgame;

public class Fan {
    private String footBallTeam;

    public Fan(String footBallTeam) {
        this.footBallTeam = footBallTeam;
    }

    public String reactToGoal(String scoringTeam) {
        if (this.footBallTeam.equals(scoringTeam)) {
            return "YAY";
        }
        else {
            return "BOO";
        }
    }
}
