package HW8.dto;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class nameGenerator {
    private static List<String> femaleNames = Arrays.asList("Мария", "Анна",
            "Юлия", "Екатерина", "Елизавета", "Анастасия", "Владислава", "Надежда", "Ксения", "Евгения");
    private static List<String> maleNames = Arrays.asList("Юрий", "Антон",
            "Илья", "Аркадий", "Геннадий", "Марк", "Максим", "Дмитрий", "Иван", "Александр");
    private  static List<String> lastNames = Arrays.asList("Иванов", "Петров", "Сидоров", "Шот", "Крель", "Гуткович", "Рудаков",
            "Шуринов", "Гвоздовский", "Рудницкий");

    /***
     * метод возвращающий полное женское имя, сформированное случайным образом
     * @return ФИО
     */
    public static String getFullFemaleName() {
        Random rnd = new Random();
        return getFullFemaleName(maleNames.get(rnd.nextInt(maleNames.size())), lastNames.get(rnd.nextInt(lastNames.size())));
    }

    public static String getFullFemaleName(String parentLastName) {
        Random rnd = new Random();
        return getFullFemaleName(maleNames.get(rnd.nextInt(maleNames.size())), parentLastName);
    }

    public static String getFullFemaleName(String parentName, String parentLastName) {
        String resultName = "";
        String lastName;
        String firstName;
        String patronymic;

        Random rnd = new Random();
        lastName = parentLastName;
        if (lastName.endsWith("ий")) {
            lastName = lastName.substring(0, lastName.length()-2) + "ая";
        } else if (lastName.endsWith("ов") || lastName.endsWith("ев")){
            lastName = lastName + "а";
        }
        firstName = femaleNames.get(rnd.nextInt(femaleNames.size()));
        patronymic = getFemalePatronymic(parentName);
        resultName = lastName + " " + firstName + " " + patronymic;
        return resultName;
    }

    /***
     * Метод возвращающий женское отчество
     * @param maleName образующее отчество мужское имя
     * @return отчество
     */
    private static String getFemalePatronymic(String maleName) {
        String result = "";
        if (maleName.endsWith("трий")) {
            result = maleName.substring(0,maleName.length()-2) + "иевна";
        } else if (maleName.endsWith("ий")) {
            result = maleName.substring(0, maleName.length() - 2) + "ьевна";
        } else if (maleName.endsWith("ей")) {
            result = maleName.substring(0, maleName.length() - 2) + "еевна";
        } else if (maleName.endsWith("а")) {
            result = maleName.substring(0, maleName.length() - 1) + "ична";
        } else if (maleName.endsWith("я")) {
            result = maleName.substring(0, maleName.length() - 1) + "инична";
        } else {
            result = maleName + "овна";
        }
        return result;
    }

    /***
     * Метод возвращающий мужское отчество
     * @param maleName образующее отчество мужское имя
     * @return отчество
     */
    private static String getMalePatronymic(String maleName) {
        String result = "";
        if (maleName.endsWith("трий")) {
            result = maleName.substring(0,maleName.length()-2) + "иевич";
        } else if (maleName.endsWith("ий")) {
            result = maleName.substring(0,maleName.length()-2) + "ьевич";
        } else if (maleName.endsWith("ей")) {
            result = maleName.substring(0,maleName.length()-2) + "еевич";
        } else if (maleName.endsWith("а") || maleName.endsWith("я")) {
            result = maleName.substring(0,maleName.length()-1) + "ич";
        } else {
            result = maleName + "ович";
        }
        return result;
    }

    /***
     * Метод возвращающий мужское ФИО
     * @param parentName имя отца для образования отчества
     * @param parentLastName фамилия родителя
     * @return ФИО
     */
    public static String getFullMaleName(String parentName, String parentLastName) {
        String resultName = "";
        String firstName;
        String patronymic;

        Random rnd = new Random();
        firstName = maleNames.get(rnd.nextInt(maleNames.size()));
        patronymic = getMalePatronymic(parentName);
        resultName = parentLastName + " " + firstName + " " + patronymic;
        return resultName;
    }

    public static String getFullMaleName() {
        Random rnd = new Random();
        return getFullMaleName(maleNames.get(rnd.nextInt(maleNames.size())), lastNames.get(rnd.nextInt(lastNames.size())));
    }

    public static String getFullMaleName(String parentLastName) {
        Random rnd = new Random();
        return getFullMaleName(maleNames.get(rnd.nextInt(maleNames.size())), parentLastName);
    }

    public static String getFullRandomName() {
        Random rnd = new Random();
        if (rnd.nextBoolean()) {
            return getFullFemaleName();
        } else return getFullMaleName();
    }

    public static String getFullRandomName(String parentName) {
        Random rnd = new Random();
        if (rnd.nextBoolean()) {
            return getFullFemaleName(parentName);
        } else return getFullMaleName(parentName);
    }

    public static String getFullRandomName(String parentName, String parentLastName) {
        Random rnd = new Random();
        if (rnd.nextBoolean()) {
            return getFullFemaleName(parentName, parentLastName);
        } else return getFullMaleName(parentName, parentLastName);
    }
}
