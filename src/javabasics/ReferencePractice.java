package javabasics;

public class ReferencePractice {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		ReferencePractice r1 = new ReferencePractice();
		r1.name = "Maria";
		r1.age = 30;
		r1.city = "Missisauga";

		ReferencePractice r2 = new ReferencePractice();
		r2.name = "Paul";
		r2.age = 40;
		r2.city = "New York";

		ReferencePractice r3 = new ReferencePractice();
		r3.name = "Julie";
		r3.age = 20;
		r3.city = "Paris";

		System.out.println(r1.name + " " + r1.age + " " + r1.city);
		System.out.println(r2.name + " " + r2.age + " " + r2.city);
		System.out.println(r3.name + " " + r3.age + " " + r3.city);
		System.out.println("------------------------------------");

		r1 = r2 = r3;
		System.out.println(r1.name + " " + r1.age + " " + r1.city);
		System.out.println(r2.name + " " + r2.age + " " + r2.city);
		System.out.println(r3.name + " " + r3.age + " " + r3.city);

	}

}
