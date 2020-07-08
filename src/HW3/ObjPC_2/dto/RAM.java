package HW3.ObjPC_2.dto;
import java.util.Random;
public class RAM extends Device implements IDevice {

    public RAM() {

    }

    public boolean firstTest() {
        Random rnd = new Random();
        for(int i = 0; i < 10; i++){
            int chance = 10;
            if (rnd.nextInt(100) <= chance){
                return true;
            }
        }
        return false;
    }

}
