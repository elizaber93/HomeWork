package HW1.OperatorsPriority;

public class PriorityMain2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;

        int result;

        result = (a + b) / c;
        System.out.println("(5 + 2) / 8 = " + result); //0

        int result1;
        result1 = (5 + 2) / 8; //0
        System.out.println("(5 + 2) / 8 = " + result1);
    }
}
