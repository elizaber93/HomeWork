package HW1.Branching;

import java.util.Scanner;

public class BranchingMain3 {
    public static void main(String[] args) {

        //использование конструкции switch

        System.out.println("Введите имя:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        switch (name) {
            case "Вася":
                System.out.println("Привет!\nЯ так долго тебя ждал!");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал!");
                break;
            default:
                System.out.println("Добрый день, а Вы кто?");
                break;
        }



    }
}
