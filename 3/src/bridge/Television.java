package bridge;

public class Television extends Device {
    public Television(String name) {
        super(name);
    }

    @Override
    public void play(String videoTitle, String resolution) {
        System.out.println("Воспроизведение '" + videoTitle + "' на телевизоре " + name + " с разрешением " + resolution);
    }
}
