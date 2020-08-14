package HW7.part2;

public class EasySearch implements ISearchEngine {
    @Override
    public int search(String book, String word) {
        int ind = book.indexOf(word);
        if (ind == -1) return 0;
        int count = 1;
        do {
            ind = book.indexOf(word,ind+1);
            if (ind != -1) count++;
        } while (ind != -1);
        return count;
    }
}
