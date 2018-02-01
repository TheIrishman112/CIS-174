package cis174;

import java.util.ArrayList;
import java.util.List;

public class objects {

	public static void main(String[] args) {
		List<User> roster = new ArrayList<User>();
		User u1 = new User(1, "Kyle", "OBrien", "Obrien2014@gmail.com");
		User u2 = new User(2, "John", "Jones", "Someemail@aol.com");
		User u3 = new User(3, "Adam", "Flowers", "Catsanddogs@gmail.com");
		User u4 = new User(4, "Andy", "Smith", "javaStuff@gmail.com");
		roster.add(u1);
		roster.add(u2);
		roster.add(u3);
		roster.add(u4);

		for (User u : roster) {
			
			System.out.println(u.id + " " + u.firstName + " " + u.lastName + " " + u.email);
		}

	}
}
