package HW7.part1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    public Person(String nick, String password) {
        String regExPass = "[А-Яа-яA-Za-z ]{5,10}";//"[a-zA-ZА-Яа-я ]{5,10}";
        Pattern pattern = Pattern.compile(regExPass);
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("\nПароль состоять из 5-10 символов," +
                    "включая прописные и строчные буквы латиницы и кириллицы и пробел");
        }
        String regExNick = "[А-Яа-яA-Za-z ]+";
        pattern = Pattern.compile(regExNick);
        matcher = pattern.matcher(nick);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Псевдоним должен состоять из строчных и заглавных букв кириллицы или латиницы, а также пробел.");
        }
        this.nick = nick;
        this.password = password;
    }
    private String nick;
    private String password;

    @Override
    public String toString() {
        return "\nnick: " + this.nick +"\npassword: " + this.password.length();
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }
}
