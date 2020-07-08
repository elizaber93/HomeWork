package HW2.Loops;

public class LoopsMain1_2 {
    public static void main(String[] args) {
        //вывод вариант 2
        System.out.println("\n\t\t\tТаблица умножения\n");
        for(int i = 1; i <= 18; i++, System.out.println("")) {
            for (int j = 2; j <= 9; j++) {
                if (i <= 9 && j <= 5) {
                    System.out.print(j + " x " + i + " = " + j*i +"\t");
                } else if (i > 9 && j > 5) {
                    System.out.print(j + " x " + (i-9) + " = " + j*(i-9)+"\t");
                }
                if (i == 9 && j == 5)
                    System.out.println("");
            }
        }
    }
}