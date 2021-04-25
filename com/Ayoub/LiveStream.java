package com.Ayoub;

// arena matches will be livestreamed on one main streaming channel
public class LiveStream implements Cast {
    private String streamName;
    private Cast commentaryCast;

    public LiveStream(String sn) {
        this.streamName = sn;
    }

    public String getStreamName() {
        return streamName;
    }

    public String getName() {
        return commentaryCast.getName();
    }

    public void setStreamName(String sn) {
        this.streamName = sn;
    }
}
