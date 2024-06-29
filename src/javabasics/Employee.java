package javabasics;

public class Employee {

	String name;
	int age;
	double salary;

	public static void main(String[] args) {

		double totalSalary;

		Employee e1 = new Employee();
		e1.name = "Suresh";
		e1.age = 32;
		e1.salary = 34.88;

		Employee e2 = new Employee();
		e2.name = "Vilas";
		e2.age = 35;
		e2.salary = 20.99;

		Employee e3 = new Employee();
		e3.name = "Abdur";
		e3.age = 31;
		e3.salary = 25.90;

		totalSalary = (e1.salary + e2.salary + e3.salary);

		System.out.println(e1.name + " " + e1.age + " " + e1.salary);
		System.out.println(e2.name + " " + e2.age + " " + e2.salary);
		System.out.println(e3.name + " " + e3.age + " " + e3.salary);
		System.out.println("The total salary of all employees is " + totalSalary);

		Employee e4 = new Employee();
		e4.name = "Anay";
		e4.age = 28;
		e4.salary = 19.29;

		System.out.println(e4.name + " " + e4.age + " " + e4.salary);

		totalSalary = (e1.salary + e2.salary + e3.salary + e4.salary);
		System.out.println("The total salary of all employees is " + totalSalary);

	}

}
