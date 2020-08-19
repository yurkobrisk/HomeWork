package SiteLoader;

/**
 * Загрузка курса с сайта Альфа Банка
 */
public class AlfaLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/rates", currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, Currency currencyName) {
        double rate = 0;
        String regexp = "\"buyIso\":\"BYN\"";

        for (int i = 0; i < content.length(); i++) {
            StringBuilder stringRate = new StringBuilder();
            if (content.charAt(i) == '{'){  // вычлиняем строку в фигурных скобках и анализируем ее

                do {
                    stringRate.append(content.charAt(i));  // формируется строка в фигурных скобках
                    i++;
                } while (content.charAt(i) != '}');
                stringRate.append(content.charAt(i));  // дописать фигурную скобку

                if (stringRate.toString().contains(currencyName.toString()) && stringRate.toString().contains(regexp)) {
                    // анализ строки на переданный тип валюты
                    int index = stringRate.toString().lastIndexOf("buyRate");  // поиск подстроки с курсом валюты
                    rate = Double.parseDouble(stringRate.substring(index + 9, index + 17)); // курс валюты
                    break;
                }
            }
        }
        return rate;
    }
}
