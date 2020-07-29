package HW5;

import HW5.dto.CalculatorWithMathExtends;

public class CalculateMain3 {
    public static void main(String[] args) {
        CalculatorWithMathExtends calcExtends = new CalculatorWithMathExtends();
        System.out.println("CalculatorWithMathExtends");

        double result;
        try{
            result = calcExtends.sum(calcExtends.sum(4.1,calcExtends.mult(15,7)),calcExtends.involution(calcExtends.div(28,5),2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return;
        }

        result = calcExtends.round(result, 3);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result) ;
        try{
            System.out.println("result / 0 = " + calcExtends.div(result, 0));
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("result / 0 = " + calcExtends.div(result,0.0d));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
