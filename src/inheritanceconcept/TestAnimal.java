package inheritanceconcept;

public class TestAnimal {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.eat();
		d.sleep();
		d.giveBirth();
		d.bark();
		d.species = "germen shaperd";
		d.age = 2;

		System.out.println("the species and age is " + d.species + " " + d.age);
		d.furColor = "balck";
		d.breed = "breed";

		System.out.println("the furcolor and breed is " + d.furColor + " " + d.breed);
		System.out.println("------------------------------------------------------------- ");

		Eagle e = new Eagle();
		e.eat();
		e.sleep();
		e.fly();
		e.hunt();
		e.species = "Egale";
		e.age = 1;

		System.out.println("the species and age is " + e.species + " " + e.age);

		e.wingSpan = 1.45;
		e.nestLocation = "tree";

		System.out.println("the wingspan and nestlocation is " + e.wingSpan + " " + e.nestLocation);
		System.out.println("------------------------------------------------------------- ");

		Reptile r = new Reptile();
		r.eat();
		r.sleep();
		r.crawl();
		r.species = "snake";
		r.age = 1;
		r.scalePattern = "ZigZag";

		System.out.println("The species, age and scalepattteren " + r.species + " " + r.age + " " + r.scalePattern);
		System.out.println("------------------------------------------------------------- ");

		Animal a = new Animal();
		a.eat();
		a.sleep();

		System.out.println("------------------------------------------------------------- ");

		Mammal m1 = new Dog();
		m1.eat();
		m1.sleep();
		m1.giveBirth();

		System.out.println("------------------------------------------------------------- ");

		Bird b1 = new Eagle();
		b1.eat();
		b1.sleep();
		b1.fly();

		System.out.println("------------------------------------------------------------- ");

	}

}
