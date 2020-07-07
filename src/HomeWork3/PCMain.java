package HomeWork3;

import HomeWork3.pc.*;
import java.util.Random;

public class PCMain {
    public static void main(String[] args) {

        PC pc = new PC();
        Cpu cpu = new Cpu();
        Ram ram = new Ram();
        Ram64k ram64k = new Ram64k();
        Vga vga = new Vga();
        Rom rom = new Rom();
        Bios bios = new Bios();
        ComPort comPort = new ComPort();
        Hdd hdd = new Hdd();

        PC[] arrayDevices = {cpu,ram,ram64k,vga,rom,bios,comPort,hdd};

        pc.power(true);
        if (testAndRunDevices(arrayDevices)){
            pc.test();
            pc.run();
        } else pc.power(false);
    }

    static boolean testAndRunDevices(PC[] object){
        boolean flag = true;
        for (int i = 0; i < object.length; i++) {
            if (!object[i].test()){
                flag = false;
                object[i].run();
                break;
            }
            object[i].run();
        }
        return flag;
    }
}