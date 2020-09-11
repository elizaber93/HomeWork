package HW7_additionalTask.Currencies;

import HW7_additionalTask.Currencies.dto.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static boolean exitState;
    public static final Object lock = new Object();
    static MyFin site = new MyFin();
    static ICurrency usd = new USD();
    static ICurrency eur = new EUR();
    static ICurrency rub = new RUB();
    static StringBuilder content = new StringBuilder();

    public static void main(String[] args) throws IOException, InterruptedException {



        Thread waitingExit = new Thread(() ->{
            Scanner scan = new Scanner(System.in);
            synchronized (lock) {
                while (!exitState) {
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Для выхода нажмите q/Q");
                    exitState = scan.nextLine()
                                    .equalsIgnoreCase("q");

                     lock.notify();
                }
            }
        });
        Thread loading = new Thread(() -> {
            synchronized (lock) {
                while (!exitState) {
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    getGeneralState();

                    Main.lock.notify();

                }
            }
        });
        //waitingExit.setDaemon(true);
        loading.start();
        waitingExit.start();
        try {
            loading.join();
            waitingExit.join(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void getGeneralState() {
        content = site.load();
        usd.setCurrency(content);
        eur.setCurrency(content);
        rub.setCurrency(content);
        usd.printState();
        eur.printState();
        rub.printState();
    }

    public static void clear() {
        for (int i = 0; i < 25; i++) {
            System.out.println("\n");
        }
    }

}
