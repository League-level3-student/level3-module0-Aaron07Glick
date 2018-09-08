package _03_More_Array_Fun;

import java.util.Random;

import javax.swing.JOptionPane;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] words = new String[5];
		words[0] = "hello";
		words[1] = "goodbye";
		words[2] = "yellow";
		words[3] = "seven";
		words[4] = "english";
		print(words);
		printReverse(words);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void print(String[] multiWord) {
		System.out.println(multiWord);
		
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void printReverse(String[] ReverseWord) {
		for (int i = ReverseWord.length-1; i > -1; i--) {
			System.out.println(ReverseWord[i]);
		}
		
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printOther(String[] OtherWord) {
		for (int i = 0; i < OtherWord.length; i+=2) {
			System.out.println(i);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
}
