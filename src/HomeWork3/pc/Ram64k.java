package HomeWork3.pc;

import java.util.Random;

public class Ram64k extends PC {
    private boolean flag = false;

    public boolean test(){
        Random random = new Random(1);
        System.out.print("RAM 64k test: ");
        boolean bool = random.nextBoolean();
        if (bool) {
            flag = true;
            System.out.print("passed. ");
        } else System.out.println("failed. ERROR #3");
        return bool;
    }

    public boolean run(){
        if (!flag){
            System.out.println("Попытка запустить Ram 64k который не прошел проверку");
        }else
        System.out.println("RAM 64k run ok");
        return flag;
    }
}
