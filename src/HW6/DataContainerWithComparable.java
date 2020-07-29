package HW6;

public class DataContainerWithComparable<T> extends DataContainer<T> implements Comparable{

    @Override
    public int compareTo(Object o) {
        if (o.getClass()==this.get(0).getClass()) return 0;
        else return 1;
    }

    
}
