package bwinf;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private int amount;
    private List<Player> playedAgainst;

    public Player(int amount) {
        this.amount = amount;
        this.playedAgainst = new ArrayList<>();
    }

    public List<Player> getPlayedAgainst() {
        return playedAgainst;
    }

    public int getAmount() {
        return amount;
    }
}
