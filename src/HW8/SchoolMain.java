package HW8;

import HW8.service.School;

public class SchoolMain {
    public static void main(String[] args) {

        int pupilNumber = 100;

        int teacherCount = 0;

        switch(SchoolGame.levelSelection()){
            case 1: teacherCount = 25; break;
            case 2: teacherCount = 17; break;
            case 3: teacherCount = 10; break;
            case 0: return;
        }

        if (!SchoolGame.hireStaff(teacherCount)) {
            return;
        }

        School school = School.getInstance();
        school.printSubjectList();
        school.printTeacherList();

        for (int i = 0; i < pupilNumber; i++) {
            school.addPupil();
        }

        school.printPupilList();


        if (!SchoolGame.makeClasses()) {
            return;
        }
        school.printClassesList();

    }
}
