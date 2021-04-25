package com.Ayoub;

public class InGameID {
    private String id;

    // each player is part of an "account" and this account has an id
    public InGameID(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
