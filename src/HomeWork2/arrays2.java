package HomeWork2;

import java.util.Scanner;

public class Arrays2 {
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

        arr = sortArray(arr);   // Метод сортировки массива
        System.out.println("Отсортированный массив: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Метод который сортирует массив из целых чисел
     * @param arrIn не сортированный массив
     * @return отсортированный массив
     */
    static int[] sortArray(int[] arrIn){
        int iOut = 0;
        while (iOut != arrIn.length-1) { //внешний цикл выполняется последовательно до уже переставленного минимального элемента массива
            for (int i = arrIn.length - 1; i > iOut; i--) { //внутренний цикл проходит строку от конца к началу
                if (arrIn[i] < arrIn[i - 1]) {  //перестановка соседних эментов массива если число справа меньше чем слева
                    int element = arrIn[i];
                    arrIn[i] = arrIn[i - 1];
                    arrIn[i - 1] = element;
                }
            }
            iOut++;
        }
        return arrIn;
    }

}
