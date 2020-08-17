package HW7_additionalTask.SiteLoader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Загрузчик курса с сайта Alfa-bank
 */
public class AlfaLoader extends SiteLoader{

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
        //TODO дописываем код сюда

        String result="";
        String regEx = currencyName.getId() + ",\"buyRate\":[0-9\\.]+(,\"buyIso\":\"BYN\")";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) result = matcher.group();
        pattern = Pattern.compile("([0-9]+\\.[0-9]+)");
        matcher = pattern.matcher(result);
        if (matcher.find()) return Double.parseDouble(matcher.group());
        return 0;
    }
}
