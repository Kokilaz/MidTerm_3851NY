package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> countries = new LinkedList<>();

		countries.add("India");

		countries.add("France");

		countries.add("USA");

		countries.add("Canada");

		System.out.println("peek : "+countries.peek());

		System.out.println("remove : "+countries.remove());

		System.out.println("poll : "+countries.poll());

		for(String x : countries ){

			System.out.println("for loop : "+x);

		}

		Iterator it = countries.iterator();

		while(it.hasNext()){

			System.out.println("Iterator : "+it.next());

		}

	}

	}


