package HW2.Loops;

public class LoopsMain1 {
    public static void main(String[] args) {
        //вывод вариант 1
        System.out.println("\n\t\t\tТаблица умножения\n");
        for (int i = 1; i <= 9; i++, System.out.println("")) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            }
        }
        System.out.println("");
        for (int i = 1; i <=9; i++, System.out.println("")) {
            for (int j = 6; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t");
            }
        }
    }
}
