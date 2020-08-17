package HW7_additionalTask.SiteLoader;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Загрузчик курса с сайта BelAPB
 */
public class BelAPBLoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        Calendar calendar = new GregorianCalendar();
        return load("https://belapb.by/ExCardsDaily.php?ondate=" + (calendar.get(2)+1) +"/" + calendar.get(5) + "/" + calendar.get(1), currencyName);
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
        String regEx = currencyName.getId() + "[<>\\/A-Za-z\\n\\s]+[0-9]+[<>\\/A-Za-z\\n\\s]+[0-9\\.]+[<>\\/A-Za-z\\n\\s]+[0-9\\.]+";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) result = matcher.group();
        pattern = Pattern.compile("[0-9\\.]+$");
        matcher = pattern.matcher(result);
        if (matcher.find()) return Double.parseDouble(matcher.group());
        return 0;
    }
}
