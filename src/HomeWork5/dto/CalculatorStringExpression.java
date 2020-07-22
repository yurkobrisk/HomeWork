package HomeWork5.dto;

public class CalculatorStringExpression extends CalculatorWithOperator {

    public int parseString(StringBuilder sb){

        int result = 0;
        StringBuilder temp = new StringBuilder(" ");
        char[] arrayValidChars = new char[]{'1','2','3','4','5','6','7','8','9','0'};
        char[] arrayValidOperators = new char[]{'+','-','*','\\','^','|','(',')','P','I','E'};
        // удаление пробелов во входящей строке
        delSpace(sb);
        // проверка строки на возможность вычисления и формирование массива
        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < arrayValidChars.length; j++) {
                if (sb.charAt(i) == arrayValidChars[j]){
                    temp.append(sb.charAt(i));
                    break;
                } else {
                    if (sb.charAt(i) == arrayValidOperators[j]){
                        temp.append(" " + arrayValidOperators[j] + " ");
                        break;
                    }
                }
            }
        }
        // добавление пробела в конце строки
        temp.append(" ");

        while (temp.indexOf("*") != -1){
            System.out.println(temp);
            temp = multiplicationString(temp);
        }

        while (temp.indexOf("\\") != -1){
            System.out.println(temp);
            temp = divString(temp);
        }

        while (temp.indexOf("+") != -1){
            System.out.println(temp);
            temp = plusString(temp);
        }

        while (temp.indexOf("-") != -1){
            System.out.println(temp);
            temp = minusString(temp);
        }

        /*System.out.println("Расчет выражения нельзя выполнить! Завершение работы программы.");*/


        return result = Integer.parseInt(temp.toString().trim());
    }

    /**
     * Метод удаляет символы ' ' в строке типа StringBuilder
     * @param temp строка типа StringBuilder
     */
    private void delSpace(StringBuilder temp){
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == ' '){
                temp.deleteCharAt(i);
                i--;
            }
        }
    }

    /**
     * Метод сравнивает символ строки с цифрой. Если они совпадают возвращает true, если не совпадают возвращает false
     * @param str Символ строки
     * @return Возвращает true если цифра, false если нет
     */
    private boolean checkNumber(String str){
        boolean flag;
        if (str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5") ||
            str.equals("6") || str.equals("7") || str.equals("8") || str.equals("9") || str.equals("0")){
            return flag = true;
        }
        return flag = false;
    }

    /**
     * Метод сравнивает символ строки с операторами. Если они совпадают возвращает true, если не совпадают возвращает false
     * @param str Символ строки
     * @return Возвращает true если равна оператору, false если нет
     */
    private boolean checkOperator(String str){
        boolean flag;
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("\\") || str.equals("^")){
            return flag = true;
        }
        return flag = false;
    }

    /**
     * Метод находит в строке знак умножения и перемножает числа стоящие по обе стороны от него, заменяя произведение
     * этих чисел на результат операции
     * @param temp Математическое выражение в виде строки
     * @return Выражение в виде строки с расчитанным и замененным на результат значением произведения двух чисел
     */
    private StringBuilder multiplicationString(StringBuilder temp){
        // поиск умножения и выполнение его
        // определение числа справа если в конце и если в середине
        StringBuilder rNumber = new StringBuilder("");
        int marker1 = 0;
        int marker2 = 0;
        for (int i = temp.indexOf("*") + 2; i < temp.length(); i++) {
            if (temp.charAt(i) == ' '){
                marker2 = i;
                break;
            }
            rNumber.append(temp.charAt(i));
        }
        // определение числа слева если в начале или середине
        StringBuilder lNumber = new StringBuilder("");
        for (int i = temp.indexOf("*") - 2; i > -1; i--) {
            if (temp.charAt(i) == ' '){
                marker1 = i;
                break;
            }
            lNumber.append(temp.charAt(i));
        }
        lNumber.reverse();
        // выполнение умножения чисел
        int result = (int) multiplication(Integer.parseInt(lNumber.toString()), Integer.parseInt(rNumber.toString()));
        // замена в исходной строке выражения умножения на результат
        return temp.replace(marker1, marker2, " " + result);
    }

    /**
     * Метод находит в строке знак деления и делит числа стоящие по обе стороны от него, заменяя деление результатом операции
     * @param temp Математическое выражение в виде строки
     * @return Выражение в виде строки с расчитанным и замененным на результат значением деления одного числа на другое
     */
    private StringBuilder divString(StringBuilder temp){
        // поиск деления и выполнение его
        // определение числа справа если в конце и если в середине
        StringBuilder rNumber = new StringBuilder("");
        int marker1 = 0;
        int marker2 = 0;
        for (int i = temp.indexOf("\\") + 2; i < temp.length(); i++) {
            if (temp.charAt(i) == ' '){
                marker2 = i;
                break;
            }
            rNumber.append(temp.charAt(i));
        }
        // определение числа слева если в начале или середине
        StringBuilder lNumber = new StringBuilder("");
        for (int i = temp.indexOf("\\") - 2; i > -1; i--) {
            if (temp.charAt(i) == ' '){
                marker1 = i;
                break;
            }
            lNumber.append(temp.charAt(i));
        }
        lNumber.reverse();
        // выполнение деления чисел
        int result = (int) div(Integer.parseInt(lNumber.toString()), Integer.parseInt(rNumber.toString()));
        // замена в исходной строке выражения умножения на результат
        return temp.replace(marker1, marker2, " " + result);
    }

    /**
     * Метод находит в строке знак сложения и складывает числа стоящие по обе стороны от него, заменяя сумму
     * этих чисел на результат операции
     * @param temp Математическое выражение в виде строки
     * @return Выражение в виде строки с расчитанным и замененным на результат значением суммы двух чисел
     */
    private StringBuilder plusString(StringBuilder temp){
        // поиск сложения и выполнение его
        // определение числа справа если в конце и если в середине
        StringBuilder rNumber = new StringBuilder("");
        int marker1 = 0;
        int marker2 = 0;
        for (int i = temp.indexOf("+") + 2; i < temp.length(); i++) {
            if (temp.charAt(i) == ' '){
                marker2 = i;
                break;
            }
            rNumber.append(temp.charAt(i));
        }
        // определение числа слева если в начале или середине
        StringBuilder lNumber = new StringBuilder("");
        for (int i = temp.indexOf("+") - 2; i > -1; i--) {
            if (temp.charAt(i) == ' '){
                marker1 = i;
                break;
            }
            lNumber.append(temp.charAt(i));
        }
        lNumber.reverse();
        // выполнение сложения чисел
        int result = (int) plus(Integer.parseInt(lNumber.toString()), Integer.parseInt(rNumber.toString()));
        // замена в исходной строке выражения умножения на результат
        return temp.replace(marker1, marker2, " " + result);
    }

    /**
     * Метод находит в строке знак минус и вычитает числа стоящие по обе стороны от него, заменяя разность
     * этих чисел на результат операции
     * @param temp Математическое выражение в виде строки
     * @return Выражение в виде строки с расчитанным и замененным на результат значением разности двух чисел
     */
    private StringBuilder minusString(StringBuilder temp){
        // поиск знака минус и выполнение его
        // определение числа справа если в конце и если в середине
        StringBuilder rNumber = new StringBuilder("");
        int marker1 = 0;
        int marker2 = 0;
        for (int i = temp.indexOf("-") + 2; i < temp.length(); i++) {
            if (temp.charAt(i) == ' '){
                marker2 = i;
                break;
            }
            rNumber.append(temp.charAt(i));
        }
        // определение числа слева если в начале или середине
        StringBuilder lNumber = new StringBuilder("");
        for (int i = temp.indexOf("-") - 2; i > -1; i--) {
            if (temp.charAt(i) == ' '){
                marker1 = i;
                break;
            }
            lNumber.append(temp.charAt(i));
        }
        lNumber.reverse();
        // выполнение вычитания чисел
        int result = (int) minus(Integer.parseInt(lNumber.toString()), Integer.parseInt(rNumber.toString()));
        // замена в исходной строке выражения умножения на результат
        return temp.replace(marker1, marker2, " " + result);
    }



    // организовать проверку введенной строки на соответствие символам которые допустимы. Сравнивать каждый символ строки с шаблоном
    // удаление возможных пробелов в введенной строке
    // продумать алгоритм вычисления выражения
    // заимствовать функции Math ? или создавать свои ?
}
