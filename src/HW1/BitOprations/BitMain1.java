package HW1.BitOprations;

public class BitMain1 {
    public static void main(String[] args) {
        int a = 42; //00101010
        int b = 15; //00001111

        //NOT

        System.out.println("NOT:");

        //42
        System.out.println(" a = "+ a + " = 0b" + Integer.toBinaryString(a)); //a = 42 = 0b101010
        System.out.println("~a = " + ~a +" = " + Integer.toBinaryString(~a)); //~a = -43 = 11111111111111111111111111010101

        //15
        System.out.println(" b = " + b + " = 0b" + Integer.toBinaryString(b)); //b = 15 = 0b1111
        System.out.println("~b = " + ~b + " = 0b" + Integer.toBinaryString(~b)); //~b = -16 = 0b11111111111111111111111111110000

        int negA = -42;
        int negB = -15;

        //-42
        System.out.println(" negA = " + negA +  " = 0b" + Integer.toBinaryString(negA)); //negA = -42 = 0b11111111111111111111111111010110
        System.out.println("~negA = " + ~negA + " = 0b" + Integer.toBinaryString(~negA)); //~negA = 41 = 0b101001

        //-15
        System.out.println(" negB = " + negB +  " = 0b" + Integer.toBinaryString(negB)); //negB = -15 = 0b11111111111111111111111111110001
        System.out.println("~negB = " + ~negB + " = 0b" + Integer.toBinaryString(~negB)); //~negB = 14 = 0b1110


    }
}
