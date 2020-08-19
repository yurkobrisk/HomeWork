package HomeWork5.dto;

public class CalculatorWithCounter {

    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;
    private int counter = 0;

    public CalculatorWithCounter(CalculatorWithOperator calc1){
        this.calc1 = calc1;
        //System.out.println("CalculatorWithOperator");
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calc2){
        this.calc2 = calc2;
        //System.out.println("CalculatorWithMathCopy");
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calc3){
        this.calc3 = calc3;
        //System.out.println("CalculatorWithMathExtends");
    }

    /**
     * Метод возвращает значение внутреннего счетчика.
     * @return считает количество операций выполненных данным объектом
     */
    public int getCountOperation(){
        return counter;
    }

    /**
     * Метод деления двух чисел
     * @param i1 число 1
     * @param i2 число 2
     * @return результат деления -> число
     */
    public double div(double i1, double i2){
        double result = 0;
        if (calc1 != null){
            result = calc1.div(i1, i2);
        } else if (calc2 != null){
            result = calc2.div(i1, i2);
        } else if (calc3 != null){
            result = calc3.div(i1, i2);
            }
        counter++;
        return result;
    }

    /**
     * Метод умножения двух чисел
     * @param i1 число 1
     * @param i2 число 2
     * @return результат умножения -> число
     */
    public double multiplication(double i1, double i2){
        double result = 0;
        if (calc1 != null){
            result = calc1.multiplication(i1, i2);
        } else if (calc2 != null){
            result = calc2.multiplication(i1, i2);
        } else if (calc3 != null){
            result = calc3.multiplication(i1, i2);
        }
        counter++;
        return result;
    }

    /**
     * Метод сложения двух чисел
     * @param i1 число 1
     * @param i2 число 2
     * @return результат сложения -> число
     */
    public double plus(double i1, double i2){
        double result = 0;
        if (calc1 != null){
            result = calc1.plus(i1, i2);
        } else if (calc2 != null){
            result = calc2.plus(i1, i2);
        } else if (calc3 != null){
            result = calc3.plus(i1, i2);
        }
        counter++;
        return result;
    }

    /**
     * Метод вычитания двух чисел
     * @param i1 число 1
     * @param i2 число 2
     * @return результат вычитания -> число
     */
    public double minus(double i1, double i2){
        double result = 0;
        if (calc1 != null){
            result = calc1.minus(i1, i2);
        } else if (calc2 != null){
            result = calc2.minus(i1, i2);
        } else if (calc3 != null){
            result = calc3.minus(i1, i2);
        }
        counter++;
        return result;
    }

    /**
     * Метод возведения числа в степень
     * @param i1 число которое возводится в степень
     * @param i2 степень числа - целое число
     * @return результат возведения в степень -> целое число
     */
    public double pow(double i1, int i2){
        double result = 0;
        if (calc1 != null){
            result = calc1.pow(i1, i2);
        } else if (calc2 != null){
            result = calc2.pow(i1, i2);
        } else if (calc3 != null){
            result = calc3.pow(i1, i2);
        }
        counter++;
        return result;
    }

    /**
     * Метод возвращает модуль числа
     * @param i1 число
     * @return результат -> абсолютный модуль числа -> положительное число
     */
    public double abs(double i1){
        double result = 0;
        if (calc1 != null){
            result = calc1.abs(i1);
        } else if (calc2 != null){
            result = calc2.abs(i1);
        } else if (calc3 != null){
            result = calc3.abs(i1);
        }
        counter++;
        return result;
    }

    /**
     * Метод вычисляет квадратный корень из числа
     * @param i1 число
     * @return результат вычисления квадратного корня из числа -> число
     */
    public double sqrt(double i1){
        double result = 0;
        if (calc1 != null){
            result = calc1.sqrt(i1);
        } else if (calc2 != null){
            result = calc2.sqrt(i1);
        } else if (calc3 != null){
            result = calc3.sqrt(i1);
        }
        counter++;
        return result;
    }
}
