package HomeWork3.pc;

import java.util.Random;

public class Cpu extends PC {
    private boolean flag = false;

    public boolean test(){
        Random random = new Random(1);
        System.out.print("CPU test: ");
        boolean bool = random.nextBoolean();
        if (bool) {
            flag = true;
            System.out.print("passed. ");
        } else System.out.println("failed. ERROR #1");
        return bool;
    }

    public boolean run(){
        if (!flag){
            System.out.println("Попытка запустить CPU который не прошел проверку");
        }else
        System.out.println("CPU run ok");
        return flag;
    }
}
