package HomeWork5;

import HomeWork5.dto.*;

public class CalcMain {
    public static void main(String[] args) {

        CalculatorWithOperator calc1 = new CalculatorWithOperator();

        // вычислить результат 4.1 + 15 * 7 + (28 / 5) ^ 2   -->  result1
        double result1 = calc1.plus(calc1.plus(4.1, calc1.multiplication(15, 7)), calc1.pow(calc1.div(28, 5),2));
        System.out.println("Результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result1);
        System.out.println(result1 /0);       //тип данных double -->  result1 = Infinity
        System.out.println(result1 /0.0d);

        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();

        double result2 = calc2.plus(calc2.plus(4.1, calc2.multiplication(15, 7)), calc2.pow(calc2.div(28, 5),2));
        System.out.println("Результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result2);
        System.out.println(result2 /0);
        System.out.println(result2 /0.0d);

        CalculatorWithMathExtends calc3 =new CalculatorWithMathExtends();

        double result3 = calc3.plus(calc3.plus(4.1, calc3.multiplication(15, 7)), calc3.pow(calc3.div(28, 5),2));
        System.out.println("Результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result3);
        System.out.println(result3 /0);
        System.out.println(result3 /0.0d);

        // ----------------- CalculatorWithCounter
        CalculatorWithCounter calc4 = new CalculatorWithCounter(new CalculatorWithOperator());

        double result4 = calc4.plus(calc4.plus(4.1, calc4.multiplication(15, 7)), calc4.pow(calc4.div(28, 5),2));
        System.out.println("Результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result4);
        System.out.println(result4 /0);
        System.out.println(result4 /0.0d);
        System.out.println("Количество методов выполненных объектом: " + calc4.getCountOperation());

        CalculatorWithCounter calc5 = new CalculatorWithCounter(new CalculatorWithMathCopy());

        double result5 = calc5.plus(calc5.plus(4.1, calc5.multiplication(15, 7)), calc5.pow(calc5.div(28, 5),2));
        System.out.println("Результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result5);
        System.out.println(result5 /0);
        System.out.println(result5 /0.0d);
        System.out.println("Количество методов выполненных объектом: " + calc5.getCountOperation());

        CalculatorWithCounter calc6 = new CalculatorWithCounter(new CalculatorWithMathExtends());

        double result6 = calc6.plus(calc6.plus(4.1, calc6.multiplication(15, 7)), calc6.pow(calc6.div(28, 5),2));
        System.out.println("Результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result6);
        System.out.println(result6 /0);
        System.out.println(result6 /0.0d);
        System.out.println("Количество методов выполненных объектом: " + calc6.getCountOperation());

        // ----------------- CalculatorWithMemory
        CalculatorWithMemory calc7 = new CalculatorWithMemory(new CalculatorWithMathExtends());

        calc7.div(28, 5);
        calc7.toMemory();
        calc7.pow(calc7.fromMemory(), 2);
        calc7.toMemory();
        calc7.plus(calc7.fromMemory(), 4.1);
        calc7.toMemory();
        calc7.plus(calc7.multiplication(15, 7), calc7.fromMemory());
        calc7.toMemory();
        System.out.println("Результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calc7.fromMemory());
        System.out.println("Количество методов выполненных объектом: " + calc7.getCountOperation());
        System.out.println(calc7.fromMemory());

        // ----------------- CalculatorStringExpression

        CalculatorStringExpression calc8 = new CalculatorStringExpression();

        System.out.println(calc8.parseString(new StringBuilder("1\\71\\10")));


    }
}
