package task03;

public class Animal {
    String name;;
    double height, topSpeed, weight;

    public Animal(String name, double height, double topSpeed, double weight) {
        this.name = name;
        this.height = height;
        this.topSpeed = topSpeed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", topSpeed=" + topSpeed +
                ", weight=" + weight +
                '}';
    }
}
