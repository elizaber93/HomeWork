package HW1.BitOprations;

public class BitMain7 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;

        int negA = -42;

        int result = 0;

        //сдвиг влево с заполнением нулями

        result = a>>>2;
        System.out.println(result);//10


        //сдвиг с заполнением нулями и присваиванием
        negA>>>=2;
        System.out.println(negA); //1073741813 теряется знак
    }

}
