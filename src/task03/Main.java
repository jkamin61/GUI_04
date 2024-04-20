package task03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Max", 89.0, 23.2, 28.0);
        Animal cat = new Animal("Charlie", 35.0, 26.1, 16.2);
        List<Animal> animalsList = Arrays.asList(dog, cat);
        Predicate<Animal> isTall = animal -> animal.height > 50;
        Predicate<Animal> isFast = animal -> animal.topSpeed > 25;

        System.out.println("Tall animals:");
        animalsList.stream().filter(isTall).forEach(System.out::println);

        System.out.println("\nFast animals:");
        animalsList.stream().filter(isFast).forEach(System.out::println);
        }
    }
