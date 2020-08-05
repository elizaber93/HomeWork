package HW7.part1;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class PersonMain {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logFile");
        FileHandler logFile;
        try {
            logFile = new FileHandler("d:\\it_academy\\jd1\\logFile.log");
            logger.addHandler(logFile);
            SimpleFormatter formatter = new SimpleFormatter();
            logFile.setFormatter(formatter);

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

        RandomString rndStr = new RandomString();
        Random rnd = new Random();


        long startFill = System.currentTimeMillis();
        LinkedList<Person> personList = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            try {
                personList.add(new Person(  rndStr.random(5+rnd.nextInt(15)),
                                            rndStr.random(5+rnd.nextInt(5))));

            } catch (IllegalArgumentException e) {
                logger.warning(e.getMessage());
            }

        }
        long endFill = System.currentTimeMillis();
        int fillTime = (int) (endFill - startFill);
        System.out.println("Время заполнения LinkedList: " + fillTime/1000 + "s " + fillTime%1000 + "ms");
        System.out.println("Скорость заполнения LinkedList: " + personList.size()/fillTime + " item/ms");
        System.out.println("Количество записей: " + personList.size());


        /*
        personList.sort(new PersonPasswordComparator());
        for (Person person : personList) {
            System.out.println(person);
        }
        personList.sort(new PersonPasswordAndNickComparator());
        for (Person person : personList) {
            System.out.println(person);
        }

         */
        long deleteStart = System.currentTimeMillis();
        Iterator<Person> iter = personList.iterator();
        while(iter.hasNext()){
            iter.next();
            iter.remove();
        }

        long deleteEnd = System.currentTimeMillis();
        int deleteTime = (int)(deleteEnd - deleteStart);

        System.out.println("Время удаления всех элементов из LinkedList: " + deleteTime/60000+"m "+ deleteTime%60000/1000 + "s " + deleteTime%1000 + "ms");
        System.out.println("Скорость удаления записей из LinkedList: " + 1_000_000/deleteTime + " item/ms");
        System.out.println("Количество записей: " + personList.size());
    }
}
