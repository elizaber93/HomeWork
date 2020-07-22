package HW5.ObjColor;
import HW5.ObjColor.dto.*;
import java.util.Scanner;

public class ObjMain1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название цвета");
        String nameColor = scan.nextLine();

        Color selectedColor = Color.valueOfIgnoreCase(nameColor);



        System.out.println(selectedColor.getId());
        System.out.println(selectedColor.getRusName());
    }
}
