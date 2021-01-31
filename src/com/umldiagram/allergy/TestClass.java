/**
 * 
 */
package com.umldiagram.allergy;


/**
 * @author opensource
 *
 */
public class TestClass {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Commiter obj = new Commiter();
		obj.myCall();
		System.out.println("Alllergy Returns: " + obj.OPENMRS_UUID);
		new Obj() {
			
			@Override
			public String patientDept() {
				System.out.println("Hello Committer from QA Team Squard");
				return "q";
			}
		}.patientDept();

	}
	
}
