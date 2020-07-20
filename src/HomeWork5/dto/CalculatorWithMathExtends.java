package HomeWork5.dto;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    /**
     * Метод возведения числа в степень
     * @param i1 число которое возводится в степень
     * @param i2 степень числа - целое число
     * @return результат возведения в степень -> целое число
     */
    @Override
    public double pow(double i1, int i2){
        return Math.pow(i1, i2);
    }

    /**
     * Метод возвращает модуль числа
     * @param i1 число
     * @return результат -> абсолютный модуль числа -> положительное число
     */
    @Override
    public double abs(double i1){
        return Math.abs(i1);
    }

    /**
     * Метод вычисляет квадратный корень из числа
     * @param i1 число
     * @return результат вычисления квадратного корня из числа -> число
     */
    @Override
    public double sqrt(double i1){
        return Math.sqrt(i1);
    }
}
