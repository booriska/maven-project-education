package task2;


import task1.BirthDate;
import task1.Name;
import task1.Person;

// TODO: 7/27/20 используй наследование от Person и не тащи что у тебя уже есть, доступ между пекеджами прекрасно работает
public class Secretary extends Employee {

    public Secretary(Name name, BirthDate birthDate, Skills skills) {
        super(name, birthDate, skills);
    }

    @Override
    public int getSkills() {
        return skills.getLevelOfSkills();
    }
}
