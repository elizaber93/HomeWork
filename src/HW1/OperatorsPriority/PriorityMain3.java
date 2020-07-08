package HW1.OperatorsPriority;

public class PriorityMain3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;

        int result;


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        result = (a + b++) / c;
        System.out.println("(a + b++) / c = " + result);//0 т.к. тип int берет только целую часть от деления, отбрасывая дробную

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int result1;
        //result1 = (5 + 2++) / 8; //ошибка компиляции: унарный инкремент работает только с переменными

    }
}
