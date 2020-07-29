package HW6;

import java.util.Comparator;

public class DataContainerWithComparator<T> extends DataContainer<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        if (o1.getClass() == o2.getClass()) return 0;
        else return 1;
    }

}
