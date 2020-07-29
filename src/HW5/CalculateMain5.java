package HW5;

import HW5.dto.CalculatorWithMemory;
import HW5.dto.CalculatorWithOperator;

public class CalculateMain5 {
    public static void main(String[] args) {

        System.out.println("CalculatorWithMemory");

        CalculatorWithMemory calcMem = new CalculatorWithMemory(new CalculatorWithOperator());
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result;
        try {
            result = calcMem.div(28, 5);
            calcMem.setMemory(result);
            result = (calcMem.involution(calcMem.getMemory(), 2));
            calcMem.setMemory(result);
            result = calcMem.sum(calcMem.mult(15, 7), calcMem.getMemory());
            calcMem.setMemory(result);
            result = calcMem.sum(calcMem.getMemory(), 4.1);
            calcMem.setMemory(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calcMem.round(result,3));
        try {
            System.out.println(calcMem.div(calcMem.getMemory(),0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(calcMem.div(calcMem.getMemory(),0.0d));//неопределенность 0/0
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
