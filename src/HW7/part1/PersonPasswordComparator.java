package HW7.part1;
import java.util.Comparator;

public class PersonPasswordComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getPassword().length() == p2.getPassword().length()) return 0;
        else if (p1.getPassword().length() > p2.getPassword().length()) return 1;
        else return -1;
    }
}
