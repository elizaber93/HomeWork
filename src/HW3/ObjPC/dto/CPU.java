package HW3.ObjPC.dto;

import java.util.Random;

public class CPU extends Device implements IDevice{
    Random rnd = new Random();

    /***
     * Конструктор класса CPU
     * @param voltage входное напряжение
     */
    public CPU(double voltage)  {
        this.voltage = voltage;
    }

    //Поле типа процессора, при включении значение передается в cmos
    private final int CPUtype = rnd.nextInt(2);

    //Поле входного напряжения, задается при создании экземпляра класса
    private final double voltage;


    /***
     * Метод выполняющий проверку процессора, в данном случае входное напряжение
     * @return true - тесты пройдены, входное напряжение =5В
     */
    @Override
    public boolean test() {
        this.setStatus(this.voltage == 5);
        return this.getStatus();
    }


    /***
     * Метод, возвращающий тип процессора
     * @return
     */
    public int getCPUtype() {
        return CPUtype;
    }


}
