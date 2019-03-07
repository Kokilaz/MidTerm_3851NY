package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> phk = new ArrayList<String>();

		phk.add("Preethi");
		phk.add("Hrithik");
		phk.add("Salman");
		phk.add("ShahRukh");
		phk.add("Deepika");
		phk.add("Kajol");

		System.out.println("Original ArrayList:");
		for (String str : phk)
			System.out.println(str);

		phk.add(0, "Akshay");
		phk.add(1, "Rani");

		System.out.println("ArrayList after add operation:");
		for (String str : phk)
			System.out.println(str);

		phk.remove("Salman");
		phk.remove("Hrithik");

		System.out.println("ArrayList after remove operation:");
		for (String str : phk)
			System.out.println(str);

		phk.remove(1);

		System.out.println("Final ArrayList:");
		for (String str : phk)
			System.out.println(str);
	}
}



