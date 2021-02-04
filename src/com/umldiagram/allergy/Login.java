package com.umldiagram.allergy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Login {
	
	private static String showHashValue() {
		Map<String, String> committer = new HashMap<>();
		committer.put("Restapi", "kdaud");
		committer.put("QaTester", "k-joseph");
		committer.put(null, "dkayiwa");
		committer.put("microfrontend", null);
		//committer.remove(null);
		int xx=committer.size();
		System.out.println("Capacity: " + xx);
		//committer.put("Microfrontend", "potma");
		//committer.put("Restapi", "schukal");
		
		System.out.println(committer.get("Microfrontends"));
		
		for (String ss : committer.keySet()) {
			System.out.println(ss + " " + committer.get(ss));
			
		}
		System.out.println("**********************");
		
		committer.forEach((K, V) -> System.out.println((K + " +=+ " + V)));
		
		Iterator<String>iterator=committer.keySet().iterator();
		while (iterator.hasNext()) {
			String key =  iterator.next();
			String value = committer.get(key);
			System.out.println(key + " |* " + value);
			
		}
		System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$\n");
		Iterator<Entry<String, String>> itvalue = committer.entrySet().iterator();
		while (itvalue.hasNext()) {
			Entry<String, String> keyEntry = itvalue.next();
			System.out.println(keyEntry.getKey() + " *** " + keyEntry.getValue());
		}
		return null;
	}
	
	//@Given("A use registers a patient")
	public static void main(String[] args) {
		//showHashValue();
		collectionutils();
	}
	
	protected static String collectionutils() {
		HashMap<Integer, String> patient1 = new HashMap<>();
		patient1.put(10, "Malaria");
		patient1.put(11, "Cough");
		patient1.put(12, "Aids");
		patient1.put(13, "CoronaVirus");
		
		HashMap<Integer, String> patient2 = new HashMap<>();
		patient2.put(10, "Malaria");
		patient2.put(11, "Cough");
		patient2.put(12, "Aids");
		patient2.put(13, "CoronaVirus");
		
		HashMap<Integer, String> patient3 = new HashMap<>();
		patient3.put(10, "Malaria");
		patient3.put(11, "Cough");
		patient3.put(12, "Aids");
		patient3.put(13, "CoronaVirus");
		patient3.put(14, "Typhoid");
		
		HashSet<Integer>combinedKey=new HashSet<>(patient1.keySet());
		combinedKey.addAll(patient3.keySet());
		combinedKey.removeAll(patient1.keySet());
		
		System.out.println("The Left Key: " + combinedKey);
		
		System.out.println(patient1.equals(patient2));
		System.out.println(patient1.keySet().equals(patient3.keySet()));
		
		return null;
	}
	
}
