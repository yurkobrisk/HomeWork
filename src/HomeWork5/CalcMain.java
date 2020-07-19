package HomeWork5;

import HomeWork5.dto.*;

public class CalcMain {
    public static void main(String[] args) {

        CalculatorWithOperator calc1 = new CalculatorWithOperator();

        // вычислить результат 4.1 + 15 * 7 + (28 / 5) ^ 2   -->  result1
        double result1 = calc1.addition(calc1.addition(4.1, calc1.multiplication(15, 7)), calc1.exponent(calc1.division(28, 5),2));
        System.out.println("Результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result1);
        System.out.println(result1 /0);       //тип данных double -->  result1 = Infinity
        System.out.println(result1 /0.0d);

        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();

        double result2 = calc2.addition(calc2.addition(4.1, calc2.multiplication(15, 7)), calc2.exponent(calc2.division(28, 5),2));
        System.out.println("Результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result2);
        System.out.println(result2 /0);
        System.out.println(result2 /0.0d);

        CalculatorWithMathExtends calc3 =new CalculatorWithMathExtends();

        double result3 = calc3.addition(calc3.addition(4.1, calc3.multiplication(15, 7)), calc3.exponent(calc3.division(28, 5),2));
        System.out.println("Результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result3);
        System.out.println(result3 /0);
        System.out.println(result3 /0.0d);

        // ----------------- CalculatorWithCounter
        CalculatorWithCounter calc4 = new CalculatorWithCounter(new CalculatorWithOperator());

        double result4 = calc4.addition(calc4.addition(4.1, calc4.multiplication(15, 7)), calc4.exponent(calc4.division(28, 5),2));
        System.out.println("Результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result4);
        System.out.println(result4 /0);
        System.out.println(result4 /0.0d);
        System.out.println("Количество методов выполненных объектом: " + calc4.getCountOperation());

        CalculatorWithCounter calc5 = new CalculatorWithCounter(new CalculatorWithMathCopy());

        double result5 = calc5.addition(calc5.addition(4.1, calc5.multiplication(15, 7)), calc5.exponent(calc5.division(28, 5),2));
        System.out.println("Результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result5);
        System.out.println(result5 /0);
        System.out.println(result5 /0.0d);
        System.out.println("Количество методов выполненных объектом: " + calc5.getCountOperation());

        CalculatorWithCounter calc6 = new CalculatorWithCounter(new CalculatorWithMathExtends());

        double result6 = calc6.addition(calc6.addition(4.1, calc6.multiplication(15, 7)), calc6.exponent(calc6.division(28, 5),2));
        System.out.println("Результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result6);
        System.out.println(result6 /0);
        System.out.println(result6 /0.0d);
        System.out.println("Количество методов выполненных объектом: " + calc6.getCountOperation());

        // ----------------- CalculatorWithMemory
        CalculatorWithMemory calc7 = new CalculatorWithMemory(new CalculatorWithMathExtends());

        double result7 = calc7.addition(calc7.addition(4.1, calc7.multiplication(15, 7)), calc7.exponent(calc7.division(28, 5),2));
        System.out.println("Результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result7);
        System.out.println(result7 /0);
        System.out.println(result7 /0.0d);
        System.out.println("Количество методов выполненных объектом: " + calc7.getCountOperation());

    }
}
