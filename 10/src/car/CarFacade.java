package car;

public class CarFacade {
    private Engine engine;
    private ClimateControl climateControl;
    private MusicPlayer musicPlayer;

    public CarFacade() {
        this.engine = new Engine();
        this.climateControl = new ClimateControl();
        this.musicPlayer = new MusicPlayer();
    }

    public void startCar(int temperature, String track) {
        engine.start();
        climateControl.turnOn();
        climateControl.setTemperature(temperature);
        musicPlayer.play(track);
    }

    public void stopCar() {
        musicPlayer.stop();
        climateControl.turnOff();
        engine.stop();
    }
}
