package HomeWork3;

public class arrays1 {
    public static void main(String[] args) {

        int[] arr1 = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        int[] arr2 = {1,1,2,-2,5,2,4,4,-1,-2,5};
        int[] arr3 = {20,1,1,2,2,3,3,5,5,4,20,4,5};
        int[] arr4 = {10};
        int[] arr5 = {1,1,1,1,1,1,10,1,1,1,1};
        int[] arr6 = {5,4,3,2,1,5,4,3,2,10,10};


        System.out.println("Число " + oddFind(sortArrayUp(arr1)) + " встречается нечетное количество раз в массиве:");
        print(arr1);
        System.out.println("Число " + oddFind(sortArrayUp(arr2)) + " встречается нечетное количество раз в массиве:");
        print(arr2);
        System.out.println("Число " + oddFind(sortArrayUp(arr3)) + " встречается нечетное количество раз в массиве:");
        print(arr3);
        System.out.println("Число " + oddFind(sortArrayUp(arr4)) + " встречается нечетное количество раз в массиве:");
        print(arr4);
        System.out.println("Число " + oddFind(sortArrayUp(arr5)) + " встречается нечетное количество раз в массиве:");
        print(arr5);
        System.out.println("Число " + oddFind(sortArrayUp(arr6)) + " встречается нечетное количество раз в массиве:");
        print(arr6);
    }

    /**
     * Метод поиска числа, которое встречается в массиве int нечетное количество раз (всегда только одно число
     * встречается нечетное количество раз). Массив должен быть отсортирован !
     * @param arrayInput Отсортированный массив целых чисел
     * @return Число которое встречается в массиве нечетное количество раз
     */
    static int oddFind(int[] arrayInput){ // массив всегда имеет нечетное количество элементов
        if (arrayInput.length != 1 && arrayInput[0] == arrayInput[1]){ // если длина массива не один элемент и первые два элемента одинаковы
            for (int i = arrayInput.length - 2; i > -1; i-=2) {
                if (arrayInput[i] != arrayInput[i+1]){ // сравнение нечетного и четного элементов массива
                    /*System.out.println(arrayInput[i+1]);*/ // тестовая точка
                    return arrayInput[i+1];
                }
            }
        } else {
          /*  System.out.println(arrayInput[0]);*/ // тестовая точка
        }
        return arrayInput[0];
    }
    /**
     * Метод сортировки массива целых чисел в порядке возрастания
     * @param arrayInput Массив целых чисел
     * @return Отсортированный массив
     */
    static int[] sortArrayUp(int[] arrayInput){
        for (int j = 0; j < arrayInput.length; j++) {//внешний цикл выполняется последовательно до уже переставленного минимального элемента массива
            for (int i = arrayInput.length - 1; i > j; i--) { //внутренний цикл проходит строку от конца к началу
                if (arrayInput[i] < arrayInput[i - 1]) {  //перестановка соседних эментов массива если число справа меньше чем слева
                    int temp = arrayInput[i];
                    arrayInput[i] = arrayInput[i - 1];
                    arrayInput[i - 1] = temp;
                }
            }
        }
        return arrayInput;
    }

    static void print(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
