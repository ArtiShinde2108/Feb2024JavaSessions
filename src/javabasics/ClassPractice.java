package javabasics;

public class ClassPractice {

	String name;
	int age;
	double salary;
	boolean isPer;

	public static void main(String[] args) {

		ClassPractice c1 = new ClassPractice();

		c1.name = "Arti";
		c1.age = 35;
		c1.salary = 30.15;
		c1.isPer = true;

		ClassPractice c2 = new ClassPractice();

		c2.name = "Chris";
		c2.age = 30;
		c2.salary = 10.15;
		c2.isPer = false;

		ClassPractice c3 = new ClassPractice();

		c3.name = "Sachin";
		c3.age = 40;
		c3.salary = 25.50;
		c3.isPer = true;

		ClassPractice c4 = new ClassPractice();

		c4.name = "Mrunal";
		c4.age = 38;
		c4.salary = 29.50;
		c4.isPer = false;

		System.out.println(c1.name + " " + c1.age + " " + c1.salary + " " + c1.isPer);
		System.out.println(c2.name + " " + c2.age + " " + c2.salary + " " + c2.isPer);
		System.out.println(c3.name + " " + c3.age + " " + c3.salary + " " + c3.isPer);
		System.out.println(c4.name + " " + c4.age + " " + c4.salary + " " + c4.isPer);

		System.out.println("----------------------------------------");

		c1 = c2;

		System.out.println(c1.name + " " + c1.age + " " + c1.salary + " " + c1.isPer);
		System.out.println(c2.name + " " + c2.age + " " + c2.salary + " " + c2.isPer);
		System.out.println(c3.name + " " + c3.age + " " + c3.salary + " " + c3.isPer);
		System.out.println(c4.name + " " + c4.age + " " + c4.salary + " " + c4.isPer);

		System.out.println("----------------------------------------");

		c2 = c3;

		System.out.println(c1.name + " " + c1.age + " " + c1.salary + " " + c1.isPer);
		System.out.println(c2.name + " " + c2.age + " " + c2.salary + " " + c2.isPer);
		System.out.println(c3.name + " " + c3.age + " " + c3.salary + " " + c3.isPer);
		System.out.println(c4.name + " " + c4.age + " " + c4.salary + " " + c4.isPer);

		System.out.println("----------------------------------------");

		c3 = c4;

		System.out.println(c1.name + " " + c1.age + " " + c1.salary + " " + c1.isPer);
		System.out.println(c2.name + " " + c2.age + " " + c2.salary + " " + c2.isPer);
		System.out.println(c3.name + " " + c3.age + " " + c3.salary + " " + c3.isPer);
		System.out.println(c4.name + " " + c4.age + " " + c4.salary + " " + c4.isPer);

		System.out.println("----------------------------------------");

		c4 = c1;

		System.out.println(c1.name + " " + c1.age + " " + c1.salary + " " + c1.isPer);
		System.out.println(c2.name + " " + c2.age + " " + c2.salary + " " + c2.isPer);
		System.out.println(c3.name + " " + c3.age + " " + c3.salary + " " + c3.isPer);
		System.out.println(c4.name + " " + c4.age + " " + c4.salary + " " + c4.isPer);

	}

}
