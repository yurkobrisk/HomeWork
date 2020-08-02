package HomeWork7;

public class EasySearch implements ISearchEngine {

//    3. Написать класс EasySearch реализующий интерфейс ISearchEngine.
//    Реализовать поиск по строкам при помощи метода indexOf.
//    В данной реализации запрещено использовать регулярные выражения в любом виде, для любых задач

    @Override
    public int search(String book, String word) {
        int count = 0;
        int flag = 0;
        if (book.startsWith(word)){
            count ++;
        }
        while (flag != -1){
            flag = book.indexOf(word, flag + 1);
            if (flag == -1) break;
            count ++;
        }
        return count;
    }
}
