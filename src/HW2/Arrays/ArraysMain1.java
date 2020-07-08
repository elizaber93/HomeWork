package HW2.Arrays;

import java.util.Scanner;

public class ArraysMain1 {
    public static void main(String[] args) {
        int num = 0; //количество элементов массива
        Scanner scan = new Scanner(System.in);
        int []intArray = new int[num];


        System.out.println("Введите количество элементов массива:");
        num = scan.nextInt();


        System.out.println("Введите " + num + " элемента(-ов):");

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scan.nextInt();
        }

        for (int i : intArray) {
            i = scan.nextInt();
        }

        System.out.println("Полученный массив:");

        System.out.println("Цикл for:");
        intArrayOutputForLoop(intArray);

        System.out.println("\nЦикл foreach:");
        intArrayOutputForeachLoop(intArray);

        System.out.println("\nЦикл while:");
        intArrayOutputWhileLoop(intArray);

        System.out.println("\nЦикл do ... while:");
        intArrayOutputDoWhileLoop(intArray);

        System.out.println("\nКаждый второй элемент массива:");
        for (int i = 0; i < intArray.length; i+=2) {

            System.out.print(intArray[i] + "\t");

        }

        System.out.println("\nСортировка по возрастанию:");
        intArrayAscendingSort(intArray);
        intArrayOutputForLoop(intArray);

        System.out.println("\nСортировка по убыванию:");
        intArrayDescendingSort(intArray);
        intArrayOutputForLoop(intArray);


    }

    /***
     * Метод выводит массив в консоль с использованием цикла for
     * @param array - массив, содержащий элементы типа int
     */
    public static void intArrayOutputForLoop(int [] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "\t");

        }
    }

    /***
     * Метод выводит массив в консоль с использованием цикла foreach
     * @param array - массив, содержащий элементы типа int
     */
    public static void intArrayOutputForeachLoop(int [] array) {
        for (int element  : array) {
            System.out.print(element + "\t");
        }
    }

    /***
     * Метод выводит массив в консоль с использованием цикла while
     * @param array - массив, содержащий элементы типа int
     */
    public static void intArrayOutputWhileLoop(int [] array) {
        int i = 0;
        while (i<array.length) {
            System.out.print(array[i] + "\t");
            i++;
        }
    }

    /***
     * Метод выводит массив в консоль с использованием цикла do ... while
     * @param array - массив, содержащий элементы типа int
     */
    public static void intArrayOutputDoWhileLoop(int [] array) {
        int i = 0;
        do {
            System.out.print(array[i] + "\t");
            i++;
        } while(i < array.length);
    }

    /***
     * Метод выполняет сортировку полученного массива по возрастанию
     * @param array - массив, содержащий элементы типа int
     */
    public static void intArrayAscendingSort(int [] array) {
        int k = 0;
        for (int i = 0; i< array.length; i++) {
            for (int j = 0; j< array.length; j++) {
                if (array[i] < array[j]) {
                    k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
    }

    /***
     * Метод выполняет сортировку полученного массива по убыванию
     * @param array - массив, содержащий элементы типа int
     */
    public static void intArrayDescendingSort(int [] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j< array.length; j++) {
                if (array[i] > array[j]) {
                    k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
    }
}
