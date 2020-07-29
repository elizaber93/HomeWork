package HW5.dto;

public interface ICalculate {
    double sum( double a, double b);
    double diff(double a, double b);
    double mult(double a, double b);
    double div(double a, double b);
    double involution(double a, int b);
    double root(double a, int b);
    double abs(double a);
    double round(double a, int n);
}
