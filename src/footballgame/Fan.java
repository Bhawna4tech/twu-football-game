package footballgame;

public class Fan {
    private String footBallTeam;

    public Fan(String footBallTeam) {
        this.footBallTeam = footBallTeam;
    }

    public String reactToGoal(String footBallTeam) {
        if (this.footBallTeam.equals(footBallTeam)) {
            return "YAY";
        }
        else {
            return "BOO";
        }
    }
}
