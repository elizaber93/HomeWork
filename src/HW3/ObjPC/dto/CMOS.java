package HW3.ObjPC.dto;
import java.util.Random;

public class CMOS extends Device implements IDevice{

    int CPUtype;
    final int memorySpace = 2048;
    int[] CMOSmemory = new int[memorySpace];
    int[] testArray = new int[CMOSmemory.length];

    /*конструктор класса CMOS,
     * при возникновении ошибки, при передаче значения типа, устройство невозможно включить
    */
    public CMOS(int type) {
        try {
            this.CPUtype = type;
        } catch (Exception e) {
            this.setStatus(false);
        }

    }



    //перегрузка метода Device.setStatus
    public void setStatus(double batteryCharge) {
        if (!this.getStatus()) return;
        this.setStatus(batteryCharge > 2.5);
    }

    /***
     * Метод создающий тестый массив из 0-1 для проверки записи/считывания из регистра CMOS
     */
    private void setTestArray() {
        Random rnd = new Random();
        for (int i = 0; i < this.testArray.length ; i++) {
            this.testArray[i] = rnd.nextInt(2);
        }
     }

     @Override
    public boolean test() {
        if (this.getStatus()) {
            setTestArray();
            for (int i = 0; i < CMOSmemory.length; i++) {
                CMOSmemory[i] = testArray[i];
            }
            for (int i = 0; i < CMOSmemory.length; i++) {
                if (CMOSmemory[i] != testArray[i]) return false;
            }
            return true;
        }
        return false;
    }

}
