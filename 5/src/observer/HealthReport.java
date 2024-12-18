package observer;

public class HealthReport {
    private final String message;

    public HealthReport(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
