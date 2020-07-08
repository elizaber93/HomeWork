package HW1.OperatorsPriority;

public class PriorityMain4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;

        int result;


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        result = (a + b++) / --c;   //префиксный декремент вычисляется до выполнения операции, постфиксный - после
                                    // (5+2)/7 = 1
        System.out.println("(a + b++) / --c = " + result);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int result1;
        //result1 = (5 + 2++) / --8; //ошибка компиляции: унарный инкремент/декремент работает только с переменными
    }
}
