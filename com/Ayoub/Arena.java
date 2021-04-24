package com.Ayoub;

public class Arena {
    private ArenaPlayer arenaPlayer1;
    private ArenaPlayer arenaPlayer2;
    private PlayerCharacter player;
    private LiveStream liveStream;

    public Arena() {
    }

    public String getPlayer() {
        return player.getSpecType();
    }

    public LiveStream getLiveStream() {
        return liveStream;
    }
}
