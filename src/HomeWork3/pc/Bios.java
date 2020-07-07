package HomeWork3.pc;

import java.util.Random;

public class Bios extends PC {
    private boolean flag = false;

    public boolean test(){
        Random random = new Random(1);
        System.out.print("Bios test: ");
        boolean bool = random.nextBoolean();
        if (bool) {
            flag = true;
            System.out.print("passed. ");
        } else System.out.println("failed. ERROR #6");
        return bool;
    }

    public boolean run(){
        if (!flag){
            System.out.println("Попытка запустить BIOS который не прошел проверку");
        }else
        System.out.println("Bios run ok");
        return flag;
    }
}
