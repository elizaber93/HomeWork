package HW1.OperatorsPriority;

public class PriorityMain6 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;

        int result;
        result = (a+7>20?68:22*2>>b++)/--c;//13>20 = false => 22*2>>2/7 => 11/7=1
        System.out.println("(5 + 7>20 ? 68 : 22 * 2>>2++)/--8 = " + result);//1


        int result1 = 0;
        //result1 = (5 + 7>20?68:22*2>>2++)/--8;//ошибка компиляции: унарный инкремент/декремент работате только с переменными
    }
}
