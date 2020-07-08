package HW3.Arrays;
 import java.util.Arrays;

public class ArraysMain2_2 {
    public static void main(String[] args) {
        int[] array1 = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        int[] array2 = {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        int[] array3 = {20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
        int[] array4 = {10};
        int[] array5 = {1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};
        int[] array6 = {5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10};

        System.out.println(Arrays.toString(array1));
        System.out.println(repetitionSearch(array1));

        System.out.println(Arrays.toString(array2));
        System.out.println(repetitionSearch(array2));

        System.out.println(Arrays.toString(array3));
        System.out.println(repetitionSearch(array3));

        System.out.println(Arrays.toString(array4));
        System.out.println(repetitionSearch(array4));

        System.out.println(Arrays.toString(array5));
        System.out.println(repetitionSearch(array5));

        System.out.println(Arrays.toString(array6));
        System.out.println(repetitionSearch(array6));

    }

    /***
     * Метод для поиска элемента, повторяющегося нечетное количество раз
     * @param a массив типа int, содержит ТОЛЬКО один элемент, повторяющийся нечетное количество раз
     * @return элемент массива, повторяющийся нечетное количество раз, если такой есть, и 0, если нет
     */
    public static int repetitionSearch(int[] a) {
        int result = 0;
        for (int value : a) {
            result ^= value;
        }
        return result;
    }
}