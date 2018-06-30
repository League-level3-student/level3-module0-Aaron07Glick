package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] words = new String[5];
		words[0] = "word1";
		words[1] = "word2";
		words[2] = "word3";
		words[3] = "word4";
		words[4] = "word5";
		//2. print the third element in the array
		System.out.println(words[2]);
		//3. set the third element to a different value
		words[2] = "not a word";
		//4. print the third element again
		System.out.println(words[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < 5; i++) {
			words[i] = "WORDS";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		//7. make an array of 50 integers
		int[] nums = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		Random num = new Random();
		
		for (int i = 0; i < 50; i++) {
			int rand = num.nextInt(50);
			nums[i] = rand;
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallest = nums[0];
		int largest = nums[0];
		for (int i = 0; i < 50; i++) {
			if (nums[i] < smallest) {
				smallest = nums[i];
			}
			
		}
		System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		//11. print the largest number in the array.
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
			}
		}
		System.out.println(largest);
		//12. print only the last element in the array
		int length = nums.length - 1;
		System.out.println(nums[length]);
	}
}
