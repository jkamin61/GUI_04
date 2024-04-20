package task05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal dog = new Animal("Max", 89.0, 23.2, 28.0);
        Animal cat = new Animal("Charlie", 35.0, 26.1, 16.2);
        Animal lion = new Animal("Aspen", 172.0, 32.1, 76.2);
        Animal giraffe = new Animal("Leon", 287.0, 17.1, 127.2);
        Animal hedgehog = new Animal("Tom", 23.0, 6.1, 12.2);
        List<Animal> animalsList = Arrays.asList(dog, cat, lion, giraffe, hedgehog);
        animalsList.sort(new SortByHeight());
        System.out.println("List of animals sorted by height: ");
        animalsList.forEach(animal -> System.out.println(animal.name+" "+animal.height+" cm"));
    }
}
