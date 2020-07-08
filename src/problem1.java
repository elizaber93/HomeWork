import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c;
        if (a==0) {
            c = 0;
            System.out.println(c);
            return;
        }

        if (a == Double.POSITIVE_INFINITY ||
                a == Double.MAX_VALUE ||
                a == Double.MIN_VALUE ||
                a == Double.NEGATIVE_INFINITY ||
                b == Double.POSITIVE_INFINITY ||
                b == Double.MAX_VALUE ||
                b == Double.MIN_VALUE ||
                b == Double.NEGATIVE_INFINITY)
         {
            System.out.println("Переполнение в аргументах");
             System.out.println(a);
             System.out.println(b);
            return;
        }
        c = Math.pow(a,b);

        if (c == Double.POSITIVE_INFINITY ||
                c == Double.MAX_VALUE ||
                c == Double.MIN_VALUE ||
                c == Double.NEGATIVE_INFINITY ||
                c == 0.0
                )
        {
            System.out.println("Переполнение");
            System.out.println(c);
            return;
        }
        System.out.println(c);
    }


}
