package factories;

import animals.Animal;
import animals.Cat;

public class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
