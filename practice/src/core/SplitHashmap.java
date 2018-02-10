package core;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SplitHashmap {
	public static void main(String[] args) {

		String animals = "dog, cat, dog, cat, dog, cat, dog, cat, dog";
		String[] splitword = animals.split(", " );
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for (int i = 0; i< splitword.length; i++)
		{
			String word = splitword[i];
			Integer count = hm.get(word);
			if (count == null)
			{count = 0;}
			hm.put(word, count+1);
		}
		for (Map.Entry<String, Integer> entry : hm.entrySet())
		{
			if (entry.getValue()==4)
			{
				System.out.println(entry);
			}
		}
	}
}