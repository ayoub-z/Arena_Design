package com.Ayoub;

// arena matches will be livestreamed on one main streaming channel
public class LiveStream implements Streaming {
    private String streamName;

    public LiveStream(String sn) {
        this.streamName = sn;
    }

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String sn) {
        this.streamName = sn;
    }
}
