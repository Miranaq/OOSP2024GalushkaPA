package models;

public class Video {
    private final String title;
    private final String resolution;

    public Video(String title, String resolution) {
        this.title = title;
        this.resolution = resolution;
    }

    public String getTitle() {
        return title;
    }

    public String getResolution() {
        return resolution;
    }
}
