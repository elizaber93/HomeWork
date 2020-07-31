package HW5;

import HW5.dto.CalculatorStringExpression;
import HW5.dto.CalculatorWithOperator;

public class CalculateMain6 {
    public static void main(String[] args) {
        String mathExpression = "4.1 + 15+50/2 * 7 + (((2 * 8 - 15 )/ (5-50)) ^ 2)";
        CalculatorStringExpression calcString = new CalculatorStringExpression(new CalculatorWithOperator());
        try {
            System.out.println(mathExpression+ " = " + calcString.getAnswer(mathExpression));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
