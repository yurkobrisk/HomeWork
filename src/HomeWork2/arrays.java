package HomeWork2;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы целочисленного массива через пробел: ");
        String str = scanner.nextLine();
        str = str.trim();   // удалить пробелы сначала и с конца строки

        int flagSpace = 0;                          // количество пробелов между числами
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                flagSpace++;
            }
        }

        int[] arr = new int[flagSpace+1];  // Массив пустой
        int j = 0;
        String strNumber = "";  // строка-число из массива
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '){
                strNumber += str.charAt(i);
                if (i == str.length()-1){
                    arr[j] = Integer.parseInt(strNumber);   // запись в массив int последнего элемента
                }
            }else {
                if (strNumber != "") {
                    arr[j] = Integer.parseInt(strNumber);   // запись в массив int
                    j++;
                    strNumber = "";
                }
            }
        }

        System.out.println("Вывод массива с использованием foreach : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Вывод массива с использованием for : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Вывод массива с использованием while : ");
        int i = 0;
        while (i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
        System.out.println("Вывод массива с использованием do-while : ");
        int i1 = 0;
        do {
            System.out.print(arr[i1] + " ");
            i1++;
        } while (i1 < arr.length);
        System.out.println();
        System.out.println("Вывод каждого второго элемента массива : ");
        int i2 = 1;
        while (i2 < arr.length){
            System.out.print(arr[i2] + " ");
            i2+=2;
        }

    }
}
