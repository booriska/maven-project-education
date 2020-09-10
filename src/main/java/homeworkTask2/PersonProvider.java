package homeworkTask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PersonProvider {
    List<String> listOfFirstNames = Arrays.asList("Artur", "Kate", "Max", "Kevin", "Mike", "Oscar", "Lucy", "Garrett", "Steve", "Grace");
    List<String> listOfLastNames = Arrays.asList("Grey", "Black", "Brown", "Jackson", "Stevenson", "Gibson", "Tyson", "Jameson", "Miller", "Jones");

    public int difference(int min, int max) {
        int diff = max - min;
        Random random = new Random();
        return min + random.nextInt(diff);
    }

    public Age getBirthDate() {
        int year = difference(1960, 2000);
        int month = difference(1, 12);
        int day;
        switch (month) {
            case 1:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    day = difference(1, 29);
                } else {
                    day = difference(1, 28);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = difference(1, 30);
                break;
            default:
                day = difference(1, 31);
                break;
        }
        return new Age(day, month, year);
    }

    public Person getPerson() {
        Random random = new Random();
        String firstName = listOfFirstNames.get(random.nextInt(listOfFirstNames.size()));
        String lastName = listOfLastNames.get(random.nextInt(listOfLastNames.size()));
        Name name = new Name(firstName, lastName);
        Age age = getBirthDate();
        return new Person(name, age);
    }

    public List <Person>  getPeople (int x)
    {
        ArrayList <Person> list = new ArrayList<>();
        for (int i = 0; i<x; i++)
        {
            list.add(getPerson());
        }
        return list;
    }
}
