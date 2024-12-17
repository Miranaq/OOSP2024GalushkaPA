import animals.Animal;
import factories.AnimalFactory;
import factories.DogFactory;
import factories.CatFactory;
import factories.ParrotFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.makeSound(); // Гав!

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.makeSound(); // Мяу!

        AnimalFactory parrotFactory = new ParrotFactory();
        Animal parrot = parrotFactory.createAnimal();
        parrot.makeSound(); // Попугай говорит: Привет!
    }
}
