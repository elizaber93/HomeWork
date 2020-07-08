package HW3.ObjPC.dto;

import java.util.Random;

public class Device implements IDevice{



    /* Поле статуса
    true, если устройство удалось включить
    false, если нет */
    private boolean status;

    /***
     * Метод для включения устройства
     * @return возвращает true, если пройдены все тесты
     */
    public boolean run(){

        return this.test();
    }

    /***
     * Метод, выполняющий тестирование устройства при загрузке
     * @return возвращает true, если все тесты пройдены успешно
     */
    public boolean test() {
        //алгоритм проверки
        //для каждого устройства переопределяется
        return true;
    }

    /***
     * Метод включающий или выключающий устройство при определенных входных параметрах
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }


    /***
     * Метод, провверяющий включено устройство или нет
     * @return  true, если включено
     *          false, если нет
     */
    public boolean getStatus() {
        return this.status;
    }


    /***
     * Метод проверки финальной суммы
     * @return
     */
    public boolean checkSum(int[] array) {
        Random rnd = new Random();
        return rnd.nextBoolean();
    }
}
