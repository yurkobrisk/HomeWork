package SiteLoader;

/**
 * Загрузка курса с сайта Беларус Банка
 */
public class BelarusBankLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://belarusbank.by/api/kursExchange", currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, Currency currencyName) {
            int index = content.indexOf("\"" + currencyName.toString() + "_out\"");  // поиск подстроки с курсом валюты
        return Double.parseDouble(content.substring(index + 11, index + 17));
    }
}
