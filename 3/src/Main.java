import bridge.*;
import models.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video("Великое кино", "1920x1080");

        // Воспроизведение на телевизоре
        Device tv = new Television("Samsung");
        VideoPlayer streamingServiceTv = new StreamingService(tv);
        streamingServiceTv.playVideo(video);

        // Воспроизведение на мониторе
        Device monitor = new Monitor("LG");
        VideoPlayer streamingServiceMonitor = new StreamingService(monitor);
        streamingServiceMonitor.playVideo(video);

        // Воспроизведение на проекторе
        Device projector = new Projector("Epson");
        VideoPlayer streamingServiceProjector = new StreamingService(projector);
        streamingServiceProjector.playVideo(video);
    }
}
