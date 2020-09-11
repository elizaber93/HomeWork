package HW8.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teacher extends Person implements IPerson {

    private List<String> subjects = new ArrayList<>();
    private Category category;
    private double certificateScore;
    private boolean latentPotential;
    private double dailyCost;
    private boolean isClassTeacher = false;

    public boolean isClassTeacher() {
        return this.isClassTeacher;
    }
    public void setClassTeacher(boolean value) {
        this.isClassTeacher = value;
    }

    public Teacher(String fullName, String subject) {
        super(fullName);
        this.subjects.add(subject);
        Random rnd = new Random();
        int categoryInt = rnd.nextInt(3)+1;
        if (categoryInt == Category.BEGINNER.getIndex()) this.category = Category.BEGINNER;
        else if (categoryInt == Category.FIRST.getIndex()) this.category = Category.FIRST;
        else if (categoryInt == Category.SECOND.getIndex()) this.category = Category.SECOND;
        else if (categoryInt == Category.HIGHER.getIndex()) this.category = Category.HIGHER;
        certificateScore = (double)(rnd.nextInt(100)+1)/10;
        this.latentPotential = rnd.nextBoolean();
        this.dailyCost = (double)(rnd.nextInt(500)+350)/22;
    }


    public List<String> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "FIO=" + this.getFullName() +
                ",subjects=" + subjects +
                ", category=" + category.rus +
                ", certificateScore=" + certificateScore +
                ", latentPotential=" + latentPotential +
                ", dailyCost=" + dailyCost +
                '}';
    }
}
