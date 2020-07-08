package HW2.Loops;

public class LoopsMain1_3 {
    public static void main(String[] args) {
        //вывод вариант 3
        System.out.println("\n\t\t\tТаблица умножения\n");
        for (int i = 1, k = 1, n = 2; i <= 9 && k <= 2; i++, System.out.println("")) {
            for (int j = n; j < n+4 && j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            }
            if (i == 9) {
                System.out.println("");
                i = 1;
                k++;
                n+=4;
            }
        }
    }
}