package com.umldiagram.allergy;

import java.util.HashMap;
import java.util.Map;

public class Login {
	
	private static String showHashValue() {
		Map<String, String> committer = new HashMap<>();
		committer.put("Restapi", "kdaud");
		committer.put("QaTester", "k-joseph");
		committer.put(null, "dkayiwa");
		committer.put("microfrontend", null);
		//committer.put("Microfrontend", "potma");
		//committer.put("Restapi", "schukal");
		
		System.out.println(committer.get("Microfrontend"));
		
		return null;
	}
	
	public static void main(String[] args) {
		showHashValue();
	}
	
}
