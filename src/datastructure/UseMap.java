package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> Icity = new ArrayList<String>();
		Icity.add("Delhi");
		Icity.add("Mumbai");
		Icity.add("Kerala");

		List<String> Acity = new ArrayList<String>();
		Acity.add("Brisbane");
		Acity.add("Sydney");
		Acity.add("Melbourne");

		List<String> UScity = new ArrayList<String>();
		UScity.add("Texas");
		UScity.add("NewYork");
		UScity.add("California");

		Map<String,List<String>> listofCities= new HashMap<String,List<String>>();
		listofCities.put("cities of India", Icity);
		listofCities.put("cities of Australia", Acity);
		listofCities.put("States of USA", UScity);

		Iterator it=listofCities.entrySet().iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}
		for(Map.Entry<String,List<String>> cityInfo:listofCities.entrySet()){
		//for (Map.Entry key: listofCities.entrySet()){
			System.out.println("Cities of different countries: "+cityInfo.getKey()+"--->"+cityInfo.getValue());
		}



	}

}
