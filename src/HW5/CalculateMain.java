package HW5;

public class CalculateMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        CalculatorWithMathCopy calcMath = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calcExtends = new CalculatorWithMathExtends();
        CalculatorWithCounter calcCount = new CalculatorWithCounter(calcExtends);

        System.out.println("CalculatorWithOperator");
        output(calc);
        System.out.println("CalculatorWithMathCopy");
        output(calcMath);
        System.out.println("CalculatorWithMathExtends");
        output(calcExtends);
        System.out.println("CalculatorWithCounter");
        output(calcCount);
        System.out.println("Количество операций: " + calcCount.getCountOperation());

        System.out.println("CalculatorWithMemory");
        CalculatorWithMemory calcMem = new CalculatorWithMemory(calc);
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result;
        result = calcMem.div(28,5);
        calcMem.setMemory(result);
        result = (calcMem.involution(calcMem.getMemory(),2));
        calcMem.setMemory(result);
        result = calcMem.sum(calcMem.mult(15,7),calcMem.getMemory());
        calcMem.setMemory(result);
        result = calcMem.sum(calcMem.getMemory(),4.1);
        calcMem.setMemory(result);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calcMem.round(result,3));
        System.out.println(calcMem.div(calcMem.getMemory(),0));
        System.out.println(calcMem.div(calcMem.getMemory(),0.0d));//неопределенность 0/0


        CalculatorStringExpression calcString = new CalculatorStringExpression(calcMem);
        calcString.findExpressionInBrackets("4.1d + 15d * 7d + (2.8d / 5d) ^ 2d");

    }

    public static void output(ICalculate calc) {
        double result = calc.sum(calc.sum(4.1,calc.mult(15,7)),calc.involution(calc.div(28,5),2));
        if (calc.getErrorCode() != 0) {
            System.out.println("Error!");
            return;
        }
        result = calc.round(result, 3);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result) ;
        System.out.println("result / 0 = " + calc.div(result, 0));
        System.out.println("result / 0 = " + calc.div(result,0.0d));

    }

}
