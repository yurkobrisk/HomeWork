package HomeWork2;

public class arrays3 {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 5, 0, 4, -7, 9, 3, -2, 6};

        System.out.println("Исходный массив: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        arr = sortArray(arr); // метод сортировки по возрастанию

        System.out.println();
        System.out.println("Отсортированный массив: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
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
