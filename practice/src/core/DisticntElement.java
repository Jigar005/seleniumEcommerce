package core;

public class DisticntElement {
	public static void printDisticntElement(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			boolean isDisticnt = false;
			for (int j = 0; j < i; j++) {
				if (intArray[i] == intArray[j]) {
					isDisticnt = true;
					break;
				}
			}
			if (!isDisticnt) {
				System.out.println(intArray[i] + "  ");
			}
		}

	}

	public static void printDisticntCharElement(char[] character) {
		for (int i = 0; i < character.length; i++) {
			boolean isDisticnt = false;
			for (int j = 0; j < i; j++) {
				if (character[i] == character[j]) {
					isDisticnt = true;
					break;
				}
			}
			if (!isDisticnt) {
				System.out.println(character[i] + "  ");
			}
		}

	}

	public static void main(String[] args) {
		int[] numbers = { 1, 5, 2, 5, 6, 3, 6, 2, 5, 14, 5, 1, 2, 5, 2, 1, 5, 1, 2 };
		char[] character = { 'c', 'd', 'c', 'a', 'c', 'p', 'c', 'a', 'c', };

		printDisticntElement(numbers);
		printDisticntCharElement(character);

	}
}