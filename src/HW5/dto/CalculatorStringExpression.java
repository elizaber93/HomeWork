package HW5.dto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorStringExpression extends CalculatorWithOperator implements ICalculate {
    String mathExpression = "";
    private final String firstPriorRegEx = "[0-9\\.]+[ /*^]+[0-9\\.]+";
    private final String secondPriorRegEx = "[0-9\\.]+[ \\+-]+[0-9\\.]+";
    private final String bracketRegEx = "[(][0-9/^*\\+\\- \\.]+[)]";

    ICalculate calc;
    public CalculatorStringExpression(ICalculate calc) {
        this.calc = calc;
    }

    /***
     * Метод выполняющий проверку валидности полученного выражения
     * @param mathExpression - выражение, содержащее вещественные или целые числа, знаки математических операций +-/^*, а также скобки
     * @return  true, если выражение записано верно
     *          false, если допущена ошибка
     */
    public boolean isValid(String mathExpression) {
        String regExGeneral = "[0-9\\.+-/^*()]+";
        Pattern patGeneral = Pattern.compile(regExGeneral);
        Matcher matchGeneral = patGeneral.matcher(mathExpression);
        if (!matchGeneral.find()) return false;
        String regExNum = "[0-9\\.]+";
        Pattern patNum = Pattern.compile(regExNum);
        Matcher matchNum = patNum.matcher(mathExpression);
        int numCount = 0;
        while (matchNum.find()) {
            numCount++;
        }
        String regExOperators = "[\\+\\*\\-\\^\\/]+";
        Pattern patOperators = Pattern.compile(regExOperators);
        Matcher matchOperators = patOperators.matcher(mathExpression);
        int operatorCount = 0;
        while (matchOperators.find()) {
            operatorCount++;
        }
        if (operatorCount != numCount-1) return false;
        String regExBrackets = "[()]";
        Pattern patBrackets = Pattern.compile(regExBrackets);
        Matcher matchBrackets = patBrackets.matcher(mathExpression);
        int bracketsCount = 0;
        while (matchBrackets.find()) {
            bracketsCount++;
        }
        return bracketsCount % 2 == 0;

    }

    /***
     * Метод выполняющий поиск выражений в скобках
     * @param mathExpression - математическое выражение
     * @return  true, если в заданном примере присутствуют выражения в скобках
     *          false, если нет
     */
    public boolean findExpressionInBrackets(String mathExpression) {
        Pattern pattern = Pattern.compile(bracketRegEx);
        Matcher matcher = pattern.matcher(mathExpression);
        return matcher.find();

    }

    /***
     * Метод возвращающий выражение из скобок
     * @param mathExpression - математическое выражение
     * @return  выражение из скобок, если оно присутствует
     *          пустая строка, если отсутствует
     */
    public String getExpressionInBrackets(String mathExpression) {
        Pattern pattern = Pattern.compile(bracketRegEx);
        Matcher matcher = pattern.matcher(mathExpression);
        if (!matcher.find()) return "";
        else {
            String expRegEx = "[0-9/^*\\+\\- \\.]+";
            Pattern pattern1 = Pattern.compile(expRegEx);
            Matcher matcher1 = pattern1.matcher(matcher.group());
            if (matcher1.find()) {
                return matcher1.group();
            }
        }
        return "";

    }

    /***
     * Метод выполняющий поиск первоприоритетных операций *^/
     * @param mathExp - математическое выражение
     * @return  true, если таковые операции присутствуют в выражении
     *          false, если отсутствуют
     */
    public boolean findFirstPriorExpression(String mathExp) {
        Pattern pattern = Pattern.compile(firstPriorRegEx);
        Matcher matcher = pattern.matcher(mathExp);
        return matcher.find();
    }

    /***
     * Метод выполняющий поиск неприоритетных операций +-
     * @param mathExp - математическое выражение
     * @return  true, если таковые операции присутствуют в выражении
     *          false, если отсутствуют
     */
    public boolean findSecondPriorExpression(String mathExp) {
        Pattern pattern = Pattern.compile(secondPriorRegEx);
        Matcher matcher = pattern.matcher(mathExp);
        return matcher.find();
    }

    /***
     * Метод возвращающий строку содержащую пероприоритетную операцию *^/ с двумя операндами
     * @param mathExp - математическое выражение
     * @return  строку содержащую пероприоритетную операцию *^/ с двумя операндами
     *          пустая строка, если таковые операции отсутствуют
     */
    public String getFirstPriorExpression(String mathExp) {
        Pattern pattern = Pattern.compile(firstPriorRegEx);
        Matcher matcher = pattern.matcher(mathExp);
        if (matcher.find()) return matcher.group();
        return "";
    }

    /***
     * Метод возвращающий строку содержащую неприоритетную операцию +- с двумя операндами
     * @param mathExp - математическое выражение
     * @return  строку содержащую неприоритетную операцию +- с двумя операндами
     *          пустая строка, если таковые операции отсутствуют
     */
    public String getSecondPriorExpression(String mathExp) {
        Pattern pattern = Pattern.compile(secondPriorRegEx);
        Matcher matcher = pattern.matcher(mathExp);
        if (matcher.find()) return matcher.group();
        return "";
    }

    /***
     * Метод выполняющий вычисление какой-либо математической операции с двумя операндами
     * @param mathExp математическое выражение
     * @return  строка, содержащая результат вычисления
     *          пустая строка, если операций не найдено
     */
    public String calculateExpression(String mathExp) {

            String regExDiv = "/";
            String regExMult = "\\*";
            String regExInv = "\\^";
            String regExSum = "\\+";
            String regExDiff = "-";
            Pattern patMult = Pattern.compile(regExMult);
            Matcher matchMult = patMult.matcher(mathExp);
            if (matchMult.find()) {
                String[] numbers = mathExp.split(regExMult);
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = numbers[i].trim();
                }
                return Double.toString(calc.mult(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1])));
            }
            Pattern patDiv = Pattern.compile(regExDiv);
            Matcher matchDiv = patDiv.matcher(mathExp);
            if (matchDiv.find()) {
                String[] numbers = mathExp.split(regExDiv);
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = numbers[i].trim();
                }
                return Double.toString(calc.div(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1])));
            }
            Pattern patInv = Pattern.compile(regExInv);
            Matcher matchInv = patInv.matcher(mathExp);
            if (matchInv.find()) {
                String[] numbers = mathExp.split(regExInv);
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = numbers[i].trim();
                }
                return Double.toString(calc.involution(Double.parseDouble(numbers[0]), Integer.parseInt(numbers[1])));
            }
            Pattern patSum = Pattern.compile(regExSum);
            Matcher matchsum = patSum.matcher(mathExp);
            if (matchsum.find()) {
                String[] numbers = mathExp.split(regExSum);
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = numbers[i].trim();
                }
                return Double.toString(sum(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1])));
            }
            Pattern patDiff = Pattern.compile(regExDiff);
            Matcher matchDiff = patDiff.matcher(mathExp);
            if (matchDiff.find()) {
                String[] numbers = mathExp.split(regExDiff);
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = numbers[i].trim();
                }
                return Double.toString(calc.diff(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1])));
            }
            return "";

    }

    /***
     * Метод выполняющий последовательный алгоритм вычисления математического выражения
     * @param mathExp - математическое выражение
     * @return строка, содержащая результат вычислений, округленный до 3-х знаков после запятой
     * @throws ArithmeticException - если в метод передан аргумент не соответствующий корректному
     *                               математическому выражению
     */
    public String getAnswer(String mathExp) {
        if (!isValid(mathExp)) {
            throw new ArithmeticException("Некорректное выражение.");
        }
        this.mathExpression = mathExp;
        while (findExpressionInBrackets(this.mathExpression)) {
            String expInBrackets = getExpressionInBrackets(this.mathExpression);
            while (findFirstPriorExpression(expInBrackets)) {
                expInBrackets = expInBrackets.replaceFirst(firstPriorRegEx, calculateExpression(getFirstPriorExpression(expInBrackets)));
            }
            while (findSecondPriorExpression(expInBrackets)) {
                expInBrackets = expInBrackets.replaceFirst(secondPriorRegEx, calculateExpression(getSecondPriorExpression(expInBrackets)));
            }
            this.mathExpression = this.mathExpression.replaceFirst(bracketRegEx,expInBrackets);
        }
        while (findFirstPriorExpression(this.mathExpression)) {
            this.mathExpression = mathExpression.replaceFirst(firstPriorRegEx, calculateExpression(getFirstPriorExpression(this.mathExpression)));
        }
        while (findSecondPriorExpression(this.mathExpression)) {
            this.mathExpression = mathExpression.replaceFirst(secondPriorRegEx, calculateExpression(getSecondPriorExpression(this.mathExpression)));
        }

        return Double.toString(round(Double.parseDouble(this.mathExpression),3));
    }

}
