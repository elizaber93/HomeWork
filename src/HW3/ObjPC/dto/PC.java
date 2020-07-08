package HW3.ObjPC.dto;

import java.util.Random;

public class PC extends  Device implements IDevice {

    Random rnd = new Random();

    Battery battery = new Battery();
    CPU cpu = new CPU(rnd.nextInt(2)*5);

    CMOS cmos = new CMOS(cpu.getCPUtype());
    ROM rom = new ROM(1024);


    private int errorCode = 0;

    public PC() {
        battery.setBatteryCharge();
    }


    public boolean run() {
        cmos.setStatus(battery.getBatteryCharge());
        return (this.test());
    }

    public boolean test() {
        if (!battery.run()) {
            this.errorCode = ErrorCodes.BATTERY_ERROR;
            return false;
        } else if (!cmos.run()) {
            this.errorCode = ErrorCodes.CMOS_ERROR;
            return false;
        } else if (!cpu.run()) {
            this.errorCode = ErrorCodes.CPU_ERROR;
            return false;
        } else if (!rom.run()) {
            this.errorCode = ErrorCodes.ROM_ERROR;
        }
        return true;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
