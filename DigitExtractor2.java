import java.text.DecimalFormat;
import java.util.Scanner;

public class DigitExtractor2
{
	public static void main(String[] args)
	{
		// Variables
		int number = 0;
		DecimalFormat numFormat = new DecimalFormat("#,###,##0");
		
		// Prompt the user to enter an Integer
		System.out.print("Please enter an Integer: ");
		// Take the next input
		Scanner keyboard = new Scanner(System.in);
		// Store it into an integer variable
		number = keyboard.nextInt();
		System.out.println("The Integer " + numFormat.format(number) + " consists of the digits");
		digitExtract(number);
	}
	
	// JAVADOCS!!!
	public static void digitExtract(int number)
	{
		if (number >= 10)
		{
			digitExtract(number / 10);
		}
		System.out.println(number % 10);
	}	// End method
}	// End program