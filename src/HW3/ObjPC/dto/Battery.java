package HW3.ObjPC.dto;


public class Battery extends Device implements IDevice{
    private double batteryCharge;

    public void setBatteryCharge() {
        this.batteryCharge = 3;
    }

    public double getBatteryCharge() {
        return batteryCharge;
    }

    public void discharging() {
        this.batteryCharge -= 0.01;
    }

    public boolean test() {
        return this.batteryCharge != 0;
    }

    public boolean run() {
        if (this.test()) {
            this.discharging();
            return true;
        }
        else
            return false;
    }
}
