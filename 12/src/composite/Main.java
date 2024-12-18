package composite;

public class Main {
    public static void main(String[] args) {
        // Создаем категории
        Category appetizers = new Category("Закуски");
        Category mainCourses = new Category("Основные блюда");
        Category desserts = new Category("Десерты");

        // Создаем блюда
        Dish salad = new Dish("Салат цезарь", 137.99);
        Dish soup = new Dish("Борщ", 105.99);
        Dish pasta = new Dish("Макароны с грибами", 119.99);
        Dish pizza = new Dish("Пицца с ананасами", 75.99);
        Dish cheesecake = new Dish("Чизкейк", 156.99);

        // Добавляем блюда в категории
        appetizers.add(salad);
        appetizers.add(soup);
        mainCourses.add(pasta);
        mainCourses.add(pizza);
        desserts.add(cheesecake);

        // Создаем главное меню
        Category menu = new Category("Меню ресторана");
        menu.add(appetizers);
        menu.add(mainCourses);
        menu.add(desserts);

        // Печатаем меню
        menu.print();
    }
}
