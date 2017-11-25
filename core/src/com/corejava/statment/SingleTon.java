package com.corejava.statment;
/*Author Jigar Mehta 
 * Example of single ton class. all objects are pointing to same memory location
 * 
 */
public class SingleTon {

	public static void main(String[] args) {
		
		Sig s1 = Sig.getObject();
		Sig s2 = Sig.getObject();
		Sig s3 = Sig.getObject();
		Sig s4 = Sig.getObject();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
	
final static class Sig{
	
	private Sig(){}					// private constructor for restriction of object creation outside of class
	
	private static Sig s;			//private class type variable to store object and static so can access to static method
	
	public static Sig getObject()	//method to create one object, preventing 2nd object creation,
	{
		if (s == null)				// such attempt redirect to previous object.
		{
			return s = new Sig();
		}
		return (s);
	}
	
}

}
