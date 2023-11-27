package Collectionarray;

public class generic_method {
	public static <E> void printArray(E[]elements)
	{
		for(E element : elements)
		{
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]intArray = {10,20,30,40,50};
		Character[]charArray= {'J','A','V','A','T','R','A','I'};
		System.out.println("Printing Integer array");
		printArray(intArray);
		System.out.println("Printing character array");
		printArray(charArray);

	}

}
