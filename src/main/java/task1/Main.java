package task1;



public class Main {

	public static void main(String[] args) {
		first();
		second();

	}

	public static void first(){
		Person person1 = new Person();
		Name name1 = new Name();
		name1.firstName = "Vasya";
		name1.lastName = "Petrov";
		person1.name = name1;

		Person person2 = new Person();
		Name name2 = new Name();
		name2.firstName = "Semen";
		name2.lastName = "Kozlov";
		person2.name = name2;

		Person person3 = new Person();
		Name name3 = new Name();
		name3.firstName = "Oleg";
		name3.lastName = "Oslov";
		person3.name = name3;






		System.out.println();
		// TODO: 1/26/20 ПЕРВЫЙ ЭТАП создать 5 разных человек и вывести имя старшего

	}

	public static void second(){
		// TODO: 1/26/20 ВТОРОЙ ЭТАП создать коллекцию имен и создавать людей в цикле, подставляя имена и возраст рандомно.

	}

}

class Name {

	String firstName;
	String lastName;

}

class BirthDate {

	int year;
	int month;
	int day;


}

class Person {
	public Person() {
		System.out.println("New person arrived!");
		System.out.println(this);
	}

	Name name;
	BirthDate birthDate;

}