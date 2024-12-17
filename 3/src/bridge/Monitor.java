package bridge;

public class Monitor extends Device {
    public Monitor(String name) {
        super(name);
    }

    @Override
    public void play(String videoTitle, String resolution) {
        System.out.println("Воспроизведение '" + videoTitle + "' на мониторе " + name + " с разрешением " + resolution);
    }
}
