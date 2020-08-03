package HomeWork7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

//  4*. Написать класс RegExSearch реализующий интерфейс ISearchEngine.
//  Реализовать поиск по строкам при помощи класса Matcher.

    @Override
    public int search(String book, String word) {
        int counter = 0; // счетчик совпадений слова word в book
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(book.toLowerCase());
        while (matcher.find()){
            counter++;
        }
        return counter;
    }
}
