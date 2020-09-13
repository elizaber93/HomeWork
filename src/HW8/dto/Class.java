package HW8.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class {
    String classNumber;
    Teacher classTeacher;
    List<Pupil> classList = new ArrayList<>();
    List<Subject> subjects = new ArrayList<>();
    Map<String, Map<String, Integer>> journal = new HashMap<>();

    public int getPupilsNumber() {
        return this.classList.size();
    }

    public Class(String classNumber) {
        this.classNumber = classNumber;
    }

    public void setClassTeacher(Teacher teacher) {
        if (!teacher.isClassTeacher()) {
            this.classTeacher = teacher;
        } else {
            System.out.println("Выберите другого классного руководителя");
        }
    }
    public void addPupil(Pupil pupil) {
        this.classList.add(pupil);
        pupil.setClassNumber(this.classNumber);
    }

    @Override
    public String toString() {
        return "Class{" +
                "classNumber='" + classNumber + '\'' +
                ", classList=" + classList +
                '}';
    }
}
