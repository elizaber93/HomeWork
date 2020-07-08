package HW1.Branching;

import java.util.Objects;
import java.util.Scanner;

public class BranchingMain2 {
    public static void main(String[] args) {

        //использование конструкции if

        System.out.println("Введите имя:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        if (Objects.equals(name, "Вася"))
            System.out.println("Привет!\nЯ так долго тебя ждал!");
        if (Objects.equals(name, "Анастасия"))
            System.out.println("Я тебя так долго ждал!");
        if (!(Objects.equals(name, "Вася") || Objects.equals(name, "Анастасия")))
            System.out.println("Добрый день, а Вы кто?");

    }
}
