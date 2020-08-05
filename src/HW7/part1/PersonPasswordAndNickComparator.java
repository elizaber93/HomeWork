package HW7.part1;

import java.util.Comparator;

public class PersonPasswordAndNickComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getPassword().length() == p2.getPassword().length()) {
            int index=0;
            do {
                if (p1.getNick().charAt(index) == p2.getNick().charAt(index) )
                    index++;
                else
                    return Character.compare(p1.getNick().charAt(index),p2.getNick().charAt(index));

            } while (index < p1.getNick().length() && index < p2.getNick().length());
            return (p1.getNick().length() > p2.getNick().length()) ? 1 : -1;

        }
        if (p1.getPassword().length() > p2.getPassword().length()) return 1;
        else return -1;
    }

}
