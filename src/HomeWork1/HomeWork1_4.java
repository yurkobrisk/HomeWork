package HomeWork1;

import java.util.Scanner;

/**
 * 4. Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main.
 *  4.1 Данный метод будет принимает два параметра
 *  4.2 Будет отвечать на вопрос спать ли дальше (возвращать true либо false).
 *  4.3 Первый параметр boolean weekday обозначает рабочий день
 *  4.4 Второй параметр boolean vacation обозначает отпуск.
 *  4.5 Если у нас отпуск или не рабочий день то мы можем спать дальше (Взято с https://codingbat.com/prob/p187868).
 *  4.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу
 */
public class HomeWork1_4 {
    /**
     * Метод определяет спать ли дальше
     * @param weekday рабочий день
     * @param vacation отпуск
     * @return true если отпуск или не рабочий день
     *         false если рабочий день
     */
    static boolean sleepIn(boolean weekday, boolean vacation){
        boolean s;
        if (!(weekday == true)  || vacation == true){
            s = true; //"Можно спать дальше"
        }
        else {
            s = false; //"Пора вставать на работу"
        }
        return s;
    }

    public static void main(String[] args) {
        boolean weekday;
        boolean vacation;

        Scanner scannerWeekday = new Scanner(System.in);
        while (true){
            System.out.println("Сегодня рабочий день? (да, нет)");
            String temp = scannerWeekday.nextLine();
            if (temp.equals("да")){
                weekday = true;
                break;
            } else if (temp.equals("нет")){
                weekday = false;
                break;
            }
        }

        Scanner scannerVacation = new Scanner(System.in);
        while (true){
            System.out.println("Сегодня день отпуска? (да, нет)");
            String temp = scannerVacation.nextLine();
            if (temp.equals("да")){
                vacation = true;
                break;
            } else if (temp.equals("нет")){
                vacation = false;
                break;
            }
        }

        if (sleepIn(weekday, vacation)){
            System.out.println("Можно спать дальше");
        } else {
            System.out.println("Пора вставать на работу");
        }
    }
}
