package HW5;

public class CalculatorWithCounter implements ICalculate{
    private int errorCode;
    private ICalculate calc;
    private int countOperation = 0;

    public CalculatorWithCounter(ICalculate c) {
        this.calc = c;
    }

    public double sum(double a, double b) {
        countOperation++;
        return calc.sum(a,b);
    }

    public double diff(double a, double b) {
        countOperation++;
        return calc.diff(a,b);
    }

    public double mult(double a, double b) {
        countOperation++;
        return calc.mult(a,b);
    }

    public double div(double a, double b) {
        countOperation++;
        return calc.div(a,b);
    }

    public double involution(double a, int b) {
        countOperation++;
        return calc.involution(a,b);
    }

    public double root(double a, int b) {
        countOperation++;
        return calc.root(a,b);
    }

    public double abs(double a) {
        countOperation++;
        return calc.abs(a);
    }

    public double round(double a, int b) {
        return calc.round(a, b);
    }

    @Override
    public int getErrorCode() {
        return this.errorCode;
    }

    public int getCountOperation() {
        return countOperation;
    }

}
