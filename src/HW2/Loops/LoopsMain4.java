package HW2.Loops;

import java.util.Scanner;

public class LoopsMain4 {
    public static void main(String[] args) {
        int number = 0;
        int degree = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 2 числа:");
        try {
            number = scan.nextInt();
            degree = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Переполнение типа int");
            return;
        }

        double result = involution(number, degree);
        if (number != 0 && result == 0) {
            return;
        }

        System.out.println(number + " в степени " + degree + " равно " + result);

    }

    /***
     *
     * @param number - число
     * @param degree - степень, в которую необходимо возвести число
     * @return возвращает возведения в степень типа double
     */
    public static double involution(int number, int degree) {
        double result = number;
        if (degree == 0) {
            return 1;
        }
        for (int i = 1; i < Math.abs(degree); i++) {
            result *= number;
        }
        if (!resultCheck(result)) {
            System.out.println("Переполнение типа double");
            return 0;
        }
        if (degree < 0) {
            return 1/result;
        }
        return result;
    }

    /***
     * Метод выполняющий проверку результата вычислений
     * @param a - число принадлежащее типу double
     * @return true - если не возникает переполнения
     *          false - если возникает переполнение типа double
     */
    public static boolean resultCheck(double a) {
        return a != Double.POSITIVE_INFINITY &&
                a != Double.MAX_VALUE &&
                a != Double.MIN_VALUE &&
                a != Double.NEGATIVE_INFINITY &&
                a != 0.0;
    }

}

