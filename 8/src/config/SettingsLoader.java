package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SettingsLoader {
    public GameSettings load(String filePath) {
        GameSettings settings = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            settings = (GameSettings) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке настроек: " + e.getMessage());
        }
        return settings;
    }
}
