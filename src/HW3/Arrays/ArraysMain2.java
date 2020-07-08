package HW3.Arrays;

public class ArraysMain2 {
    public static void main(String[] args) {
        int[] array1 = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        int[] array2 = {1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5};
        int[] array3 = {20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
        int[] array4 = {10};
        int[] array5 = {1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};
        int[] array6 = {5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10};

        arrayOutput(array1);
        arrayOutput(array2);
        arrayOutput(array3);
        arrayOutput(array4);
        arrayOutput(array5);
        arrayOutput(array6);
    }

    /***
     * Метод для поиска элемента, повторяющегося нечетное количество раз
     * @param a массив типа int, содержит ТОЛЬКО один элемент, повторяющийся нечетное количество раз
     * @return элемент массива, повторяющийся нечетное количество раз, если такой есть, и 0, если нет
     */
    public static int repetitionSearch(int [] a) {
        int[] repCountArray = new int[a.length];
        int repCount=0;
        for (int i = 0; i < a.length; i++) {
            repCount = 0;
            for (int value : a) {
                if (a[i] == value) {
                    repCount++;
                }
            }
            repCountArray[i] = repCount;
        }
        for (int i = 0; i < repCountArray.length; i++) {
            if (repCountArray[i] % 2 != 0) {
                return a[i];
            }
        }
        System.out.println("Не найдено элементов, повторяющихся нечетное количество раз.");
        return 0;
    }

    /***
     * Метод, выполняющий вывод массива в консоль и вывод информации о повторяющемся элементе
     * @param a
     */
    public static void arrayOutput(int[] a) {
        for (int i : a) {
            System.out.print(i +" ");
        }
        System.out.println("");
        if (repetitionSearch(a) != 0) {
            System.out.println("Элемент повторяющийся нечетное количество раз: " + repetitionSearch(a));
        }
    }
}
