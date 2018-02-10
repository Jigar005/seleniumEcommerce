package core;

import java.util.HashMap;
import java.util.Map;

public class FindAnyNumberFromArray{

	public static void find_not_repeted_no(int[] arr) {

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				int val = hm.get(arr[i]);
				hm.remove(arr[i], val);
				hm.put(arr[i], (val + 1));
			} else {
				hm.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 1, 2, 3, 1, 4, 5, 6, 7, 8, 2 };
		find_not_repeted_no(arr);

	}
}
