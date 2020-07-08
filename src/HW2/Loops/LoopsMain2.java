package HW2.Loops;

public class LoopsMain2 {
    public static void main(String[] args) {

        if (!argumentCheck(args)) {
            return;
        }

        System.out.println(args[0]);
        int product = 1;

        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {

            product *= i;
            System.out.print(i);

            if (i!=Integer.parseInt(args[0])) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + product);


        //вывод с промежуточными значениями
        product = 1;
        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {

            product *= i;
            System.out.println("Промежуточное значение:" + product);

        }
        System.out.println(" Итого " + product);
    }

    public static boolean argumentCheck(String [] args) {
        if (args.length == 0) {
            System.out.println("Аргументы не найдены.");
            return false;
        }

        if (Integer.parseInt(args[0]) <= 0) {
            System.out.println("Повторите запуск программы с положительным аргументом.");
            return false;
        }

        if (Integer.parseInt(args[0]) > 12) {
            System.out.println("Переполнение типа int. Повторите запуск с аргументом меньше 12");
            return false;
        }
        return true;
    }
}
