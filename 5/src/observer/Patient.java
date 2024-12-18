package observer;

public class Patient implements Observer {
    private final String name;

    public Patient(String name) {
        this.name = name;
    }

    @Override
    public void update(HealthReport report) {
        System.out.println("Уведомление для " + name + ": " + report.getMessage());
    }

    public String getName() {
        return name;
    }
}
