package HW1.BitOprations;

public class BitMain2 {

    public static void main(String[] args) {
        int a = 42; //0b00101010
        int b = 15; //0b00001111

        int negA = -42;//0b11111111111111111111111111010110
        int negB = -15;//0b11111111111111111111111111110001

        int result = 0;

        result = a&b;

        //AND

        System.out.println("AND:");

        System.out.println(" a = "+ a + " = 0b" + Integer.toBinaryString(a)); //a = 42 = 0b101010
        System.out.println(" b = " + b + " = 0b" + Integer.toBinaryString(b)); //b = 15 = 0b1111
        System.out.println("a&b = " + result + " = 0b" + Integer.toBinaryString(result)); //a&b = 10 = 0b1010



        result = negA&negB;

        System.out.println(" negA = "+ negA + " = 0b" + Integer.toBinaryString(negA)); //negA = -42 = 0b11111111111111111111111111010110
        System.out.println(" negB = " + negB + " = 0b" + Integer.toBinaryString(negB)); //negB = -15 = 0b11111111111111111111111111110001
        System.out.println("negA&negB = " + result + " = 0b" + Integer.toBinaryString(result)); //negA&negB = -48 = 0b11111111111111111111111111010000

    }
}
