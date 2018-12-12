package tutorials;

public class TutorialArray {

	public static void main(String[] args) {
		System.out.println("Index\tValue");
		int someArray[] = {34, 42, 56, 21, 3, 8};
		int sumOfArray = 0;
		int productOfArray = 1;
		
		for (int numberInArray = 0; numberInArray < someArray.length; numberInArray++) {
			
			//print index + value
			System.out.println(numberInArray + "\t" + someArray[numberInArray]);
			
			//make sum of array values
			sumOfArray += someArray[numberInArray];
			
			//make product of array values
			productOfArray *= someArray[numberInArray];
			
		}
		//print sum of array values
		System.out.println("Sum: " + sumOfArray);
		
		//print product of array values
		System.out.println("Product: " + productOfArray);
	}

}
