package HW7.part2;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine{

    @Override
    public int search(String book, String word) {

        int count=0;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(book);
        while(matcher.find()) {
            count++;
        }
        return count;
    }
}
