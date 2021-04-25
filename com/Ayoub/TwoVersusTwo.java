package com.Ayoub;

public class TwoVersusTwo implements ArenaPlayer{
    private final PlayerCharacter player1;
    private final PlayerCharacter player2;

    public TwoVersusTwo(PlayerCharacter player1,PlayerCharacter player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getName() {
        return player1.getName() + "/" + player2.getName();
    }

    public int getRating() {
        return (player1.getRating() + player2.getRating())/2 ;
    }


    public String getSpecType() {
        return player1.getSpecType() + "/" + player2.getSpecType();
    }

    public boolean compareRating(int rating1, int rating2) {
        rating1 = player1.getRating();
        rating2 = player2.getRating();
        return player1.compareRating(rating1, rating2);

    }
}
