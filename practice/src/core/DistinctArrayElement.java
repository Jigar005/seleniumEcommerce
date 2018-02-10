package core;

public class DistinctArrayElement {
//	public static void delement (int[] intArray )
//	{
//		for (int i =0; i <intArray.length; i++)
//		{
//			for (int j = 0; j<i; j++)
//			{
//				intArray[i]==int
//			}
//		}
//	}
	public static void main(String[] args) {
		
		int[] numbers = {1,5,2,5};
		char[] character = {'c','d','c','a','c','p','c','a','c',};
		
		for(int i =0; i<numbers.length; i++)
		{
			boolean isDisticnt = false;
			for (int j = 0; j < i ; j++)
			{
				if (numbers[i]==numbers[j])
				{
					isDisticnt =true;
					break;
					
				}
			}
		if (!isDisticnt)
		{
			System.out.println(numbers[i]);
		}
		
		}

		
		

	}

}
