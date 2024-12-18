package config;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SettingsSaver {
    public void save(GameSettings settings, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(settings);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении настроек: " + e.getMessage());
        }
    }
}
