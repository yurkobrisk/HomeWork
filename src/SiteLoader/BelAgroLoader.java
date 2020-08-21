package SiteLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Загрузка курса с сайта Беларус Банка
 */
public class BelAgroLoader extends SiteLoader {

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
        // формирование строки с курсом валюты
        for (Integer integer : stringList) {
            stringCurrency = content.substring(integer, integer + 104);
            if (stringCurrency.contains(currencyName.toString())){
                System.out.println(content.substring(integer, integer + 104));
                break;
            }
        }
        // формировать строку class="currency"> ... и из нее считать курс валюты

//        int index = content.indexOf("\"" + currencyName.toString() + "_out\"");  // поиск подстроки с курсом валюты
        return result/*Double.parseDouble(content.substring(index + 11, index + 17))*/;
    }
}
