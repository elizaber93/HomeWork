package HW1;

import java.util.Scanner;

public class HomeWork1_6 {

    public static void main(String[] args) {

        int n = 10; //количество цифр номера
        int[] numArray;//массив хранящий цифры номера
        String number; //строка хранящая строку из консоли

        while (true) {
            number = getNumber();
            if (isRight(number)) break;
            }

        numArray = numberStringToCharArray(number);

        System.out.println("Номер телефона:");
        System.out.println(createPhoneNumber(numArray));
    }

    public static String getNumber() {
        System.out.println("Введите номер телефона:");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();

    }

    //метод возвращающий номер в заданном формате
    public static String createPhoneNumber(int[] numArray) {
        String phoneNumber = "";

        int nCode = 3;
        int nNumberPart1 = 3;
        StringBuilder code = new StringBuilder();
        StringBuilder numberPart1 = new StringBuilder();
        StringBuilder numberPart2 = new StringBuilder();

        for (int i = 0; i < nCode; i++) {
            code.append(numArray[i]);
        }
        for (int i = nCode; i < nCode + nNumberPart1; i++)
            numberPart1.append(numArray[i]);
        for (int i = nCode + nNumberPart1; i < numArray.length; i++) {
            numberPart2.append(numArray[i]);

        }

        phoneNumber = "(" + code + ") " + numberPart1 + "-" + numberPart2;

        return phoneNumber;

    }

    //метод проверяющий количество введенных цифр


    public static boolean isRight(String number) {
        if (number.length() > 10 || number.length() < 8) {
            System.out.println("Проверьте вводимые данные");
            return false;
        } else return true;
    }

    //метод  добаляющий при необходимости символы к строке и преобразующий строку в числовой массив
    public static int[] numberStringToCharArray(String number) {
        int n = 10; //количество цифр номера
        int[] numArray = new int[n];

        if (number.length() == 8) number = "00" + number;
        if (number.length() == 9) number = "0" + number;
        char[] charArray = number.toCharArray();
        for (int i = 0; i < charArray.length; i++)
            numArray[i] = Character.getNumericValue(charArray[i]);
        return numArray;
    }
}
