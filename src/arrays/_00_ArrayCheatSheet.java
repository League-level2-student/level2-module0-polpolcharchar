package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String strings[] = {"hi", "hello", "hey", "howdy", "you"};
		//2. print the third element in the array
		System.out.println(strings[2]);
		//3. set the third element to a different value
		strings[2] = "HELLO";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		//6. make an array of 50 integers
		Random r = new Random();
		int int50[] = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i<int50.length; i++) {
			int50[i] = r.nextInt(101);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = 101;
		int largest = 0;
		for(int i = 0; i<int50.length; i++) {
			if(int50[i]<smallest) {
				smallest = int50[i];
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i<int50.length; i++) {
			System.out.println(int50[i]);
		}
		//10. print the largest number in the array.
		for(int i = 0; i<int50.length; i++) {
			if(int50[i]>largest) {
				largest = int50[i];
			}
		}
		System.out.println(largest);
	}
}
