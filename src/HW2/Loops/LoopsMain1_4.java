package HW2.Loops;
import java.util.Scanner;
public class LoopsMain1_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("С какого числа начинаем таблицу умножения?");
        int n_begin = scan.nextInt();
        System.out.println("Введите количество столбцов в таблице умножения:");
        int n = scan.nextInt();
        int n_end = n_begin + n - 1;
        System.out.println("Сколько столбцов вы хотите поместить в одну строчку?");
        int n_column = scan.nextInt();
        for (int i = 1, k = 1; i <= 9 && k <= Math.ceil((double) n / n_column); i++, System.out.println("")) {
            for (int j = n_begin; j < n_begin + n_column && j <= n_end; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            }
            if (i == 9) {
                System.out.println("");
                i = 1;
                k++;
                n_begin += n_column;
            }
        }
    }
}