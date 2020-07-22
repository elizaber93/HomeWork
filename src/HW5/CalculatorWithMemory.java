package HW5;

public class CalculatorWithMemory implements ICalculate{
    private int errorCode;
    private ICalculate calc;
    private double memory =0;

    public CalculatorWithMemory(ICalculate c) {
        this.calc = c;
    }

    public double sum(double a, double b) {
        return calc.sum(a,b);
    }

    public double diff(double a, double b) {
        return calc.diff(a,b);
    }

    public double mult(double a, double b) {
        return calc.mult(a,b);
    }

    public double div(double a, double b) {
        return calc.div(a,b);
    }

    public double involution(double a, int b) {
        return calc.involution(a,b);
    }

    public double root(double a, int b) {
        return calc.root(a,b);
    }

    public double abs(double a) {
        return calc.abs(a);
    }

    public double round(double a, int b) {
        return calc.round(a, b);
    }

    @Override
    public int getErrorCode() {
        return this.errorCode;
    }

    public double getMemory() {
        double returnResult = this.memory;
        this.memory = 0;
        return returnResult;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
}