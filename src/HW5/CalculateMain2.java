package HW5;

import HW5.dto.CalculatorWithMathCopy;

public class CalculateMain2 {
    public static void main(String[] args) {
        CalculatorWithMathCopy calcMath = new CalculatorWithMathCopy();

        System.out.println("CalculatorWithMathCopy");

        double result;
        try{
            result = calcMath.sum(calcMath.sum(4.1,calcMath.mult(15,7)),calcMath.involution(calcMath.div(28,5),2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return;
        }

        result = calcMath.round(result, 3);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result) ;
        try{
            System.out.println("result / 0 = " + calcMath.div(result, 0));
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("result / 0 = " + calcMath.div(result,0.0d));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
