package SiteLoader;

public class Test {
    public static void main(String[] args) {
        System.out.println("Курс Нац.Банка: ");
        printRates(new NBRBLoader());
        System.out.println("Курс Альфа Банка: ");
        printRates(new AlfaLoader());
        System.out.println("Курс Беларусбанка: ");
        printRates(new BelarusBankLoader());
        System.out.println("Курс БПС Банка: ");
        printRates(new BPSLoader());
    }

    public static void printRates(SiteLoader loader){
        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUB));
        System.out.println(loader.load(SiteLoader.Currency.USD));
    }
}
