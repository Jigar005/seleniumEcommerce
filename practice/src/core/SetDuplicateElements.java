package core;

import java.util.HashSet;

public class SetDuplicateElements {
public static void main(String[] args) {
	int[] numbers= {1,2,2,3,3,4,5};

	
	HashSet<Integer> hashset= new HashSet<Integer>();
	for (int iteration : numbers)
	{
		if(!hashset.add(iteration))
				{
			
			System.out.println("Duplicate Elements are====>"+iteration);
				}
	}
	System.out.println("Not repeted Elements are====>"+hashset);
	
	HashSet<Integer> hashset1= new HashSet<Integer>();
	for (int iteration2 : numbers)
	{
	if(hashset1.add(iteration2))
	{
		System.out.println("Distinct Elements are===>"+iteration2);
	}
}
}
}
