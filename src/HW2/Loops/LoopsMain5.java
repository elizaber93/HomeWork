package HW2.Loops;

public class LoopsMain5 {
    public static void main(String[] args) {
        long a = 1L;

        while (a < Long.MAX_VALUE/3) {
            a = a * 3;
        }

        System.out.println("a = " + a);
        System.out.println("next a = " + a * 3);
    }
}
