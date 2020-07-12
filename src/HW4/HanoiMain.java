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
            if (playMode == 3) return;
            if (playMode == 1 || playMode == 2) break;
            System.out.println("Неверная комманда");
        } while (true);

        HanoiTower hanoi = new HanoiTower();

        if (playMode == 1)
            hanoi.play();
        else
            hanoi.playAutomat();
    }
}