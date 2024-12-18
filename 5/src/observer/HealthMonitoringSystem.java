package observer;

import java.util.ArrayList;
import java.util.List;

public class HealthMonitoringSystem implements Subject {
    private final List<Observer> observers;
    private HealthReport latestReport;

    public HealthMonitoringSystem() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestReport);
        }
    }

    public void addHealthReport(HealthReport report) {
        this.latestReport = report;
        notifyObservers();
    }
}
