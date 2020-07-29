package HW6;

import java.util.Comparator;

public class DataContainerWithComparator<T> extends DataContainer<T> implements Comparator<T> {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1.getClass() == o2.getClass()) return 0;
        else return 1;
    }

    public void output() {
        for (T datum : this.getItems()) {
            System.out.println(datum);
        }
    }


}
