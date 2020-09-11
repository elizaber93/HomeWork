package HW8.dto;

public enum Category {
    BEGINNER("Начинающий специалист",1),
    FIRST("Преподаватель 1-й категории",2),
    SECOND("Преподаватель 2-й категории",3),
    HIGHER("Преподаватель высшей категории",4);

    String rus;
    int index;
    Category(String rus, int index) {
        this.rus = rus;
        this.index = index;
    }

    public String getRus() {
        return rus;
    }

    public int getIndex() {
        return index;
    }
}
