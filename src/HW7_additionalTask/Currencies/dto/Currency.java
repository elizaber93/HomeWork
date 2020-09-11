package HW7_additionalTask.Currencies.dto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Currency implements ICurrency{
    double value;
    char variation;
    String date;

    public double getValue() {
        return value;
    }
    public Currency() {

    }

    public abstract void setCurrency(StringBuilder content);

    public void setCurrency(StringBuilder content,String regEx) {

        String result = "";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(content);

        if (matcher.find()) {
            result = matcher.group();
            if (result.endsWith("+")) this.variation = 9650;
            else if (result.endsWith("-")) this.variation = 9660;
            matcher = Pattern.compile("[0-9]+\\.[0-9]+").matcher(result);
            if (matcher.find()) this.value = Double.parseDouble(matcher.group());
        }
    }

    public abstract void printState();

}
