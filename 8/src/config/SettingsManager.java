package config;

public class SettingsManager {
    private GameSettings settings;
    private final SettingsLoader loader;
    private final SettingsSaver saver;

    public SettingsManager() {
        loader = new SettingsLoader();
        saver = new SettingsSaver();
        settings = new GameSettings(50, "1920x1080", "WASD"); // Значения по умолчанию
    }

    public void loadSettings(String filePath) {
        settings = loader.load(filePath);
    }

    public void saveSettings(String filePath) {
        saver.save(settings, filePath);
    }

    public GameSettings getSettings() {
        return settings;
    }

    public void updateSettings(int volume, String resolution, String controlScheme) {
        settings.setVolume(volume);
        settings.setResolution(resolution);
        settings.setControlScheme(controlScheme);
    }
}
