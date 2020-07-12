//package HW1;

import java.util.Scanner;



public class HomeWork1_4 {



    public static void main(String[] args) {

        boolean weekday;
        boolean vacation;

        weekday = getAnswer();
        vacation = !weekday;

        if (sleepIn(weekday,vacation))
            System.out.println("Можно спать дальше :)");
        else System.out.println("Подъем!!");

    }


    public static boolean getAnswer() {
        boolean weekday = false;

        System.out.println("Сейчас рабоочий день? y/n");

        while(true)
        {
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            answer = answer.trim();

            if      ((answer.length() > 1) ||
                    (!answer.equals("y") &&
                    !answer.equals("n")))
            {
                System.out.println("Введены невверные данные. Повторите");
                continue;
            }
            if (answer.equalsIgnoreCase("y"))
                weekday = true;


            return weekday;
        }

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (weekday && !vacation) {
            return false;
        }
        else if (!weekday && vacation) {
            return true;
        }
            else {
                return true;
        }

    }
}
