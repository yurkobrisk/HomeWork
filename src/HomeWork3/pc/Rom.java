package HomeWork3.pc;

import java.util.Random;

public class Rom extends PC {
    private boolean flag = false;

    public boolean test(){
        Random random = new Random();
        System.out.print("ROM test: ");
        boolean bool = random.nextBoolean();
        if (bool) {
            flag = true;
            System.out.print("passed. ");
        } else System.out.println("failed. ERROR #2");
        return bool;
    }

    public boolean run(){
        if (!flag){
            System.out.println("Попытка запустить ROM который не прошел проверку");
        }else
        System.out.println("ROM run ok");
        return flag;
    }
}
