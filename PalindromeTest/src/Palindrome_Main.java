import java.util.Scanner;
import java.util.Stack;

public class Palindrome_Main
{
	public static void main(String[] args)
	{
		//Simple program to take in a string and print it out in reverse.
		//The program decides whether or not the word is a palindrome.
		
		//Variables
		String word = "";
		String reverseWord = "";
		char[] charArray;
		Stack<Character> charStack = new Stack<Character>();
		
		//Prompt the user to enter any word.
		System.out.print("Please enter a word: ");
		Scanner keyboard = new Scanner(System.in);
		
		word = keyboard.nextLine();
		charArray = word.toCharArray();
		
		for (int i = 0; i < charArray.length; i++)
		{
			charStack.push(charArray[i]);	//Push each character of the word onto the stack
		}	//End for-loop
		
		while (charStack.isEmpty() == false)
		{
			reverseWord += charStack.pop();	//Concatenate each character (in reverse) to reverseWord
		}	//End while-loop
		
		System.out.println("Word in reverse: " + reverseWord);
		
		//Compare the original word with the reverse word to determine if the word is a palindrome
		if (word.equalsIgnoreCase(reverseWord))	// Check to see if the strings are equal
		{
			System.out.println("The word \"" + word + "\" IS a palindrome!");
		}
		else
		{
			System.out.println("The word \"" + word + "\" is NOT a palindrome.");
		}	//End if-else
		
		keyboard.close();
		
	}	//End of main method
}	//End of program