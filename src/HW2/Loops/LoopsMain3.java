package HW2.Loops;

public class LoopsMain3 {
    public static void main(String[] args) {

        if (!argumentCheck(args)) {
            return;
        }

        System.out.println("arg = " + args[0]);

        char [] numCharArray = args[0].toCharArray();
        int product = 1;

        for (int i = 0; i < numCharArray.length; i++)
        {
            product *= Character.getNumericValue(numCharArray[i]);
            System.out.print(numCharArray[i]);

            if (i!=numCharArray.length-1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + product);
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
        return true;
    }
}
