package HomeWork3.pc;

import java.util.Random;

public class Hdd extends PC {
    private boolean flag = false;

    public boolean test(){
        Random random = new Random(1);
        System.out.print("HDD test: ");
        boolean bool = random.nextBoolean();
        if (bool) {
            flag = true;
            System.out.print("passed. ");
        } else System.out.println("failed. ERROR #8");
        return bool;
    }

    public boolean run(){
        if (!flag){
            System.out.println("Попытка запустить HDD который не прошел проверку");
        }else
        System.out.println("HDD run ok");
        return flag;
    }
}
