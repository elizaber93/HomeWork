package HW7.part1;

import java.util.Comparator;

public class AnimalAgeAndNickComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        if (a1.getAge() == a2.getAge()) {
            int index=0;
            do {
                if (a1.getNick().charAt(index) == a2.getNick().charAt(index) )
                    index++;
                else
                    return Character.compare(a1.getNick().charAt(0),a2.getNick().charAt(0));

            } while (index < a1.getNick().length() && index < a2.getNick().length());
            return (a1.getNick().length() > a2.getNick().length()) ? 1 : -1;
        }
        if (a1.getAge() > a2.getAge()) return 1;
        else return -1;
    }

}
