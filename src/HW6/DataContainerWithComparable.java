package HW6;

public class DataContainerWithComparable<T> extends DataContainer<T> implements Comparable{

    @Override
    public int compareTo(Object o) {
        if (o.getClass()==this.get(0).getClass()) return 0;
        else return 1;
    }

    public void sort() {
        T[] tmp = (T[])new Object[getLength()];
        System.arraycopy(getItems(), 0, tmp, 0, getLength());
        T tmp1 = (T) new Object();
        for (int i = 0; i < tmp.length; i++) 
        {
            for (int j = 0; j < tmp.length; j++) {


                if (compareTo(tmp[j]) != 0) {
                    //tmp1 =
                }
            }
        }
    }
}
