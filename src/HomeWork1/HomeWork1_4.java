package HomeWork1;

public class HomeWork1_4 {
    static String sleepIn(boolean weekday, boolean vacation){
        String s = "";
        if (!(weekday == true)  || vacation == true){
            s = "Можно спать дальше";
        }
        else {
            s = "Пора вставать на работу";
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, true));
    }
}
