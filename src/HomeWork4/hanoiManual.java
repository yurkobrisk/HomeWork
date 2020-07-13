package HomeWork4;

import java.util.Scanner;

public class hanoiManual {
    public static void main(String[] args) {
        int[][] arrayInt = scannerOutput();
        fillArray(arrayInt);    // Заполнение массива
        printArray(arrayInt);   // Вывод в консоль массива
        // Перестановка элементов массива
        do{
            swapManual(arrayInt);
            printArray(arrayInt);
        } while (arrayInt[0][2] != 1);
        System.out.println("Победа! Башня собрана.");
    }

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
    static int findCell0(int[][] arrayTwoDimensional, int column){
        int line;
        for (line = arrayTwoDimensional.length-1; line > -1; line--) {
            if (arrayTwoDimensional[line][column-1] == 0){
                return line;
            }
        }
        return line;
    }

    static int[][] swapManual(int[][] arrayTwoDimensional){
        Scanner scannerRing = new Scanner(System.in);
        int tempRing;
        System.out.print("Введите  номер кольца: ");
        tempRing = scannerRing.nextInt();
        if (tempRing > arrayTwoDimensional.length || tempRing < 1){
            System.out.println("Такого кольца нет. Введите снова.");
            return arrayTwoDimensional;
        }
        int tempRod;
        Scanner scannerRod = new Scanner(System.in);
        System.out.print("Введите номер стержня: ");
        tempRod = scannerRod.nextInt();
        if (tempRod > arrayTwoDimensional[0].length || tempRod < 1){
            System.out.println("Такого стержня нет. Введите снова.");
            return arrayTwoDimensional;
        }
        // определить ячейку в которой записан номер кольца
        int[] arrayTemp1 = findCell(arrayTwoDimensional, tempRing);
        // если это не крайнее кольцо в стержне и над ним еще есть кольцо, то окончание метода
        if (arrayTemp1[0] != 0 && arrayTwoDimensional[arrayTemp1[0]-1][arrayTemp1[1]] != 0){
            System.out.println("Так переместить нельзя. Попробуйте снова.");
            return arrayTwoDimensional;
        }
        // определить номер строки с нулевым значением, указанного стержня, куда можно переместить элемент
        int line = 0;
        line = findCell0(arrayTwoDimensional,tempRod); // номер строки со значением 0
        // если ячейка со значением 0 у стержня находится в самом низу или под пустой ячейкой находится большее число
        if ((line == arrayTwoDimensional.length-1 && arrayTwoDimensional[line][tempRod-1] == 0) || (arrayTwoDimensional[line+1][tempRod-1] > tempRing)){
            int temp = arrayTwoDimensional[line][tempRod-1];
            arrayTwoDimensional[line][tempRod-1] = arrayTwoDimensional[arrayTemp1[0]][arrayTemp1[1]];
            arrayTwoDimensional[arrayTemp1[0]][arrayTemp1[1]] = temp;
            return arrayTwoDimensional;
        }else {
                System.out.println("Так переместить нельзя. Попробуйте снова.");
        }
        return arrayTwoDimensional;
    }
}
