package composite;

public class Dish extends MenuComponent {
    private String name;
    private double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Блюдо: " + getName() + ", Цена: Р" + getPrice());
    }
}
