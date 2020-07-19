package HomeWork5.dto;

public class CalculatorWithMathCopy {

    /**
     * Метод деления двух чисел
     * @param i1 число 1
     * @param i2 число 2
     * @return результат деления -> число
     */
    public double division(double i1, double i2){
        return i1 / i2;
    }

    /**
     * Метод умножения двух чисел
     * @param i1 число 1
     * @param i2 число 2
     * @return результат умножения -> число
     */
    public double multiplication(double i1, double i2){
        return i1 * i2;
    }

    /**
     * Метод сложения двух чисел
     * @param i1 число 1
     * @param i2 число 2
     * @return результат сложения -> число
     */
    public double addition(double i1, double i2){
        //System.out.println("Метод вызываемый из CalculatorWithMathCopy");
        return i1 + i2;
    }

    /**
     * Метод вычитания двух чисел
     * @param i1 число 1
     * @param i2 число 2
     * @return результат вычитания -> число
     */
    public double subtraction(double i1, double i2){
        return i1 - i2;
    }

    /**
     * Метод возведения числа в степень
     * @param i1 число которое возводится в степень
     * @param i2 степень числа - целое число
     * @return результат возведения в степень -> целое число
     */
    public double exponent(double i1, int i2){
        return Math.pow(i1, i2);
    }

    /**
     * Метод возвращает модуль числа
     * @param i1 число
     * @return результат -> абсолютный модуль числа -> положительное число
     */
    public double abs(double i1){
        return Math.abs(i1);
    }

    /**
     * Метод вычисляет квадратный корень из числа
     * @param i1 число
     * @return результат вычисления квадратного корня из числа -> число
     */
    public double sqrt(double i1){
        return Math.sqrt(i1);
    }
}
