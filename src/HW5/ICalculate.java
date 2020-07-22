package HW5;

public interface ICalculate {
    double sum( double a, double b);
    double diff(double a, double b);
    double mult(double a, double b);
    double div(double a, double b);
    double involution(double a, int b);
    double root(double a, int b);
    double abs(double a);
    int getErrorCode();
    double round(double a, int n);
}
