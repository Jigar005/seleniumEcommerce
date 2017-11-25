package jayAmbe;
import java.util.*;
public class Temp{
	
	void ageCheck(int age)throws PAgeException
{
	if (age>20){System.out.println("Welcome");}
	else{throw new PAgeException("AAPDI KAMMAALL JJOOIIEE");}}


class PAgeException extends RuntimeException
{
	PAgeException(String str)
	{super(str);}
}

public static void main (String[] args)throws PAgeException
{
	Scanner sss = new Scanner(System.in);
	System.out.println("ENTER YOUR AGE");
	int age = sss.nextInt();
	Temp titu = new Temp();
	titu.ageCheck(age);
	sss.close();
	
	
	
}

}

