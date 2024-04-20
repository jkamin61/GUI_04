package task02;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Max", 89.0, 23.2, 28.0);
        Animal cat = new Animal("Charlie", 35.0, 26.1, 16.2);
        List<Animal> animalsList = Arrays.asList(dog, cat);
        for (Animal animal : animalsList) {
            if (animal.topSpeed > 25) {
                System.out.println(animal.name);
            }
        }
        animalsList.stream()
                .filter(e -> e.topSpeed > 25)
                .map(e -> e.name)
                .forEach(System.out::println);
    }
}
