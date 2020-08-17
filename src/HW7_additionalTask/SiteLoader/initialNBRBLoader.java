package HW7_additionalTask.SiteLoader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Загрузчик курса с сайта NBRB
 */
public class initialNBRBLoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/"+currencyName.getNbrbIdId(), currencyName);
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
        Pattern pattern = Pattern.compile("[0-9]+\\.[0-9]+");
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) return Double.parseDouble(matcher.group());
        return 0;
    }
}
