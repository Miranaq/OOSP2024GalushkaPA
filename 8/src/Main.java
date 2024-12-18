import config.GameSettings;
import config.SettingsManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SettingsManager settingsManager = new SettingsManager();
        String filePath = "gameSettings.ser"; // Путь к файлу для сохранения и загрузки настроек

        // Загрузка настроек, если файл существует
        settingsManager.loadSettings(filePath);
        System.out.println("Текущие настройки: " + settingsManager.getSettings());

        // Обновление настроек
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите громкость (0-100): ");
        int volume = scanner.nextInt();
        scanner.nextLine(); // Чистим буфер
        System.out.print("Введите разрешение (например, 1920x1080): ");
        String resolution = scanner.nextLine();
        System.out.print("Введите схему управления (например, WASD): ");
        String controlScheme = scanner.nextLine();

        settingsManager.updateSettings(volume, resolution, controlScheme);
        System.out.println("Обновленные настройки: " + settingsManager.getSettings());

        // Сохранение настроек
        settingsManager.saveSettings(filePath);
        System.out.println("Настройки сохранены в файл: " + filePath);
    }
}
