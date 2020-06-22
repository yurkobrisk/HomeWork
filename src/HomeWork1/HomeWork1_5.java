package HomeWork1;

import java.util.Scanner;

public class HomeWork1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // решение на базе if
        System.out.println("Введите свое имя: ");
        String name = sc.nextLine();
        if (name.equals("Вася")) System.out.println("Привет!\nЯ тебя так долго ждал, " + name);
        if (name.equals("Анастасия")) System.out.println("Привет!\nЯ тебя так долго ждал, " + name);
        if (!(name.equals("Вася") || name.equals("Анастасия"))) System.out.println("Добрый день, а вы кто?");

        // решение на базе if-else
        System.out.println("Введите свое имя: ");
        name = sc.nextLine();
        if (name.equals("Вася") || name.equals("Анастасия")){
            System.out.println("Привет!\nЯ тебя так долго ждал, " + name);
        }
        else {
            System.out.println("Добрый день, а вы кто?");
        }

        // решение на базе if-else-if
        System.out.println("Введите свое имя: ");
        name = sc.nextLine();
        if (name.equals("Вася")){
            System.out.println("Привет!\nЯ тебя так долго ждал, " + name);
        }
        else {
            if (name.equals("Анастасия")){
                System.out.println("Привет!\nЯ тебя так долго ждал, " + name);
            }
            else
            System.out.println("Добрый день, а вы кто?");
        }

        // решение на базе switch
        System.out.println("Введите свое имя: ");
        name = sc.nextLine();
        switch (name){
            case "Вася"  :
            case "Анастасия" :
                System.out.println("Привет!\nЯ тебя так долго ждал, " + name);
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }

 //       System.out.println(name);
        sc.close();
    }
}
