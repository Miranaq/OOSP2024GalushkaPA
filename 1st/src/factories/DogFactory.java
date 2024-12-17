package factories;

import animals.Animal;
import animals.Dog;

public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
