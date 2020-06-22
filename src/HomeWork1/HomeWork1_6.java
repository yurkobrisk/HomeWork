package HomeWork1;

import java.util.Scanner;

public class HomeWork1_6 {
    static String createPhoneNumber(int [] inarr){
        // создание пустой строки
        String s = "";
        // формирование номера
        for (int i=0; i<inarr.length; i++) {
            if (i == 0) s += "(";
            if (i == 3) s += ") ";
            if (i == 6) s += "-";
            s += inarr[i];
        }
        return s;
    }
    public static void main(String[] args) {
        int [] arr = new int [] {0,2,9,6,6,7,0,5,7,2};
        System.out.println(createPhoneNumber(arr));

        Scanner sc = new Scanner(System.in);
        // пустой массив с длиной 10
        int [] intarray = new int [10];
        // заполнение массива
        System.out.println("Введите десять цифр:");
        for (int i=0; i<intarray.length; i++) {
            intarray[i] = sc.nextInt();
        }
        // нужно дописывать проверку на введенные числа, а не цифры
        System.out.println(createPhoneNumber(intarray));
        sc.close();

    }
}
