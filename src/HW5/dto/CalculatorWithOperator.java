package HW5.dto;

public class CalculatorWithOperator implements ICalculate {


    /***
     * Метод выполняющий деление числа a на число b
     * @param a - делимое
     * @param b - делитель
     * @return возвращает результат деления или бесконечность при делении на 0
     */
    public double div(double a, double b) {
        if (b == 0 && a == 0) {
            throw new ArithmeticException("Неопределенность 0/0");
        } else if (b == 0) {
            throw new ArithmeticException("Деление на 0");
        }

        return a / b;
    }

    /***
     * Метод выполняющий перемножение двух чисел
     * @param a - первый множитель
     * @param b - второй множитель
     * @return произведение a и b
     */
    public double mult(double a, double b) {
        return a*b;
    }

    /***
     * Метод выполняющий сложение двух чисел
     * @param a - первое слагаемое
     * @param b - второе слагаемое
     * @return сумма a и b
     */
    public double sum(double a, double b) {
        return a+b;
    }

    /***
     * МЕтод возвращающий разность двух чисел
     * @param a - уменьшаемое
     * @param b - вычитаемое
     * @return разность чисел a и b
     */
    public double diff(double a, double b) {
        return a-b;
    }

    /***
     * МЕтод выполняющий возведение числа a в целочисленную степень
     * @param a - число типа double
     * @param b - число типа int
     * @return результат возведения числа a в степень b
     */
    public double involution(double a, int b) {
        double result = 1;
        if (a == 0) return 0;

        for (int i = 0; i < abs(b); i++) {
            result *= a;

        }
        return (b<0)?1/result:result;
    }

    /***
     * Метод возвращающий значение числа по модулю
     * @param a - число типа double
     * @return модуль числа a
     */
    public double abs(double a) {
        if (a < 0) return a*(-1);
        else return a;
    }


    /***
     * Метод возвращающий корень целочисленной степени b из числа a
     * @param a - подкоренное выражение/число
     * @param b - степень корня типа int
     * @return корень степени b из a
     */
    public double root(double a, int b) {
        if ((b % 2 ==0 && a < 0) || b == 0) {

            throw new ArithmeticException("Корень четной степени из отрицательного числа");
            //return a;
        }

        double aMod = abs(a);
        int bMod = (int)abs(b);
        double result = aMod/bMod;
        while(abs(involution(result, b) - abs(a)) > 0.000001) {
            result = ((bMod-1)*result+aMod/involution(result, (bMod-1)))/bMod;
        }
        return (a < 0 && b % 2 != 0)?-round(result,3):round(result,3);
    }


    /***
     * Метод выполняющий округление числа a до n знаков после запятой
     * @param a - число
     * @param n - количество знаков после запятой
     * @return округленное значение a
     */
    public double round(double a, int n) {
        long tmp;
        tmp = (long) (a*involution(10,n+1)/1);
        if (tmp % 10 >= 5)
            tmp+=10;
        tmp /= 10;
        return (double)tmp/involution(10,n);

    }

}