package HW1.BitOprations;

public class BitMain3 {
    public static void main(String[] args) {
        int a = 42; //00101010
        int b = 15; //00001111
        int negA = -42;
        int negB = -15;

        int result = 0;

        //OR

        System.out.println("OR:");

        result = a|b;

        System.out.println(" a = "+ a + " = 0b" + Integer.toBinaryString(a));               //a = 42 = 0b101010
        System.out.println(" b = " + b + " = 0b" + Integer.toBinaryString(b));              //b = 15 = 0b1111
        System.out.println("a|b = " + result + " = 0b" + Integer.toBinaryString(result));   //a|b = 47 = 0b101111

        result = negA|negB;

        System.out.println(" negA = "+ negA + " = 0b" + Integer.toBinaryString(negA));          //negA = -42 = 0b11111111111111111111111111010110
        System.out.println(" negB = " + negB + " = 0b" + Integer.toBinaryString(negB));         //negB = -15 = 0b11111111111111111111111111110001
        System.out.println("negA|negB = " + result + " = 0b" + Integer.toBinaryString(result)); //negA|negB = -9 = 0b11111111111111111111111111110111

    }
}
