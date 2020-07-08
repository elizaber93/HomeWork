package HW3.ObjColor;

import HW3.ObjColor.dto.Color;
import ObjColor.dto.*;

public class ObjMain1 {
    public static void main(String[] args) {
        Color col1 = new Color(3);
        System.out.println("Название цвета: " + col1.getName());
        System.out.println("Номер цвета: " + col1.getNumber());
    }
}
