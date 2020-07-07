package HomeWork3.pc;

import java.util.Random;

public class PC implements IPC {
    private boolean flag = false;

    /**
     * Метод включения и выключения ПК
     * @param bool принимает значения true или false
     * @return возвращает true если ПК включен, false если ПК выключен
     */
    public boolean power(boolean bool){
        if (bool){
            System.out.println("Включение ПК. Тестирование устройств: ");
        } else {
            System.out.println("Выключение ПК.");
        }
        return bool;
    }
    /**
     * Метод выполняет тест ПК
     * @return возвращает true если тест выполнен и выводит в консоль "test PC passed"
     * возвращает false если во время загрузки появился синий экран смерти и выводит в консоль код ошибки
     */
    public boolean test(){
        Random random = new Random(1);
        boolean bool = random.nextBoolean();
        if (bool) {
            flag = true;
            System.out.println("test PC passed");
        }
        else System.out.println("PC test failed. BSoD. ERROR #10");
        return bool;
    }
    /**
     * Метод запуска операционной системы
     * @return возвращает true если операционная система запустилась без ошибок и
     * выводит в консоль "Operation System loaded"
     */
    public boolean run(){
        if (flag) System.out.println("Operation System Loading ... \nДобро пожаловать! Система загружена успешно.");
        else System.out.println("Выключение ПК.");
        return flag;
    }
}
