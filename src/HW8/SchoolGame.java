package HW8;

import HW8.dto.*;
import HW8.service.School;

import java.util.*;

public class SchoolGame {

    private static School school = School.getInstance();
    private static List<String> subjectsNames = Arrays.asList("Математика", "Русский язык", "Белорусский язык",
            "Физика", "Химия", "Биология", "История", "Физкультура");


    public static int levelSelection() {
        Scanner scan = new Scanner(System.in);
        int level = 0;
        do {
            System.out.println("Выберите уровень сложности:\n1.Легко\n2.Средне\n3.Сложно\n0.Выход");
            try {
                level = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Неверные значения");
            }
            if (level >= 0 && level <=3) break;
        } while (true);
        return level;
    }



    public static boolean hireStaff(int teacherCount) {
        List<Teacher> initialTeacherList = new ArrayList<>();

        Random rnd = new Random();

        for (int i = 0, j = 0; i < teacherCount; i++, j++) {
            if (j==subjectsNames.size()) j = 0;
            if (rnd.nextBoolean()) {
                initialTeacherList.add(new Teacher(nameGenerator.getFullFemaleName(), subjectsNames.get(j)));
            } else {
                initialTeacherList.add(new Teacher(nameGenerator.getFullMaleName(), subjectsNames.get(j)));
            }
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Выбор преподавательского состава");
        for (Teacher teacher : initialTeacherList) {
            System.out.println(teacher);
            System.out.println("1.Нанять\n2.Пропустить\n0.Выход");
            int teachAnswer;
            do {
                teachAnswer = scan.nextInt();
            } while (teachAnswer < 0 || teachAnswer > 2);
            switch (teachAnswer) {
                case 1: school.addTeacher(teacher); break;
                case 2: break;
                case 0: return false;
            }
        }
        return true;
    }

    public static boolean makeClasses() {
        int feature = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("По какому признаку разделить учащихся на классы?\n" +
                    "1. Поведение\n" +
                    "2. Успеваемость\n" +
                    "3. IQ\n" +
                    "4. Скрытый потенциал\n" +
                    "5. Ежедневный доход\n" +
                    "6. Склонность к опозданиям\n" +
                    "0. Выход");
            try {
                feature = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Неверные значения");
            }
            if (feature >= 0 && feature <= 6) break;
        } while (true);

        switch (feature) {
            case 1: school.makeClasses(new PupilBehaviorComparator()); break;
            case 2: school.makeClasses(new PupilProgressComparator()); break;
            case 3: school.makeClasses(new PupilIQComparator()); break;
            case 4: school.makeClasses(new PupilLatentPotentialComparator()); break;
            case 5: school.makeClasses(new PupilDailyIncomeComparator()); break;
            case 6: school.makeClasses(new PupilLatinessComparator()); break;
            case 0: return false;
        }
        return true;
    }
}
