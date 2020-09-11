package HW8.dto;

public class Subject {
    private String name;
    private Teacher teacher;

    public Subject(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
