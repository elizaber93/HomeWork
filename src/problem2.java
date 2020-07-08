public class problem2 {
    public static void main(String[] args) {
        double number = 0.225;
        int num = -3;
        System.out.println(Integer.toBinaryString(num));
        long a = Double.doubleToLongBits(number);
        System.out.println(Integer.toBinaryString((int)(a >>> 32)));

    }
}
