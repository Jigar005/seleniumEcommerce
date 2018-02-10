package core;

import java.util.HashMap;
import java.util.Map;

public class FindRepetedWord_HashMap {

	public static void main(String[] args) {
		String s = "House, Dog, House, Dog, House, Dog, Dog";
		String splitWords[] = s.split(", ");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i < splitWords.length; i++) {
			String word = splitWords[i];
			Integer oldCount = hm.get(word);
			

			if (oldCount == null) {
				oldCount = 0;
			}
			hm.put(word, oldCount + 1);
		
		}

		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 4) {// 4 means how many times word repeated 
				System.out.println(entry.getKey()+"  "+entry.getValue());
			}

		}

	}
}
