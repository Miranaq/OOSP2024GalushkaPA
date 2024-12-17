package bridge;

public abstract class Device {
    protected String name;

    public Device(String name) {
        this.name = name;
    }

    public abstract void play(String videoTitle, String resolution);
}
