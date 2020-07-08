package HW1.OperatorsPriority;

public class PriorityMain1 {
    public static void main(String[] args) {


        int a = 5;
        int b = 2;
        int c = 8;

        int result;

        result = a + b / c; //5
                            //2 / 8 = 0 т.к. тип int берет только целую часть от деления, отбрасывая дробную

        System.out.println("5 + 2 / 8 = " + result);
        int result1;
        result1 = 5 + 2 / 8;
        System.out.println("5 + 2 / 8 = " + result1); //5
    }
}
