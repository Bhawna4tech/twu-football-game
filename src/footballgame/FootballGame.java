package footballgame;

import java.util.ArrayList;

public class FootballGame {

    private ArrayList<Spectator> spectators;

    public FootballGame(ArrayList<Spectator> spectators) {
        this.spectators = spectators;
    }

    public void teamScored(String scoringTeam) {
        notifySpectators(scoringTeam);
    }

    private void notifySpectators(String scoringTeam) {
        spectators.forEach(spectator -> spectator.reactToGoal(scoringTeam));
    }

    public void addSpectator(Spectator spectator) {
        spectators.add(spectator);
    }
}
