package HW7.part2;

public class RegExMain {
    public static void main(String[] args) {
        String filePath = "Война и мир_книга.txt";
        String book = ReadContent.readAllBytesJava7( filePath );
        ISearchEngine search = new RegExSearch();
        String war = "война";
        String peace = "мир";
        String and = " и ";


        System.out.println(output(war, book, search));
        System.out.println(output(peace, book, search));
        System.out.println(output(and, book, search));


    }
    public static String output(String word, String book, ISearchEngine search){
        int count = search.search(book,word);
        String result = "Слово \"" + word + "\" встречается в книге " + count;
        if (count%2 == 0) result += " раза";
        else result += " раз";
        return result;
    }
}
