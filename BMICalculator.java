//This program is written to calculate
//Body Mass Index and almost more practice
//on implementing user input.
import java.util.Scanner;
public class BMICalculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double lb, in, ft, m, kg, bmi;
		//The program will take input in feet and pounds.

		System.out.print("Your height? (feet only): ");
		ft = keyboard.nextDouble();
		
		System.out.print("Your height? (inches)");
		in = keyboard.nextDouble();

		System.out.print("Your weight in pounds: ");
		lb = keyboard.nextDouble();
		
		//The following code converts feet/in and pounds into
		//meters and kilograms respectively to calculate BMI
		//without the user having to convert the numbers themselves.
		// A foot is equal to 0.3048 meters and an inch is equal to 0.0254 meters
		// A pound is equal to 0.453592 kilograms.

		m = (ft * 0.3048) + (in * 0.0254);

		kg = (lb * 0.453592);

		bmi = kg / (m * m);

		System.out.println("Your BMI is " + bmi + ".");
	}
}
