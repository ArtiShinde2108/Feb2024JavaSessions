package constructorconcept;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee(123, "Ravi", 34.40);

		System.out.println(e1.id + "  " + e1.name + " " + e1.salary);

		e1.setId(234);
		e1.setName("Suraj");
		e1.setSalary(23.34);

		System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getSalary());

		e1.setSalary(23.34 + (23.34 * 0.10));
		System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getSalary());

	}

}