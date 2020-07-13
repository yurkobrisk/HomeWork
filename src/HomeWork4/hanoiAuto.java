package HomeWork4;

import java.util.Scanner;

public class hanoiAuto {
    public static void main(String[] args) {
        int counter = 1;
        int[][] arrayInt = scannerOutput();
        fillArray(arrayInt);    // Заполнение массива
        printArray(arrayInt);   // Вывод в консоль массива
        // Перестановка элементов НЕЧЕТНОГО массива
        if (arrayInt.length%2 == 1){
            do{
                swapAuto(arrayInt,1,3);
                System.out.println("#" + counter++);
                printArray(arrayInt);
                if (arrayInt[0][2] == 1){
                    System.out.println("Башня собрана !");
                    return;
                }
                swapAuto(arrayInt,1,2);
                System.out.println("#" + counter++);
                printArray(arrayInt);
                if (arrayInt[0][2] == 1){
                    System.out.println("Башня собрана !");
                    return;
                }
                swapAuto(arrayInt,2,3);
                System.out.println("#" + counter++);
                printArray(arrayInt);
            } while (arrayInt[0][2] != 1);
            System.out.println("Башня собрана !");
        } else { // Перестановка элементов ЧЕТНОГО массива
            do{
                swapAuto(arrayInt,1,2);
                System.out.println("#" + counter++);
                printArray(arrayInt);
                if (arrayInt[0][2] == 1){
                    System.out.println("Башня собрана !");
                    return;
                }
                swapAuto(arrayInt,1,3);
                System.out.println("#" + counter++);
                printArray(arrayInt);
                if (arrayInt[0][2] == 1){
                    System.out.println("Башня собрана !");
                    return;
                }
                swapAuto(arrayInt,2,3);
                System.out.println("#" + counter++);
                printArray(arrayInt);
            } while (arrayInt[0][2] != 1);
            System.out.println("Башня собрана !");
        }
    }
    /**
     * Метод создает двумерный целочисленный массив с указанным пользователем размером
     * @return двумерный целочисленный массив
     */
    static int[][] scannerOutput(){
        Scanner scanner = new Scanner(System.in);
        int temp;
        do {
            System.out.print("Введите число колец (не менее трех):");
            temp = scanner.nextInt();
        } while (temp < 3);
        int[][] arrayScanner = new int[temp][3];
        return arrayScanner;
    }
    /**
     * Метод последовательно заполняет нулевой элемент каждого одномерного массива, цифрой от 1 до длины двумерного
     * массива начиная с последнего элемента массива, так как переменная "size" равна длине массива.
     * @param arrayTwoDimensional двумерный массив целых чисел с конкретным размером
     * @return двумерный массив с заполненным нулевым элементом в каждом одномерном массиве в порядке возрастания
     * (нулевой элемент нулевого массива равен 1, нулевой элемент первого массива равен 2, нулевой элемент второго массива равен 3...)
     */
    static int[][] fillArray(int[][] arrayTwoDimensional){
        int size = arrayTwoDimensional.length;
        for (int i = arrayTwoDimensional.length-1; i > -1; i--) {
            arrayTwoDimensional[i][0] = size;
            size--;
        }
        return arrayTwoDimensional;
    }
    /**
     * Метод выводит в консоль двумерный массив
     * @param arrayTwoDimensional двумерный целочисленный массив
     */
    static void printArray(int[][] arrayTwoDimensional){
        for (int i = 0; i < arrayTwoDimensional.length; i++) {
            for (int j = 0; j < arrayTwoDimensional[i].length; j++) {
                if (arrayTwoDimensional[i][j] == 0){
                    System.out.print("*" + " ");
                }else {
                    System.out.print(arrayTwoDimensional[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    /**
     * Метод поиска ячейки в двумерном массиве с заданным значением
     * @param arrayTwoDimensional двумерный целочисленный массив
     * @param numberRings число для поиска
     * @return координаты ячейки двумерного массива в виде одномерного массива (строка, столбец)
     */
    static int[] findCell(int[][] arrayTwoDimensional, int numberRings){
        int[] temp = new int[2];
        for (temp[0] = 0; temp[0] < arrayTwoDimensional.length; temp[0]++) {
            for (temp[1] = 0; temp[1] < arrayTwoDimensional[temp[0]].length; temp[1]++) {
                if (arrayTwoDimensional[temp[0]][temp[1]] == numberRings){
                    return temp;
                }
            }
        }
        return temp;
    }
    /**
     * Метод поиска ячейки со значением 0 в заданном двумерном массиве в заданном столбце. Поиск начинается с конца массива
     * @param arrayTwoDimensional двумерный целочисленный массив
     * @param column номер стержня в массиве (на единицу меньше чем столбец массива)
     * @return номер строки в которой находится цифра 0
     */
    static int findCell0(int[][] arrayTwoDimensional, int column){
        int line;
        for (line = arrayTwoDimensional.length-1; line > -1; line--) {
            if (arrayTwoDimensional[line][column-1] == 0){
                return line;
            }
        }
        return line;
    }
    /**
     * Метод поиска числа находящегося на вершине стержня в указанном стержне (столбце)
     * @param arrayTwoDimensional двумерный цклочисленный массив
     * @param column стержень (столбец) в котором проводится поиск
     * @return возвращает число находящееся на вершине стержня
     */
    static int findNumber(int[][] arrayTwoDimensional, int column){
        int number = 0;
        for (int i = 0; i < arrayTwoDimensional.length; i++) {
            if (arrayTwoDimensional[i][column-1] != 0 ){
                number = arrayTwoDimensional[i][column-1];
                return number;
            }
        }
        return number;
    }
    /**
     * Метод переставляет значения между ячейками массива принадлежащими введенным столбцам
     * @param arrayTwoDimensional двумерный целочисленный массив
     * @param columnOut столбец 1 массива
     * @param columnIn столбец 2 массива
     * @return двумерный целочисленный массив с переставленными ячейками
     */
    static int[][] swapAuto(int[][] arrayTwoDimensional, int columnOut, int columnIn){
        // определить число (номер строки) которое находится на вершине стержня columnOut, columnIn (первое значение после нуля)
        int tempRing = findNumber(arrayTwoDimensional,columnOut);
        int numberIn = findNumber(arrayTwoDimensional,columnIn);
        // сравнить какое число больше и переопределить стержень и кольцо, для перестановки меньшего на большее
        if ((tempRing > numberIn && numberIn != 0) || (tempRing < numberIn && tempRing == 0)){
            tempRing = numberIn;
            columnIn = columnOut;
        }
        int[] arrayTemp1 = findCell(arrayTwoDimensional, tempRing);
        // определить номер строки с нулевым значением, указанного стержня, куда можно переместить элемент
        int line = findCell0(arrayTwoDimensional,columnIn); // номер строки со значением в ячейке 0
        System.out.println("Переставляется кольцо - " + tempRing + " на стержень - " + columnIn);
        // если ячейка со значением 0 у стержня находится в самом низу или под пустой ячейкой находится большее число
        if ((line == arrayTwoDimensional.length-1 && arrayTwoDimensional[line][columnIn-1] == 0) || (arrayTwoDimensional[line+1][columnIn-1] > tempRing)){
            int temp = arrayTwoDimensional[line][columnIn-1];
            arrayTwoDimensional[line][columnIn-1] = arrayTwoDimensional[arrayTemp1[0]][arrayTemp1[1]];
            arrayTwoDimensional[arrayTemp1[0]][arrayTemp1[1]] = temp;
            return arrayTwoDimensional;
        }
        return arrayTwoDimensional;
    }
}
