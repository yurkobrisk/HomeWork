package SiteLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Загрузка курса с сайта Альфа Банка
 */
public class BAPBLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://belapb.by/ExCardsDaily.php?ondate=08/21/2020", currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, Currency currencyName) {
        content = content.replaceAll("\n[\\s]+", "");
        String stringCurrency = ""; // строка с курсами валюты покупка/продажа

        // поиск валюты и запись в новую строку данных о курсе
        List<Integer> stringList = new ArrayList<>(); // лист для хранения совпадений
        Matcher matcher = Pattern.compile("<CharCode>" + currencyName + "</CharCode>").matcher(content); // строка с которой начинается описание курса валюты
        while (matcher.find()){
            stringList.add(matcher.start());    // записать индекс с которого начинается строка содержащая курс валюты
        }

        int indexCurrency = 0;  // индекс в строке для начала считывания курса валюты
        for (Integer integer : stringList) {
            stringCurrency = content.substring(integer, integer + 105); // искомая строка с переданной валютой
            indexCurrency = stringCurrency.indexOf("<RateSell>") + 10;
        }
        return Double.parseDouble(stringCurrency.substring(indexCurrency, indexCurrency+6));
    }
}
