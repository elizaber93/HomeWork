package HW5;

import HW5.dto.CalculatorStringExpression;
import HW5.dto.CalculatorWithOperator;

public class CalculateMain6 {
    public static void main(String[] args) {
        CalculatorStringExpression calcString = new CalculatorStringExpression(new CalculatorWithOperator());
        calcString.findExpressionInBrackets("4.1d + 15d * 7d + (2.8d / 5d) ^ 2d");


    }
}
