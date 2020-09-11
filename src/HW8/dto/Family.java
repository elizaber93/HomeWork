package HW8.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Family {
    IPerson mother;
    IPerson father;
    List<IPerson> children = new ArrayList<>();
    private double budget;
    private double dailyBudgetGrowth;


    public Family(IPerson mother, IPerson father) {
        this.mother = mother;
        this.father = father;
        Random rnd = new Random();
        this.budget = (double)(rnd.nextInt(20000)+5000)/10;
        this.dailyBudgetGrowth = this.budget/22;
    }

    public double getBudget() {
        return this.budget;
    }

    public void addChild(IPerson child){
        children.add(child);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                '}';
    }
}
