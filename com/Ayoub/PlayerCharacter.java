package com.Ayoub;

public class PlayerCharacter extends InGameID implements ArenaPlayer{
    private String name;
    private int level;
    private int rating;
    private String classType;
    private String specType;

    public PlayerCharacter(String id,String nm, int lvl, int rt, String clst, String spct) {
        super(id);
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
        // if their rating is greater than 2000, it can't be more than 200 points apart
        if (rating1 > 2000 && rating2 > 2000) {
            return (rating1 - rating2) < 200 && -200 > (rating1 - rating2);
        }
        // and if it's greater than 1000, it can't be more than 500 points apart
        else if (rating1 > 1000 && rating2 > 1000) {
            return (rating1 - rating2) < 500 && -500 > (rating1 - rating2);
        }
        else{
            return true;
        }
    }
}
