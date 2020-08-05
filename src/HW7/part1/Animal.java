package HW7.part1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Animal {
    public Animal(String nick,int age) {
        if (age > 15 || age < 1) {
            throw new IllegalArgumentException("Возраст может находиться в диапазоне от 1 до 15");
        }
        String regEx = "[A-Za-z А-Яа-я]+";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(nick);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Имя может состоять только из латинских букв");
        }
        this.nick = nick;
        this.age = (byte)age;
    }
    private String nick;
    private byte age;

    public String toString() {
        return "\nNick: " + this.nick + "\nAge: " + this.age;
    }

    public String getNick() {
        return nick;
    }

    public byte getAge() {
        return age;
    }
}
