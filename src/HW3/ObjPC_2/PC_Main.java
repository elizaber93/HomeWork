package HW3.ObjPC_2;

import HW3.ObjPC_2.dto.ErrorCodes;
import HW3.ObjPC_2.dto.PC;
import ObjPC_2.dto.*;

public class PC_Main {
    public static void main(String[] args) {
        PC pc = new PC();

        if (pc.run()) {
            System.out.println("Загрузка прошла успешно");
        } else {
            switch (pc.getErrorCode()) {
                case ErrorCodes.CPU_ERROR:
                    System.out.println("CPU Error");
                    return;
                case ErrorCodes.ROM_ERROR:
                    System.out.println("ROM Error");
                    return;
                case ErrorCodes.RAM_ERROR:
                    System.out.println("RAM error");
                    return;
                case ErrorCodes.GRAPH_ERROR:
                    System.out.println("Graphics adapter controller error");
                    return;
                case ErrorCodes.BIOS_ERROR:
                    System.out.println("BIOS error");
                    return;
                case ErrorCodes.COM_ERROR:
                    System.out.println("COM ports controller error");
                    return;
                case ErrorCodes.HARDDRIVE_ERROR:
                    System.out.println("Hard drive controller error");
                    return;
            }
        }

        System.out.println("Добро пожаловать!");

    }
}
