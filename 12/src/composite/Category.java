package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Category extends MenuComponent {
    private String name;
    private List<MenuComponent> menuComponents = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Категория: " + getName());
        System.out.println("----------------------");
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return menuComponents.iterator();
    }
}
