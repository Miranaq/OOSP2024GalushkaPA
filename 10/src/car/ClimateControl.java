package car;

public class ClimateControl {
    public void setTemperature(int temperature) {
        System.out.println("Температура установлена на " + temperature + " градусов.");
    }

    public void turnOn() {
        System.out.println("Климат-контроль включен.");
    }

    public void turnOff() {
        System.out.println("Климат-контроль выключен.");
    }
}
