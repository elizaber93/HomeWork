package HW8.dto;

public class Person implements IPerson{
    private final String firstName;   //Имя
    private final String patronymic;  //Отчество
    private final String lastName;    //Фамилия
    private final String fullName;    //ФИО полностью

    public Person(String fullName) {
        this.fullName = fullName;
        this.lastName = fullName.substring(0,fullName.indexOf(" "));
        fullName = fullName.substring(fullName.indexOf(" ")+1);
        this.firstName = fullName.substring(0,fullName.indexOf(" "));
        fullName = fullName.substring(fullName.indexOf(" ")+1);
        this.patronymic = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName +
                '}';
    }
}
