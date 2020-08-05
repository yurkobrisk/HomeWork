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

        int countWar = easySearch.search(deletePunctuation(stringIn.toLowerCase()), "война"); // поиск слова война - 57 раз встречатеся
        System.out.println("Слово война встречается " + countWar + " раз.");

        int countAnd = easySearch.search(deletePunctuation(stringIn.toLowerCase()), " и ");  // поиск союза и - 14593 раз встречается
        System.out.println("Союз и встречается " + countAnd + " раз.");

        int countPeace = easySearch.search(deletePunctuation(stringIn.toLowerCase()), "мир");  // поиск слова мир - 298 раза встречается
        System.out.println("Слово мир встречается " + countPeace + " раз.");

//        6. В книге "Война и мир" найти все уникальные слова и поместить их в коллекцию используя Set
        Set<String> stringSet = new HashSet<>(); // пустая коллекция

        stringIn = deletePunctuation(stringIn.toLowerCase()); // заменить знаки пунктуации на пробелы и конвертировать в нижний регистр

        String[] stringArray = stringIn.split(" "); // записать слова разделенные пробелом в массив

        stringSet.addAll(Arrays.asList(stringArray)); // записать все слова в колекцию Set. Записываются уникальные слова
//        System.out.println(stringSet); // вывод в консоль коллекции

//        7. В книге "Война и мир" найти топ 10 слов и вывести количество количество этих слов используя Map.
//        Отсортировать по количеству. Распечатать в консоль. Пример: Война - 200 раз, Мир - 100 раз.......
//        Map ---> List<Map> ---> Collections.sort() --> List<Map> (Sorted) ---> LinkedHashMap

        Map<String, Integer> treeMap = new TreeMap<>(); // сортированный map
        for (int i = 0; i < stringArray.length; i++) { // заполнить мапу из массива
            if (treeMap.get(stringArray[i]) == null ){ // если такой строки еще нет в мапе, записать со значением 1
                treeMap.put(stringArray[i], 1);
            } else {
                treeMap.put(stringArray[i], treeMap.get(stringArray[i]) + 1); // иначе увеличить значение на 1
            }
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<>(treeMap.entrySet()); // конвертировать в List
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() { // сортировать
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) { // переопределить компаратор
                return (o2.getValue().compareTo(o1.getValue())); // сравнение по убыванию
            }
        });

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(); // связанный map
        for (Map.Entry<String, Integer> stringIntegerEntry : list) {
            linkedHashMap.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue()); // заполнение map в обратном порядке

        }

        ShowInfo<String, Integer> showInfo = new ShowInfo<>(linkedHashMap); //создание объекта map
        showInfo.printInfo(20);                                              //вывод в консоль самых частых слов
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
     * Метод заменяет знаки пунктуации на пробелы и замена повторяющихся пробелов друг за другом на одина пробел
     * @param stringIn строка
     */
    public static String deletePunctuation(String stringIn){
        stringIn = stringIn.replace("\n", " ");
        stringIn = stringIn.replace("\r", " ");
        stringIn = stringIn.replace("\r\n", " ");
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
        stringIn = stringIn.replace(")", " ");
        return stringIn = stringIn.replaceAll("\\s+", " ");

    }
}
