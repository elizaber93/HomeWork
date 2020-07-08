package HW1.Branching;

import java.util.Scanner;

public class BranchingMain1 {
    public static void main(String[] args) {

        //использование конструкции else if

        System.out.println("Введите имя:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        if (name.equalsIgnoreCase("вася"))
            System.out.println("Привет!\nЯ так долго тебя ждал!");
        else if (name.equalsIgnoreCase("анастасия"))
            System.out.println("Я тебя так долго ждал!");
        else System.out.println("Добрый день, а Вы кто?");

    }
}
