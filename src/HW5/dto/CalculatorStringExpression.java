package HW5.dto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorStringExpression extends CalculatorWithOperator implements ICalculate {
    String mathExpression = "";
    ICalculate calc;
    public CalculatorStringExpression(ICalculate calc) {
        this.calc = calc;
    }

    public void findExpressionInBrackets(String mathExpression) {
        this.mathExpression = mathExpression;

        //String regEx = "[0-9/^*+ \\.()]*";
        String regEx1 = "[(][0-9d/^*+ \\.]+[)]";
        String newExp = "";
        Pattern pattern = Pattern.compile(regEx1);
        Matcher matcher = pattern.matcher(mathExpression);
        while (matcher.find()) {
            System.out.println(matcher.group());
            newExp = matcher.group();
            this.mathExpression = this.mathExpression.replaceFirst(regEx1, calculateBrackets(newExp));
            System.out.println(this.mathExpression);
        }

    }
    public String calculateBrackets(String mathExp) {
        String regEx = "[0-9d\\.]+[ /*^]+[0-9d\\.]+";
        String regExDiv = "[ /]+";
        String regExMult = "[ *]+";
        String regExInv = "[ ^]+";
        double result = 0;
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(mathExp);
        while (matcher.find()) {
            System.out.println(matcher.group());

            Pattern pat1 = Pattern.compile(regExMult);
            Matcher match1 = pat1.matcher(matcher.group());
            if (match1.find()) {
                System.out.println(match1.group());
                String[] numbers = matcher.group().split(regExMult);
                result = calc.mult(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1]));
                break;
            }
            Pattern pat2 = Pattern.compile(regExDiv);
            Matcher match2 = pat2.matcher(matcher.group());
            if (match2.find()) {
                String[] numbers = matcher.group().split(regExDiv);
                result = calc.div(Double.parseDouble(numbers[0]),Double.parseDouble(numbers[1]));
                break;
            }

            Pattern pat3 = Pattern.compile(regExInv);
            Matcher match3 = pat3.matcher(matcher.group());
            if (match3.find()) {
                String[] numbers = matcher.group().split(regExInv);
                result = calc.involution(Double.parseDouble(numbers[0]),Integer.parseInt(numbers[1]));
                break;
            }
            }
        return Double.toString(result);
    }

}
