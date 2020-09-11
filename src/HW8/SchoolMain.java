package HW8;

import HW8.dto.Teacher;
import HW8.dto.nameGenerator;
import HW8.service.School;

import java.util.*;

public class SchoolMain {
    public static void main(String[] args) {

        int pupilNumber = 100;

        List<String> subjectsNames = Arrays.asList("Математика", "Русский язык", "Белорусский язык",
                "Физика", "Химия", "Биология", "История", "Физкультура");
        int teacherCount = 0;
        int level = 0;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Выберите уровень сложности:\n1.Легко\n2.Средне\n3.Сложно\n0.Выход");
            try {
                level = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Неверные значения");
            }
            if (level >= 0 && level <=3) break;
        } while (true);

        switch(level){
            case 1: teacherCount = 25; break;
            case 2: teacherCount = 17; break;
            case 3: teacherCount = 10; break;
            case 0: return;
        }

        School school = School.getInstance();

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
                case 0: return;
            }
        }
        school.printSubjectList();
        school.printTeacherList();

        for (int i = 0; i < pupilNumber; i++) {
            school.addPupil();
        }

        school.printPupilList();


        int feature = 0;
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
            case 1:
            case 2:
            case 3:
            case 4: school.makeClassesByLatentPotential();break;
            case 5:
            case 6:
            case 0: return;
        }
        school.printClassesList();




    }
}
