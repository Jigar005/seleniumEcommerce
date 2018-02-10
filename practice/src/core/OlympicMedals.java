package core;

import java.util.*;
/*Author: Jigar This is a example of treeset using my comparator interface in order to
 * apply customized sorting order. 1) Ascending String 2) Ascending Numerical. 
 */

class CountryMedals {
	String countryName;
	int MedalType;
	

	CountryMedals(String countryName, int g, int s, int b) {
		this.countryName = countryName;
		this.MedalType = (g*3)+(s*2)+(b*1);
	}

	public String toString() {
		return " " + countryName + "  " + MedalType;
	}

}

// class SortingMedalWise implements Comparator<CountryMedals> {
// public int compare(CountryMedals p1, CountryMedals p2) {
// String s1 = p1.MedalType;
// String s2 = p2.MedalType;
// if (((s1.contains("Gold") && s2.contains("Silver"))) ||
// ((s1.contains("Silver") && s2.contains("Browns")))) {
// return -1;
// } else if (((s1.contains("Silver") && s2.contains("Gold")))
// || ((s1.contains("Browns") && s2.contains("Silver")))) {
// return +1;
// } else if ((s1.contains("Gold")) && s2.contains("Browns")) {
// return -1;
// }
// // else if ((s1.contains("Browns"))&& s2.contains("Gold"))
// // {return -1;}
// else
// return +1;
//
// }
// }

class EcompNu12 implements Comparator<CountryMedals> {
	public int compare(CountryMedals p1, CountryMedals p2) {
		int n1 = p1.MedalType;
		int n2 = p2.MedalType;
		if (n1 == n2) {
			return 0;
		} else if (n1 < n2) {
			return +1;
		} else {
			return -1;
		}

	}
}

public class OlympicMedals {
	public static void main(String[] args) {
		TreeSet<CountryMedals> sst = new TreeSet<CountryMedals>(new EcompNu12());
		// sst.add(new CountryMedals("Usa", "Gold"));
		// sst.add(new CountryMedals("India", "Gold"));
		// sst.add(new CountryMedals("China", "Silver"));
		// sst.add(new CountryMedals("Canada", "Browns"));
		// sst.add(new CountryMedals("Mexico", "Gold"));
		// sst.add(new CountryMedals("Afganistan", "Browns"));
		// sst.add(new CountryMedals("Africa", "Browns"));
		// sst.add(new CountryMedals("Shrilanka", "Silver"));
		// sst.add(new CountryMedals("Nepal", "Gold"));
		// sst.add(new CountryMedals("England", "Silver"));
		sst.add(new CountryMedals("India", 2, 5, 3));
		sst.add(new CountryMedals("China", 2, 3, 3));
		sst.add(new CountryMedals("Ooob", 2, 2, 3));
		sst.add(new CountryMedals("KKv", 2, 1, 3));
		
		System.out.println(sst);
	}

}
