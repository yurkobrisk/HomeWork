package SiteLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Загрузка курса с сайта Беларус Банка
 */
public class BPSLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://www.bps-sberbank.by/page/currency-exchange-cards", currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, Currency currencyName) {
        double result = 0;
        String stringCurrency = "";

        List<Integer> stringList = new ArrayList<>(); // лист для хранения совпадений
        Matcher matcher = Pattern.compile("<span class=\"nameOfCurrency\">").matcher(content); // строка с которой начинается описание курса валюты
        while (matcher.find()){
            stringList.add(matcher.start());    // записать индекс с которого начинается строка содержащая курс валюты
        }
        // формирование строки с курсом валюты и извлечение из нее курса продажи
        for (Integer integer : stringList) {
            stringCurrency = content.substring(integer, integer + 104);
            if (stringCurrency.contains(currencyName.toString())){  // если строка содержит имя искомой валюты
                // создать новую строку и заменить в ней запятую на точку если имеется (а она есть)
                String filteredString = content.substring(integer, integer + 104).replace(',', '.');
                int indexCurrency = filteredString.indexOf("currency") + 35; // поиск индекса начала курса для валюты
                // преобразовать подстроку с курсом в число и вернуть в методе
                return result = Double.parseDouble(filteredString.substring(indexCurrency, indexCurrency + 6));
            }
        }
        // формировать строку class="currency"> ... и из нее считать курс валюты
        return result;
    }
}
