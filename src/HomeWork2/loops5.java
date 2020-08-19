package HomeWork2;

public class Loops5 {
    public static void main(String[] args) {
        long a = 1;
        long minNumber = 0;
        while (a > 0 && a< Long.MAX_VALUE){
            minNumber = a;
            a = a * 3;
        }
        System.out.println("Значение переменной а до переполнения: " + minNumber);
        System.out.println("Значение переменной а после переполнения" + a);
    }
}
