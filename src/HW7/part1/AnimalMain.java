package HW7.part1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AnimalMain {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logFile");
        FileHandler logFile;
        try {
            logFile = new FileHandler("logFile.log");
            logger.addHandler(logFile);
            SimpleFormatter formatter = new SimpleFormatter();
            logFile.setFormatter(formatter);

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }


        ArrayList<Animal> animList = new ArrayList<>();
        Random rnd = new Random();
        RandomString rndStr = new RandomString();
        long startFill = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            try {
                animList.add(new Animal(rndStr.random(5+rnd.nextInt(10)), rnd.nextInt(15)+1));
            } catch (IllegalArgumentException e) {
                logger.warning(e.getMessage());
            }
        }
        long endFill = System.currentTimeMillis();
        int fillTime = (int) (endFill - startFill);
        System.out.println("Время заполнения ArrayList: " + fillTime/6000 + "m " +fillTime%6000/1000 + "s " + fillTime%1000 + "ms");
        System.out.println("Скорость заполнения ArrayList: " + animList.size()/fillTime + " item/ms");
        System.out.println("Количество записей: " + animList.size());


        /*
        for (Animal animal : animList) {
            System.out.println(animal);
        }

         */
        long deleteStart = System.currentTimeMillis();
        do {
            animList.remove(0);
        } while (animList.size() != 0);
        long deleteEnd = System.currentTimeMillis();
        int deleteTime = (int)(deleteEnd - deleteStart);

        System.out.println("Время удаления всех элементов из ArrayList: " + deleteTime/60000+"m "+ deleteTime%60000/1000 + "s " + deleteTime%1000 + "ms");
        System.out.println("Скорость удаления записей из ArrayList: " + 1_000_000/deleteTime + " item/ms");
        System.out.println("Количество записей: " + animList.size());


    }
}
