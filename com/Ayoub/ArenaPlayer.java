package com.Ayoub;

public interface ArenaPlayer {
    String getName();
    String getClassType();
    String getSpecType();
    int getRating();
    boolean equals(Object obj);
    boolean compareRating(int rating1, int rating2);
}
