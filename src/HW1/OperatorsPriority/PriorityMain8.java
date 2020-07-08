package HW1.OperatorsPriority;

public class PriorityMain8 {
    public static void main(String[] args) {
        boolean result;
        result = 6-2 > 3 && 12*12 <= 119;//(4>3) && (144 <= 119) => true && false => false по т.истинности
        System.out.println(result);

        boolean result1;
        result1 = true && false;
        System.out.println(result1);//false по т. истинности
    }
}
