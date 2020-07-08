package HW1.BitOprations;

public class BitMain5 {
    public static void main(String[] args) {
        int a = 42; //00101010
        int b = 15; //00001111
        int negA = -42;
        int negB = -15;


        int result = 0;
        System.out.println("Сдвиг числа:");

        //сдвиг числа 42 на 15 разрядов влево
        result = a<<b;                                      //1376256
        System.out.println(a + "<<" + b + " = " + result);
        System.out.println(Integer.toBinaryString(a));      //101010
        System.out.println(Integer.toBinaryString(result)); //101010000000000000000

        //сдиг числа 42 на 15 разрядов влево
        result = a>>b;                                      //0
        System.out.println(a + ">>" + b + " = " + result);
        System.out.println(Integer.toBinaryString(a));      //101010
        System.out.println(Integer.toBinaryString(result)); //0

        //сдиг числа 15 на 42 разряда влево
        //т.к. максимальное количество бит в int - 32, сдвиг выполняется только на 42 - 32 = 10 бит
        result = b<<a;                                      //15<<42 = 15360
        System.out.println(b + "<<" + a + " = " + result);
        System.out.println(Integer.toBinaryString(b));      //1111
        System.out.println(Integer.toBinaryString(result)); //11110000000000

        //сдвиг  числа 15 на 42 разряда вправо
        result = b>>a;                                      //15>>42 = 0
        System.out.println(b + ">>" + a + " = " + result);
        System.out.println(Integer.toBinaryString(b));      //1111
        System.out.println(Integer.toBinaryString(result)); //0

        //сдиг числа 15 на 42 разряда влево
        System.out.println("Long type:");
        long result1 = (long)b<<a;                          //65970697666560
        System.out.println(b + "<<" + a + " = " + result1);


    }
}
