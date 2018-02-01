package cis174;

public class loops {
	int count;
	/// Abstraction: Creating real objects with programmed attributes
	/// Encapsulation: separate code into many small reusable bits
	/// Inheritance: Objects can have levels of hierarchy, receiving attributes of those above
	/// Polymorphism: the ability to handle many different kinds of objects at the same time

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) { /// Prints a list of integers up to 10
			System.out.println("For Count: " + i);

		}
	}

	public void wloop() {
		int count = 1;
		while (count < 11) {
			System.out.println("While Count: " + count);
		}

	}

}
