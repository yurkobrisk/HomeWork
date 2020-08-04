package HomeWork7;

public class StringMain2 {
    public static void main(String[] args) {

//        1. считать сохранённый файл и сохранить результат счтитывания в переменную типа типа String
        String stringIn = StringMain1.readAllBytesJava7("Война и мир_книга.txt"); // записать в переменную содержимое текстового файла
//        System.out.println(stringIn); // вывод в консоль всей строки
//        System.out.println(stringIn.substring(0, 1000)); // вывод в консоль подстроки от 0 до 1000 символа

//        5. Вывести информацию как часто встречаются строки "война", "и" (как союз), "мир".
//        Написать два мэйн класса, в одном используем реализацию EasySearch, во втором RegExSearch.
        RegExSearch regExSearch = new RegExSearch();
        int countWar = regExSearch.search(stringIn, "война");
        System.out.println("Слово война встречается " + countWar + " раз.");
        int countAnd = regExSearch.search(stringIn, " и ");
        System.out.println("Союз и встречается " + countAnd + " раз.");
        int countPeace = regExSearch.search(stringIn, "мир");
        System.out.println("Слово мир встречается " + countPeace + " раз.");

    }
}
