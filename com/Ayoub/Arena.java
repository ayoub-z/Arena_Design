package com.Ayoub;

public class Arena {
    private final ArenaPlayer arenaPlayer1;
    private final ArenaPlayer arenaPlayer2;
    private LiveStream liveStream;

    public Arena(ArenaPlayer arenaPlayer1, ArenaPlayer arenaPlayer2) throws Exception {
        // Players with the same specialization type cannot play against each other, unless they are both dps.
        if ( arenaPlayer1.getSpecType().equals(arenaPlayer2.getSpecType()) && !arenaPlayer1.getSpecType().equals("Dps")) {
            throw new Exception("The spec type of player 1 cannot be the same as that of player2, unless if they are both damage dealers");
        }
        this.arenaPlayer1 = arenaPlayer1;
        this.arenaPlayer2 = arenaPlayer2;
    }

    public ArenaPlayer getArenaPlayer1() {
        return arenaPlayer1;
    }

    public ArenaPlayer getArenaPlayer2() {
        return arenaPlayer2;
    }

    public String getSpecType() {
        return arenaPlayer1.getSpecType() + "/" + arenaPlayer2.getSpecType();
    }

    public LiveStream getLiveStream() {
        return liveStream;
    }
}
