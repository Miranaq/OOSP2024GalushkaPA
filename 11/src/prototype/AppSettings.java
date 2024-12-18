package prototype;

public class AppSettings implements Cloneable {
    private String theme;
    private String language;

    public AppSettings(String theme, String language) {
        this.theme = theme;
        this.language = language;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "AppSettings{" +
                "theme='" + theme + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
