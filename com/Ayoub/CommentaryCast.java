package com.Ayoub;

public class CommentaryCast implements Cast{
    String name;
    private Cast liveStream;

    public CommentaryCast(String name) {
        this.name = name;
    }

    public String getStreamName() {
        return liveStream.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

