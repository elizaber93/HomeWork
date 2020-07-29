package HW6;

import Obj.dto.Man;
import collections.dto.HairManComparator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DataMain {
    public static void main(String[] args) {
        DataContainer<Object> data = new DataContainer<>();
        Man man1 = new Man(20);
        data.add("String");
        data.add(man1);
        data.add(124);
        data.add(new Man(10));
        int [] arr = {1, 2, 3};
        data.add(arr);
        data.output();
        System.out.println("delete 1st");
        data.delete(0);
        data.output();
        System.out.println("delete man1 ind 1");
        data.delete(arr);
        data.output();


        System.out.println("\n Comparable\n");


        //List<Object> dataComparable = new;
        DataContainerWithComparable<Object> dataComparable = new DataContainerWithComparable<>();

        dataComparable.add("String");
        dataComparable.add(man1);
        dataComparable.add(124);
        dataComparable.add(new Man(10));
        dataComparable.add(arr);
        //dataComparable.compareTo(dataComparable);
        //dataComparable.output();




    }
}
