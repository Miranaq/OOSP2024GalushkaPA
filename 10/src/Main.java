import car.CarFacade;

public class Main {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();

        // Запуск автомобиля
        System.out.println("Запуск автомобиля:");
        carFacade.startCar(22, "Зеленоглазое такси");

        // Остановка автомобиля
        System.out.println("\nОстановка автомобиля:");
        carFacade.stopCar();
    }
}
