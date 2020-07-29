package HW5.dto;

public class CalculatorWithMathCopy implements ICalculate{

    public double div(double a, double b) {
        double result;
        result = a/b;
        if (result == Double.POSITIVE_INFINITY ||
            result == Double.NEGATIVE_INFINITY) {
            throw new ArithmeticException("Деление на 0");
        }
        return result;
    }

    public double mult(double a, double b) {
        return a*b;
    }

    public double sum(double a, double b) {
        return a+b;
    }

    public double diff(double a, double b) {
        return a-b;
    }

    public double involution(double a, int b) {
        return Math.pow(a,b);
    }

    public double abs(double a) {
        return Math.abs(a);
    }


    public double root(double a, int b) {
        return Math.pow(a,(double)1/b);
    }


    public double round(double a, int b) {
        return Math.round(a);
    }

}