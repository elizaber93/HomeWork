package HW5;

public class CalculatorWithOperator implements ICalculate {
    private int errorCode=0;


    public double div(double a, double b) {
        double result;
        result = a/b;
        if (result == Double.POSITIVE_INFINITY ||
            result == Double.NEGATIVE_INFINITY) {
            System.out.println("Error! Деление на ноль!");
            this.errorCode = -1;
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
        double result = 1;
        if (a == 0) return 0;

        for (int i = 0; i < abs(b); i++) {
            result *= a;

        }
        return (b<0)?1/result:result;
    }

    public double abs(double a) {
        if (a < 0) return a*(-1);
        else return a;
    }


    public double root(double a, int b) {
        if ((b % 2 ==0 && a < 0) || b == 0) {
            System.out.println("Error!");
            this.errorCode = -1;
            return a;
        }

        double aMod = abs(a);
        int bMod = (int)abs(b);
        double result = aMod/bMod;
        while(abs(involution(result, b) - abs(a)) > 0.000001) {
            result = ((bMod-1)*result+aMod/involution(result, (bMod-1)))/bMod;
        }
        return (a < 0 && b % 2 != 0)?-round(result,3):round(result,3);
    }



    public double round(double a, int n) {
        long tmp;
        tmp = (long) (a*involution(10,n+1)/1);
        if (tmp % 10 >= 5)
            tmp+=10;
        tmp /= 10;
        return (double)tmp/involution(10,n);

    }

    public int getErrorCode() {
        return errorCode;
    }
}