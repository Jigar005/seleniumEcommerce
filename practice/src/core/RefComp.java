package core;

public class RefComp {

	RefComp(String str)
	{
		
	}
	public static void main (String [] args)
	{
		//Inhere content is same but equals method does ref comparison, so result is false
		//Object class equals method used here
		RefComp mp1 = new RefComp("jigar");
		RefComp mp2 = new RefComp("jigar");
		System.out.println(mp1.equals(mp2));
		
		//Inhere String class over riding equals method used, so it will done content comparison, so its true
		String s1 = new String("Chandni");
		String s2 = new String("Chandni");
		System.out.println(s1.equals(s2));//true because content comparison
		System.out.println(s1==s2);//false because reference  comparison
		
		//Inhere StringBuffer class does not override equals method, so it will use object class equals method
		StringBuffer er = new StringBuffer("yashvi");
		StringBuffer er1 = new StringBuffer ("yahsvi");
		System.out.println(er.equals(er1));
		

		//Inhere String class over riding equals method used, so it will done content comparison, so its true
		// Different pre define methods of String class 
		String s3 = "Chandni";
		String s4 = "Jigs";
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s3.compareTo(s4));
		
		//conversion of String to SringBuffer
		
		String str1 = "Yashvi";
		StringBuffer ffr = new StringBuffer (str1);//declare a new StringBuffer and pass the variable of String to convert 
		System.out.println(ffr.reverse());//reverse method is only present in StringBuffer it means its converted to StringBuffer
		
		//conversion of StringBuffer to String 
		
		StringBuffer ffr1 = new StringBuffer("chachacha");
		String ssr1 = new String(ffr1);
		String ssr2 = ffr1.toString();//Here object of StringBuffer called toString method of StringBuffer class 
		//but as per method signature of toString its return only String so this way its convert to String from StringBuffer 
		System.out.println(ssr1);
		System.out.println(ssr2);
		
		
			
		
		
		
		
		
		
	
		
	}
}
