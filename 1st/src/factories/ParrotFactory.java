package factories;

import animals.Animal;
import animals.Parrot;

public class ParrotFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Parrot();
    }
}
