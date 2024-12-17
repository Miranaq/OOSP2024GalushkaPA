package bridge;

import models.Video;

public class StreamingService extends VideoPlayer {
    public StreamingService(Device device) {
        super(device);
    }

    @Override
    public void playVideo(Video video) {
        device.play(video.getTitle(), video.getResolution());
    }
}
