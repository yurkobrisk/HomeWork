package HomeWork3.pc;

import java.util.Random;

public class ComPort extends PC{
    private boolean flag = false;

    public boolean test(){
        Random random = new Random(1);
        System.out.print("COM ports test: ");
        boolean bool = random.nextBoolean();
        if (bool) {
            flag = true;
            System.out.print("passed. ");
        } else System.out.println("failed. ERROR #7");
        return bool;
    }

    public boolean run(){
        if (!flag){
            System.out.println("Попытка запустить Com port который не прошел проверку");
        }else
        System.out.println("COM ports run ok");
        return flag;
    }
}
