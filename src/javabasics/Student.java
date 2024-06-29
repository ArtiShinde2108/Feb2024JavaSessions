package javabasics;

public class Student {

	String name;
	int age;

	public static void main(String[] args) {

		int totalstudents = 0;

		Student s1 = new Student();
		s1.name = "Smith";
		s1.age = 18;
		totalstudents++;

		Student s2 = new Student();
		s2.name = "John";
		s2.age = 19;
		totalstudents++;

		System.out.println(s1.name + " " + s1.age + " " + totalstudents);
		System.out.println(s2.name + " " + s2.age + " " + totalstudents);

		s1.age = 20;
		System.out.println("The modified age of the student 1 is " + s1.age);

		Student s3 = new Student();
		s3.name = "Merry";
		s3.age = 21;
		totalstudents++;

		System.out.println("The modified count of the students is " + totalstudents);

		System.out.println(s3.name + " " + s3.age + " " + totalstudents);

	}

}
