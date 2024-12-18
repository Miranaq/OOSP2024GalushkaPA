package prototype;

public class UserSettings implements Cloneable {
    private String username;
    private AppSettings appSettings;

    public UserSettings(String username, AppSettings appSettings) {
        this.username = username;
        this.appSettings = appSettings;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public AppSettings getAppSettings() {
        return appSettings;
    }

    public void setAppSettings(AppSettings appSettings) {
        this.appSettings = appSettings;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        UserSettings cloned = (UserSettings) super.clone();
        cloned.appSettings = (AppSettings) appSettings.clone(); // Клонирование вложенного объекта
        return cloned;
    }

    @Override
    public String toString() {
        return "User Settings{" +
                "username='" + username + '\'' +
                ", appSettings=" + appSettings +
                '}';
    }
}
