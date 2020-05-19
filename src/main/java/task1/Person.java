package task1;

public class  Person {

    Name name;
    BirthDate birthDate;

    public Person(Object name, Object age) {
        this.name = (Name) name;
        this.birthDate = (BirthDate) age;
    }

    @Override
    public String toString() {
        return "firstName='" + name.firstName + '\'' +
                ", lastName='" + name.lastName + '\'' +
                ", age=" + birthDate.year + " " + birthDate.month + " " + birthDate.day + '\'';
    }


    public boolean isYounferThan(Person person) {
        return this.birthDate.toLocalDate().isAfter(person.birthDate.toLocalDate());
    }
}