package bridge;

import models.Video;

public abstract class VideoPlayer {
    protected Device device;

    public VideoPlayer(Device device) {
        this.device = device;
    }

    public abstract void playVideo(Video video);
}
