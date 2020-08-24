package RatesMonitoring;

import SiteLoader.SiteLoader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class RatesMain {
    public static void main(String[] args) throws Exception {

        do {
            URL url = new URL("https://myfin.by/currency/torgi-na-bvfb");
            URLConnection con = url.openConnection();
            InputStream inputStream = con.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder content = new StringBuilder();
            String tempString = null;
            while ((tempString = bufferedReader.readLine()) != null){
                content.append(tempString).append("\n");
            }

            int index1 = content.indexOf("<tbody class=\"table-body\">", 0); // индекс начала таблицы
            int index2 = content.indexOf("</table>", index1);   // индекс конца таблицы
            tempString = content.substring(index1, index2); // таблица с данными записанная в строку

//        System.out.println(tempString);

            String currency = "USD";
            int indexCurrency = tempString.indexOf(currency); // определение индекса расположения валюты в строке
            int indexRate = tempString.indexOf("curr_block", indexCurrency) + 12; // определение индекса начала курса валюты
            int indexUp = tempString.indexOf("\"up\"", indexCurrency) + 5; //определение индекса изменения текущего курса валюты
            int indexDate = tempString.indexOf("<td>", indexUp) + 4; //определение индекса для даты последней операции
            System.out.println("Валюта: " + currency);
            System.out.println("Текущий курс валюты: " + tempString.substring(indexRate, indexRate + 6)); // текущий курс валюты

            // изменение текущего курса валюты
            String currString = "";
            do {
                currString += tempString.charAt(indexUp);
                indexUp++;
            } while (tempString.charAt(indexUp) != '<');
            System.out.println("Изменение текущего курса валюты: " + currString);

            // дата последней операции
            System.out.println("Дата последней операции: " + tempString.substring(indexDate, indexDate + 16));
            System.out.println("______________________________________________");

            // задерка обновления
            Thread.sleep(20000);
        } while (true); // время торгов здесь указать



    }

    public static void printRate(SiteLoader siteLoader){
        System.out.println(siteLoader.load(SiteLoader.Currency.USD));
    }
}
