package bridge;

public class Projector extends Device {
    public Projector(String name) {
        super(name);
    }

    @Override
    public void play(String videoTitle, String resolution) {
        System.out.println("Воспроизведение '" + videoTitle + "' на проекторе " + name + " с разрешением " + resolution);
    }
}
