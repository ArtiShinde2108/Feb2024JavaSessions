package javabasics;

public class CallByRef {

	String name;
	int age;
	double sal;

	public static void test(CallByRef c1) {

		System.out.println("Test Method");
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.sal);

		c1.name = "Sachin";
		c1.age = 45;

		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.sal);
	}

	public static void main(String[] args) {

		CallByRef obj = new CallByRef();

		obj.name = "Arti";
		obj.age = 35;
		obj.sal = 20.20;

		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.sal);

		CallByRef.test(obj);

	}

}
