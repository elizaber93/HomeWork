package HW8.dto;

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
        //family.children.add(this);
    }

    @Override
    public String toString() {
        return "Pupil{" +
                this.getFullName() +
                ", family=" + family +
                '}';
    }
}
