package HW5;

import HW5.dto.CalculatorWithCounter;
import HW5.dto.CalculatorWithMathExtends;

public class CalculateMain4 {
    public static void main(String[] args) {
        CalculatorWithCounter calcCount = new CalculatorWithCounter(new CalculatorWithMathExtends());
        System.out.println("CalculatorWithCounter");

        double result;
        try{
            result = calcCount.sum(calcCount.sum(4.1,calcCount.mult(15,7)),calcCount.involution(calcCount.div(28,5),2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return;
        }

        result = calcCount.round(result, 3);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result) ;
        System.out.println("Количество операций: " + calcCount.getCountOperation());
        try{
            System.out.println("result / 0 = " + calcCount.div(result, 0));
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("result / 0 = " + calcCount.div(result,0.0d));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Количество операций: " + calcCount.getCountOperation());

    }

}
