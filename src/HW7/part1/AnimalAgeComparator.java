package HW7.part1;
import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal a1, Animal a2) {
        if (a1.getAge() == a2.getAge()) return 0;
        return  (a1.getAge() > a2.getAge()) ?  1 : -1;
        //return Integer.compare(a1.getAge(),a2.getAge());
    }
}
