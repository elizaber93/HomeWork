package HW3.ObjPC;
import HW3.ObjPC.dto.ErrorCodes;
import HW3.ObjPC.dto.PC;
import ObjPC.dto.*;


public class PCMain {
    public static void main(String[] args) {

        PC pc = new PC();
        if (pc.run()) {
            System.out.println("Загрузка прошла успешно");
        } else {
            switch (pc.getErrorCode()) {
                case ErrorCodes.BATTERY_ERROR:
                    System.out.println("CMOS checksum error1");
                    return;
                case ErrorCodes.CMOS_ERROR:
                    System.out.println("CMOS checksum error2");
                    return;
                case ErrorCodes.CPU_ERROR:
                    System.out.println("CPU run error");
                    return;
                case ErrorCodes.ROM_ERROR:
                    System.out.println("RAM error");

            }

        }

        System.out.println("Добро пожаловать!");
    }
}
