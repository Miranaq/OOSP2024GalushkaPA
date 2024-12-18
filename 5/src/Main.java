import observer.HealthMonitoringSystem;
import observer.HealthReport;
import observer.Patient;

public class Main {
    public static void main(String[] args) {
        // Создание системы мониторинга
        HealthMonitoringSystem monitoringSystem = new HealthMonitoringSystem();

        // Создание пациентов
        Patient patient1 = new Patient("Иван Иванов");
        Patient patient2 = new Patient("Мария Петрова");

        // Подписка пациентов на уведомления
        monitoringSystem.registerObserver(patient1);
        monitoringSystem.registerObserver(patient2);

        // Добавление медицинских отчетов
        HealthReport report1 = new HealthReport("Ваш анализ крови готов. Результаты: все в норме.");
        monitoringSystem.addHealthReport(report1);

        HealthReport report2 = new HealthReport("Ваш анализ мочи готов. Результаты: требуется дополнительное обследование.");
        monitoringSystem.addHealthReport(report2);
    }
}
