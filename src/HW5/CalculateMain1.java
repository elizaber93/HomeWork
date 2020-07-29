package HW5;

import HW5.dto.CalculatorWithOperator;

public class CalculateMain1 {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();

        System.out.println("CalculatorWithOperator");

        double result;
        try{
            result = calc.sum(calc.sum(4.1,calc.mult(15,7)),calc.involution(calc.div(28,5),2));
            result = calc.round(result, 3);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return;
        }


        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result) ;
        try{
            System.out.println("result / 0 = " + calc.div(result, 0));
            System.out.println("result / 0 = " + calc.div(result,0.0d));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
