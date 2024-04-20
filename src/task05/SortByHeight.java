package task05;

import java.util.Comparator;

public class SortByHeight implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Double.compare(o1.height, o2.height);
    }
}
