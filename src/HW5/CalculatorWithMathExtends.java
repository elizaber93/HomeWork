package HW5;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculate{

    public double involution(double a, int b) {
        return Math.pow(a,b);
    }

    public double abs(double a) {
        return Math.abs(a);
    }


    public double root(double a, int b) {
        return Math.pow(a,(double)1/b);
    }



    public double round(double a) {
        return Math.round(a);
    }

}