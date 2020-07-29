package HW6;

public class DataContainer<T> {
    private T[] data;
    private int dataLength = 0;

    public DataContainer() {
        this.data = (T[])new Object[1];
        //this.data = (T[])Array.newInstance(Object.class, 1);
    }

    public int getLength() {
        try {
            return this.data.length;
        } catch (Exception e) {
            return 0;
        }
    }

    public int add(T item) {
        if (this.dataLength != 0) {
            T[] tmp = (T[]) new Object[this.data.length];
            System.arraycopy(this.data, 0, tmp, 0, this.data.length);
            this.data = (T[]) new Object[tmp.length + 1];
            System.arraycopy(tmp, 0, this.data, 0, tmp.length);
        }
        this.data[this.data.length-1] = item;
        this.dataLength++;
        return this.data.length-1;
    }

    public T get(int index) {
        try{
            return this.data[index];
        } catch (Exception e) {
            return null;
        }

    }

    public T[] getItems() {
        try{
            return this.data;
        } catch (Exception e) {
            return null;
        }
    }

    boolean delete(int index) {
        if (index < 0 || index > this.data.length-1)
            return false;
        else if (index == 0) {
            T[] tmp = (T[]) new Object[data.length - 1];
            System.arraycopy(this.data, 1, tmp, 0, tmp.length);
            this.data = (T[]) new Object[tmp.length];
            System.arraycopy(tmp, 0, this.data, 0, tmp.length);
        } else if (index == this.data.length-1) {
            T[] tmp = (T[]) new Object[data.length - 1];
            System.arraycopy(this.data, 0, tmp, 0, tmp.length);
            this.data = (T[]) new Object[tmp.length];
            System.arraycopy(tmp, 0, this.data, 0, tmp.length);
        } else {
            T[] tmp1 = (T[]) new Object[index];
            T[] tmp2 = (T[]) new Object[this.data.length-index-1];
            System.arraycopy(this.data, 0, tmp1, 0, tmp1.length);
            System.arraycopy(this.data, index+1, tmp2, 0, tmp2.length);
            this.data = (T[])new Object[tmp1.length+tmp2.length];
            System.arraycopy(tmp1,0,this.data,0,tmp1.length);
            System.arraycopy(tmp2, 0, this.data, tmp1.length, tmp2.length);
        }
        return true;
    }

    public boolean delete(T item) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i].equals(item)) {
                this.delete(i);
                return true;
            }
        }
        return false;
    }

    public void output() {
        for (T datum : this.data) {
            System.out.println(datum);
        }
    }

}
