package com.Ayoub;

public class InGameId {
    private String id;

    // each player is part of an "account" and this account always has an id
    // each account can have a maximum of 10 player characters
    public InGameId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
