package HW7_additionalTask.SiteLoader;

public class Test {
    public static void main(String[] args) {

        System.out.println("Нацбанк_исходный");
        printRates(new initialNBRBLoader());
        System.out.println("Нацбанк");
        printRates(new NBRBLoader());
        System.out.println("Альфа-банк");
        printRates(new AlfaLoader());
        System.out.println("Беларусбанк");
        printRates((new BelarusbankLoader()));
        System.out.println("БПС-банк");
        printRates(new BPSLoader());
        System.out.println("БелАПБ");
        printRates(new BelAPBLoader());

    }

    public static void printRates(SiteLoader loader){
        System.out.println("EUR: " + loader.load(SiteLoader.Currency.EUR));
        System.out.println("RUB: " + loader.load(SiteLoader.Currency.RUB));
        System.out.println("USD: " + loader.load(SiteLoader.Currency.USD) + "\n");
    }
}
