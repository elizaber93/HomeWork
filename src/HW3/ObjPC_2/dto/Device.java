package HW3.ObjPC_2.dto;
import java.util.Random;

public class Device {

    public Device() {

    }

    private Random rnd = new Random();

    private boolean status;

    public boolean test() {
        for(int i = 0; i < 100; i++){
            int chance = 10;
            if (rnd.nextInt(100) <= chance){
                return true;
            }
        }
        return false;
    }

    public boolean run() {
        if (this.test()) this.status = true;
        else {
            this.status = false;
        }
        return status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public boolean setStatus(boolean value) {
        return this.status = value;
    }
}
