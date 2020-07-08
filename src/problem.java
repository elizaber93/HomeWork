public class problem {
    public static void main(String[] args) {
        int number = 254356734;
        int a = number;
        int result = 0;
        int n=0;
        while (a%10!=0) {
            a/=10;
            n++;
        }
        for (int i=0;i<n;i++) {
            result += (number %  (int)Math.pow(10,i+1) / (int)Math.pow(10, i)) * (int)Math.pow(10,n-i-1);
        }

        System.out.println(number);
        System.out.println(result);
    }
}
