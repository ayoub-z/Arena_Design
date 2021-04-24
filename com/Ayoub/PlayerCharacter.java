package com.Ayoub;

public class PlayerCharacter{
    private String name;
    private int level;
    private int rating;
    private String classType;
    private String specType;

    public PlayerCharacter(String nm, int lvl, int rt, String clst, String spct) {
        this.name = nm;
        this.level = lvl;
        this.rating = rt;
        this.classType = clst;
        this.specType = spct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getSpecType() {
        return specType;
    }

    public void setSpecType(String specType) {
        this.specType = specType;
    }

    public boolean compareRating(int rating1, int rating2) {
        return false;
    }
}
