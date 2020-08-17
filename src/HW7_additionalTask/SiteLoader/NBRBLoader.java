package HW7_additionalTask.SiteLoader;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Загрузчик курса с сайта Alfa-bank
 */
public class NBRBLoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://www.nbrb.by/statistics/rates/ratesdaily.asp", currencyName);
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
        String regEx = currencyName + "[<>\\/a-z\\s=\"A-Z]+[0-9,]+";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) result = matcher.group();
        result = result.replaceAll(",",".");
        pattern = Pattern.compile("[0-9\\.]+$");
        matcher = pattern.matcher(result);
        if (matcher.find()) return Double.parseDouble(matcher.group());
        return 0;
    }
}
