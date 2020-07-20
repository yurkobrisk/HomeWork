package HomeWork5.dto;

public class CalculatorWithMemory {

    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;
    private int counter = 0;
    private double memory = 0;
    private double temp = 0;
    private boolean flag = false; // флаг чтения из памяти. если true то память необходимо обнулить

    public CalculatorWithMemory(CalculatorWithOperator calc1){
        this.calc1 = calc1;
        //System.out.println("CalculatorWithOperator");
    }

    public CalculatorWithMemory(CalculatorWithMathCopy calc2){
        this.calc2 = calc2;
        //System.out.println("CalculatorWithMathCopy");
    }

    public CalculatorWithMemory(CalculatorWithMathExtends calc3){
        this.calc3 = calc3;
        //System.out.println("CalculatorWithMathExtends");
    }

    public double fromMemory() {
        if (flag){
            counter++;
            flag = false;
            memory = 0;
            return memory;
        }
        counter++;
        flag = true;
        return memory;
    }

    public void toMemory() {
        if (flag){
            flag = false;
        }
        counter++;
        this.memory = temp;
    }

/*    public void setCountOperation(int counter) {
        this.counter = counter;
    }*/

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
        if (calc1 != null){
            counter++;
            temp = calc1.div(i1, i2);
            return temp;
        } else {
            if (calc2 != null){
                counter++;
                temp = calc2.div(i1, i2);
                return temp;
            }
        }
        counter++;
        temp = calc3.div(i1, i2);
        return temp;
    }

    /**
     * Метод умножения двух чисел
     * @param i1 число 1
     * @param i2 число 2
     * @return результат умножения -> число
     */
    public double multiplication(double i1, double i2){
        if (calc1 != null){
            counter++;
            temp = calc1.multiplication(i1, i2);
            return temp;
        } else {
            if (calc2 != null){
                counter++;
                temp = calc2.multiplication(i1, i2);
                return temp;
            }
        }
        counter++;
        temp = calc3.multiplication(i1, i2);
        return temp;
    }

    /**
     * Метод сложения двух чисел
     * @param i1 число 1
     * @param i2 число 2
     * @return результат сложения -> число
     */
    public double plus(double i1, double i2){
        if (calc1 != null){
            counter++;
            temp = calc1.plus(i1, i2);
            return temp;
        } else {
            if (calc2 != null){
                counter++;
                temp = calc2.plus(i1, i2);
                return temp;
            }
        }
        counter++;
        temp = calc3.plus(i1, i2);
        return temp;
    }

    /**
     * Метод вычитания двух чисел
     * @param i1 число 1
     * @param i2 число 2
     * @return результат вычитания -> число
     */
    public double minus(double i1, double i2){
        if (calc1 != null){
            counter++;
            temp = calc1.minus(i1, i2);
            return temp;
        } else {
            if (calc2 != null){
                counter++;
                temp = calc2.minus(i1, i2);
                return temp;
            }
        }
        counter++;
        temp = calc3.minus(i1, i2);
        return temp;
    }

    /**
     * Метод возведения числа в степень
     * @param i1 число которое возводится в степень
     * @param i2 степень числа - целое число
     * @return результат возведения в степень -> целое число
     */
    public double pow(double i1, int i2){
        if (calc1 != null){
            counter++;
            temp = calc1.pow(i1, i2);
            return temp;
        } else {
            if (calc2 != null){
                counter++;
                temp = calc2.pow(i1, i2);
                return temp;
            }
        }
        counter++;
        temp = calc3.pow(i1, i2);
        return temp;
    }

    /**
     * Метод возвращает модуль числа
     * @param i1 число
     * @return результат -> абсолютный модуль числа -> положительное число
     */
    public double abs(double i1){
        if (calc1 != null){
            counter++;
            temp = calc1.abs(i1);
            return temp;
        } else {
            if (calc2 != null){
                counter++;
                temp = calc2.abs(i1);
                return temp;
            }
        }
        counter++;
        temp = calc3.abs(i1);
        return temp;
    }

    /**
     * Метод вычисляет квадратный корень из числа
     * @param i1 число
     * @return результат вычисления квадратного корня из числа -> число
     */
    public double sqrt(double i1){
        if (calc1 != null){
            counter++;
            temp = calc1.sqrt(i1);
            return temp;
        } else {
            if (calc2 != null){
                counter++;
                temp = calc2.sqrt(i1);
                return temp;
            }
        }
        counter++;
        temp = calc3.sqrt(i1);
        return temp;
    }
}
