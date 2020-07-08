package HW1.BitOprations;

public class BitMain6 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int negA = -42;
        int negB = -15;

        //AND с присваиванием
        System.out.println("AND(42,15) с присваиванием:");
        System.out.println("a = " + a + " = 0b" + Integer.toBinaryString(a));//a = 42 = 0b101010
        a &= b; //результат операции a&b записан в переменную a
        System.out.println("a = " + a + " = 0b" + Integer.toBinaryString(a));//a = 10 = 0b1010

        System.out.println("AND(-42,-15) с присваиванием:");
        System.out.println("negA = " + negA + " = 0b" + Integer.toBinaryString(negA));//negA = -42 = 0b11111111111111111111111111010110
        negA &= negB; //результат операции negA&negB записан в переменную negA
        System.out.println("negA = " + negA + " = 0b" + Integer.toBinaryString(negA));//negA = -48 = 0b11111111111111111111111111010000

        //OR с присваиванием
        a = 42;

        System.out.println("OR(42,15) с присваиванием:");
        System.out.println("a = " + a + " = 0b" + Integer.toBinaryString(a));//a = 42 = 0b101010
        a |= b; //результат операции a|b записан в переменную a
        System.out.println("a = " + a + " = 0b" + Integer.toBinaryString(a));//a = 47 = 0b101111

        negA = -42;

        System.out.println("OR(-42,-15) с присваиванием:");
        System.out.println("negA = " + negA + " = 0b" + Integer.toBinaryString(negA));//negA = -42 = 0b11111111111111111111111111010110
        negA |= negB; //результат операции negA|negB записан в переменную negA
        System.out.println("negA = " + negA + " = 0b" + Integer.toBinaryString(negA));//negA = -9 = 0b11111111111111111111111111110111

        //XOR с присваиванием
        a = 42;
        System.out.println("XOR(42,15) с присваиванием:");
        System.out.println("a = " + a + " = 0b" + Integer.toBinaryString(a));//a = 42 = 0b101010
        a ^= b; //результат операции a^b записан в переменную a
        System.out.println("a = " + a + " = 0b" + Integer.toBinaryString(a));//a = 37 = 0b100101

        negA = -42;

        System.out.println("XOR(-42,-15) с присваиванием:");
        System.out.println("negA = " + negA + " = 0b" + Integer.toBinaryString(negA));//negA = -42 = 0b11111111111111111111111111010110
        negA ^= negB; //результат операции negA^negB записан в переменную negA
        System.out.println("negA = " + negA + " = 0b" + Integer.toBinaryString(negA));//negA = 39 = 0b100111
    }
}
