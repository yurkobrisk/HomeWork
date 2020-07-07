package HomeWork3.pc;

import java.util.Random;

public class Ram extends PC {
    private boolean flag = false;

    public boolean test(){
        Random random = new Random(1);
        System.out.print("RAM test: ");
        boolean bool = random.nextBoolean();
        if (bool) {
            flag = true;
            System.out.print("passed. ");
        } else System.out.println("failed. ERROR #5");
        return bool;
    }

    public boolean run(){
        if (!flag){
            System.out.println("Попытка запустить RAM который не прошел проверку");
        }else
        System.out.println("RAM run ok");
        return flag;
    }
}
