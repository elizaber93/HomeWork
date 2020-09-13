package HW8.dto;

import java.util.Comparator;
import java.util.Random;

public class Pupil extends Child implements IPerson {
    private String classNumber;
    private final Family family;
    private double behavior;
    private double progress;
    private int baseIQ;
    private boolean lateness;
    private boolean latentPotential;
    private double dailyIncome;

    public Pupil(Family family) {
        super(nameGenerator.getFullRandomName(family.father.getFirstName(),family.father.getLastName()));
        this.family = family;
        family.children.add(this);
        Random rnd = new Random();
        this.behavior = (double)(rnd.nextInt(10)+1)/10;
        this.progress = (double)(rnd.nextInt(10)+1)/10;
        this.baseIQ = rnd.nextInt(160);
        this.lateness = rnd.nextBoolean();
        this.latentPotential = rnd.nextBoolean();
        this.dailyIncome = family.getBudget()/44;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public Family getFamily() {
        return family;
    }

    public double getBehavior() {
        return behavior;
    }

    public double getProgress() {
        return progress;
    }

    public int getBaseIQ() {
        return baseIQ;
    }

    public boolean isLateness() {
        return lateness;
    }

    public boolean isLatentPotential() {
        return latentPotential;
    }

    public double getDailyIncome() {
        return dailyIncome;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                this.getFullName() +
                //", family=" + family +
                '}';
    }

}
