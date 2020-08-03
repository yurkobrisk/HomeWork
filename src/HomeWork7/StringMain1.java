package HomeWork7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class StringMain1 {
    public static void main(String[] args) {

//        1. считать сохранённый файл и сохранить результат счтитывания в переменную типа типа String
        String stringIn = "";
        stringIn = readAllBytesJava7("Война и мир_книга.txt"); // записать в переменную содержимое текстового файла
//        System.out.println(stringIn); // вывод в консоль всей строки
//        System.out.println(stringIn.substring(0, 1000)); // вывод в консоль подстроки от 0 до 1000 символа

//        5. Вывести информацию как часто встречаются строки "война", "и" (как союз), "мир".
//        Написать два мэйн класса, в одном используем реализацию EasySearch, во втором RegExSearch.
        EasySearch easySearch = new EasySearch();

        int countWar = easySearch.search(stringIn, "война"); // поиск слова война - 51 раз встречатеся
        System.out.println("Слово война встречается " + countWar + " раз.");

        int countAnd = easySearch.search(stringIn, " и ");  // поиск союза и - 13221 раз встречается
        System.out.println("Союз и встречается " + countAnd + " раз.");

        int countPeace = easySearch.search(stringIn, "мир");  // поиск слова мир - 294 раза встречается
        System.out.println("Слово мир встречается " + countPeace + " раз.");

//        6. В книге "Война и мир" найти все уникальные слова и поместить их в коллекцию используя Set
        Set<String> stringSet = new HashSet<>();

        stringIn = deletePunctuation(stringIn); // заменить знаки пунктуации на пробелы

        String[] stringArray = stringIn.split(" "); // записать слова разделенные пробелом в массив

        stringSet.addAll(Arrays.asList(stringArray)); // записать все слова в колекцию Set. Записываются уникальные слова
//        System.out.println(stringSet); // вывод в консоль коллекции

//        7. В книге "Война и мир" найти топ 10 слов и вывести количество количество этих слов используя Map.
//        Отсортировать по количеству. Распечатать в консоль. Пример: Война - 200 раз, Мир - 100 раз.......

        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < stringArray.length; i++) { // заполнить мапу из массива
            if (hashMap.get(stringArray[i]) == null ){ // если такой строки еще нет в мапе, записать со значением 1
                hashMap.put(stringArray[i], 1);
            } else {
                hashMap.put(stringArray[i], hashMap.get(stringArray[i]) + 1); // иначе увеличить значение на 1
            }
        }

        System.out.println(hashMap.size());
        System.out.println(hashMap.entrySet());

    }

    /**
     * Метод передает содержимое текстового файла в строку
     * @param fileIn имя текстового файла с расширением
     * @return строка с содержимым текстового файла
     */
    public static String readAllBytesJava7(String fileIn){
        String stringOut = "";
        try {
            stringOut = new String(Files.readAllBytes(Paths.get(fileIn)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringOut;
    }

    /**
     * Метод заменяет знаки пунктуации на пробелы
     * @param stringIn строка
     */
    public static String deletePunctuation(String stringIn){
        stringIn = stringIn.replace(".", " ");
        stringIn = stringIn.replace(":", " ");
        stringIn = stringIn.replace(";", " ");
        stringIn = stringIn.replace("=", " ");
        stringIn = stringIn.replace(",", " ");
        stringIn = stringIn.replace("\"", " ");
        stringIn = stringIn.replace("-", " ");
        stringIn = stringIn.replace("!", " ");
        stringIn = stringIn.replace("?", " ");
        stringIn = stringIn.replace("\\", " ");
        stringIn = stringIn.replace("(", " ");
        return stringIn = stringIn.replace(")", " ");
    }
}
