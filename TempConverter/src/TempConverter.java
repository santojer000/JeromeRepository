import java.text.DecimalFormat;
import java.util.Scanner;

public class TempConverter
{
	public static void main(String[] args)
	{
		// Variables
		double fah = 0;
		double cel = 0;
		String input = "";
		DecimalFormat decimal = new DecimalFormat("#,##0.00");
		
		System.out.println("Please enter a temperature ending in either F or C.");
		Scanner keyboard = new Scanner(System.in);
		input = keyboard.nextLine().toUpperCase();
		if (input.endsWith("C"))
		{
			cel = Integer.parseInt(input.replaceAll("C", ""));
			fah = celToFah(cel);
			System.out.println(decimal.format(cel) + "C is equivalent to " + decimal.format(fah) + "F.");
		}
		else if (input.endsWith("F"))
		{
			fah = Integer.parseInt(input.replaceAll("F", ""));
			cel = fahToCel(fah);
			System.out.println(decimal.format(fah) + "F is equivalent to " + decimal.format(cel) + "C.");
		}	// End if
	}	// End main

	public static double celToFah(double cel)
	{
		// variable
		double fah = 0.0;
		// Conversion formula from celsius to fahrenheit
		fah = ((cel * 9) / 5) + 32;
		return fah;
	}	// End method
	
	public static double fahToCel(double fah)
	{
		// Variable
		double cel = 0.0;
		// Conversion formula from fahrenheit to celsius
		cel = ((fah - 32) * 5) / 9;
		return cel;
	}	// End method
}	// End Program
