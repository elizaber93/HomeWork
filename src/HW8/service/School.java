package HW8.service;

import HW8.dto.*;
import HW8.dto.Class;

import java.util.*;

public class School {
    private static School instance = null;
    private List<Subject> subjectList = new ArrayList<>();
    private List<Teacher> teachersList = new ArrayList<>();
    private List<Pupil> pupils = new ArrayList<>();
    private Map<String, Class> classes = new HashMap<>();

    

    public void printSubjectList() {
        for (Subject subject : subjectList) {
            System.out.println(subject);
        }
    }

    public void printTeacherList() {
        for (Teacher teacher : teachersList) {
            System.out.println(teacher);
        }
    }

    public School() {
    }

    public synchronized static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }

    public void addTeacher(Teacher teacher) {
        this.teachersList.add(teacher);
        for (String subject : teacher.getSubjects()) {
            this.subjectList.add(new Subject(subject, teacher));
        }
    }

    public void addSubject(String name) {
        if (teachersList.size() == 0) {
            System.out.println("Отсутствует преподавательский состав");
            return;
        }
        Random rnd = new Random();
        subjectList.add(new Subject(name, teachersList.get(rnd.nextInt(teachersList.size()))));
    }

    public void addPupil() {
        Family family = new Family(new Parent(nameGenerator.getFullFemaleName()), new Parent(nameGenerator.getFullMaleName()));
        pupils.add(new Pupil(family));
    }

    public void printPupilList() {
        for (Pupil pupil : pupils) {
            System.out.println(pupil);
        }
    }

}
