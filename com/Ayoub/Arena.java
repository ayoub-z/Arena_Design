package com.Ayoub;

public class Arena implements Cast{
    private final ArenaPlayer arenaPlayer1;
    private final ArenaPlayer arenaPlayer2;
    private final Cast liveStream;
    private final Cast commentaryCast;

    public Arena(ArenaPlayer arenaPlayer1, ArenaPlayer arenaPlayer2, Cast liveStream, Cast cast) throws Exception {
        // Players with the same specialization type cannot play against each other, unless they are both dps.
        if (arenaPlayer1.getSpecType().equals(arenaPlayer2.getSpecType()) && !arenaPlayer1.getSpecType().equals("Dps")) {
            throw new Exception(arenaPlayer1.getName() + " and " + arenaPlayer2.getName() + " can't both be a " + arenaPlayer1.getSpecType());
        } // Players need to be within 500 or 200 rating points depending on their rating.
        if (!arenaPlayer1.compareRating(arenaPlayer1.getRating(), arenaPlayer2.getRating())) {
            throw new Exception("The rating of " + arenaPlayer1.getName() + " and " + arenaPlayer2.getName() + " is too far apart");
        }
        this.arenaPlayer1 = arenaPlayer1;
        this.arenaPlayer2 = arenaPlayer2;
        this.liveStream = liveStream;
        this.commentaryCast = cast;
    }

    public ArenaPlayer getArenaPlayer1() {
        return arenaPlayer1;
    }

    public ArenaPlayer getArenaPlayer2() {
        return arenaPlayer2;
    }

    public String getStreamName() {
        return liveStream.getStreamName();
    }

    public String getName() {
        return commentaryCast.getName();
    }

    public String toString(){
        return "\nThere are 2 fighters in this match: \n------------------------------------" +
                "\nPlayer 1: " + getArenaPlayer1().getName() + "\n\tRole: " + getArenaPlayer1().getSpecType() + "\n\tClass: " +
                getArenaPlayer1().getClassType() + "\n\tRating: " + getArenaPlayer1().getRating() + "\n\nPlayer 2: " +
                getArenaPlayer2().getName() + "\n\tRole: " + getArenaPlayer2().getSpecType() + "\n\tClass: " +
                getArenaPlayer2().getClassType() + "\n\tRating: " + getArenaPlayer2().getRating() +
                "\n\nThese matches will be streamed on: " + getStreamName() + "\nwith the commentator being: "
                + getName() + " of the official World of Warcraft team!";
    }


}
