package HW4;
import HW4.dto.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HanoiMain {
    public static void main(String[] args) {


        int playMode;

        do {
            System.out.println("Выберите режим игры:\n1. Ручной\n2. Автоматический\n3. Выход");
            try {
                Scanner scan = new Scanner(System.in);
                playMode = scan.nextInt();

            } catch (InputMismatchException ex) {
                playMode = 0;
            }
            switch (playMode) {
                case 1:
                    HanoiTower hanoi = new HanoiTower();
                    hanoi.playAutomat(); break;
                case 2:
                    HanoiTower1 hanoi1 = new HanoiTower1();
                    hanoi1.playAutomat(); break;
                case 3:
                    System.out.println("Всего доброго!");
                    return;
                default:
                    System.out.println("Неверная комманда");
            }
        } while (true);

    }
}