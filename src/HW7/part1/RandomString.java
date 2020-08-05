package HW7.part1;

import java.util.Random;

public class RandomString {
    public String random(int stringLength) {//, String language) {
        Random rnd = new Random();
        StringBuilder result = new StringBuilder("");
        /*
        int firstLetter;
        if (language.equals("rus")) {
            firstLetter = 1040 + rnd.nextInt(32);
            result.append((char)firstLetter);
            for (int i = 1; i < stringLength; i++) {
                result.append((char)(1072 + rnd.nextInt(32)));
            }
            return result.toString();
        }

        if (language.equals("eng")) {
            firstLetter = 65 + rnd.nextInt(26);
            result.append((char)firstLetter);
            for (int i = 0; i < stringLength; i++) {
                result.append((char)(97+rnd.nextInt(26)));
            }
            return result.toString();
        }
        throw new IllegalArgumentException("Укажите язык строки eng/rus и длину сроки");

         */

        do {
            switch (rnd.nextInt(3)) {
                case 0:
                    result.append((char) 32);
                    break;
                case 1:
                    result.append((char) (65 + rnd.nextInt(26)));
                    break;
                case 2:
                    result.append((char) (97 + rnd.nextInt(26)));
                    break;
                case 3:
                    result.append((char) (1040 + rnd.nextInt(32)));
                    break;
                case 4:
                    result.append((char) (1072 + rnd.nextInt(32)));
                    break;
            }

        } while (result.length() <= stringLength);
        return result.toString();
    }
}
