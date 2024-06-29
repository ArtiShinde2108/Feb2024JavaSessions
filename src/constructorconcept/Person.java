package constructorconcept;

public class Person {

	String name;
	int age;
	char gender;
	double height;

	public Person(String name, int age, char gender, double height) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public static void main(String[] args) {

		Person p1 = new Person("Arti", 40, 'F', 5.6);
		System.out.println(p1.name + " " + p1.age + " " + p1.gender + " " + p1.height);
		System.out.println("------------------------");

		Person p2 = new Person("Sarthak", 15, 'M', 5.6);
		System.out.println(p2.name + " " + p2.age + " " + p2.gender + " " + p2.height);

	}

}
