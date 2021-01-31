/**
 * 
 */
package com.mypackage.tree;


/**
 * @author opensource
 *
 */
public class FrameTest {
	
	/**
	 * @param args
	 */
	private static String gherkin(double x, double y) {
	Double res=(double)Math.round(x*y);
		return "He will pay: " + res;
	}
	public static void main(String[] args) {
		Appframe appframe = new Appframe();
		appframe.dotolist();
		//for (Object cc : appframe) {
		System.out.println(gherkin(2789365, 0.0178));
			
		
	}
	
}
