package task1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PersonProvider {

    public Set<Person> getPersons(int qty) {
        Set<Person> result = new HashSet<>();
        while (result.size() != qty) {
            Person person = getPerson();
            result.add(person);
        }
        return result;
    }


    private Person getPerson() {
        return new Person(new Name(), new BirthDate());
    }


}
