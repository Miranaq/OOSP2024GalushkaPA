package config;

import java.io.Serializable;

public class GameSettings implements Serializable {
    private static final long serialVersionUID = 1L; // Для сериализации
    private int volume; // Громкость
    private String resolution; // Разрешение экрана
    private String controlScheme; // Схема управления

    public GameSettings(int volume, String resolution, String controlScheme) {
        this.volume = volume;
        this.resolution = resolution;
        this.controlScheme = controlScheme;
    }

    // Геттеры и сеттеры
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getControlScheme() {
        return controlScheme;
    }

    public void setControlScheme(String controlScheme) {
        this.controlScheme = controlScheme;
    }

    @Override
    public String toString() {
        return "GameSettings{" +
                "volume=" + volume +
                ", resolution='" + resolution + '\'' +
                ", controlScheme='" + controlScheme + '\'' +
                '}';
    }
}
