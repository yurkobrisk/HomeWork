package HomeWork3.pc;

import java.util.Random;

public class Vga extends PC {
    private boolean flag = false;

    public boolean test(){
        Random random = new Random();
        System.out.print("VGA test: ");
        boolean bool = random.nextBoolean();
        if (bool) {
            flag = true;
            System.out.print("passed. ");
        } else System.out.println("failed. ERROR #4");
        return bool;
    }

    public boolean run(){
        if (!flag){
            System.out.println("Попытка запустить VGA который не прошел проверку");
        }else
        System.out.println("VGA run ok");
        return flag;
    }
}
