package HomeWork1;

public class HomeWork1_2 {
    public static void main(String[] args) {
        int a = 5, b = 2, c = 8;
        System.out.println(a + b / c);    //результат вычисления = 5  (2 делить на 8 = 0; 5 + 0 ) //2.1 5 + 2 / 8

        a = 5; b = 2; c = 8;
        System.out.println((a + b) / c);    //результат вычисления = 0    //2.2 (5 + 2) / 8

        a = 5; b = 2; c = 8;
        System.out.println((a + b++) / c);    //результат вычисления = 0 (5+2 делить на 8 )    //2.3 (5 + 2++) / 8

        a = 5; b = 2; c = 8;
        System.out.println((a + b++) / --c);          //результат вычисления =  1  (5+2 делить на 7) //2.4 (5 + 2++) / --8

        a = 5; b = 2; c = 8;
        System.out.println((a * b >> b++) / --c);    // результат вычисления = 0  (5 умножить на 2 = (1010)
                                                     // сдвинуть вправо на 2 разряда = 2 (10) и делить на 7)
                                                     //2.5 (5 * 2 >> 2++) / --8
        a = 5; b = 2; c = 8;
        System.out.println((a + 7 > 20 ? 68 : 22 * b >> b++) / --c);    // результат вычисления = 1
                                                                        // (тернарный оператор, так как выражение 5 + 7 > 20
                                                                        // false то выполняется выражение 22 * 2 = 44 (101100)
                                                                        // сдвигается на 2 разряда вправо = (1011) 11
                                                                        // делится на 7)
                                                                        // 2.6 (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8

        a = 5; b = 2; c = 8;
     //   System.out.println((a + 7 > 20 ? 68 >= 68 : 22 * b >> b++) / --c);  // результат вычисления = ошибка компиляции
                                                                            // компилятор ожидает что результат выражения в скобках
                                                                            // будет число, а выражение 68 >= 68 возвратит true
                                                                            // 2.6 (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8

        a = 5; b = 2; c = 8;
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119);    // результат вычисления = false (выполняется умножение 12*12,
                                                            // вычитание 6-2 , сравнение 4 > 3 = true, сравнение 144 <= 119 = false
                                                            // логическое "И" true & false = false
                                                            // 2.8 6 - 2 > 3 && 12 * 12 <= 119

        System.out.println(true && false);    //результат вычисления = false    //2.9 true && false
    }
}
