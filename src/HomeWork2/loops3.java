package HomeWork2;

public class Loops3 {
    public static void main(String[] args) {
        long number = Long.parseLong(args[0]);
        multiplication(number);
    }
    /**
     * Multiplication (example in 123456789  out 1*2*3*4*5*6*7*8*9=362880)
     * @param number Number type Long
     */
    static void multiplication(long number){
        String string = " = ";  // Пустая строка
        long result = 1;        // Будущий результат умножения
        while ( number != 0) {  // Введенное число
            long ostatok = number % 10; // Вычислить остаток от деления на 10
            result = result * ostatok;
            string = ostatok + string;
            number = number / 10;       // Уменьшить введенное число в 10 раз
            if (number != 0 ){
                string = " * " + string;    // Добавлять знак умножения в строку пока есть цифры в введенном числе
            }
        }
        System.out.println(string + result); // Вывести результат
    }
}
