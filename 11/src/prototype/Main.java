package prototype;

public class Main {
    public static void main(String[] args) {
        try {
            // Создаем базовые настройки приложения
            AppSettings defaultSettings = new AppSettings("Dark", "English");
            // Создаем настройки пользователя
            UserSettings user1Settings = new UserSettings("User 1", defaultSettings);

            // Клонируем настройки для другого пользователя
            UserSettings user2Settings = (UserSettings) user1Settings.clone();
            user2Settings.setUsername("User 2");
            user2Settings.getAppSettings().setTheme("Light");

            // Выводим настройки
            System.out.println(user1Settings);
            System.out.println(user2Settings);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
