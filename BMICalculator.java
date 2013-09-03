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

		System.out.print("Your height? (feet only): ");
		ft = keyboard.nextDouble();

		System.out.print("Your height? (inches)");
		in = keyboard.nextDouble();

		System.out.print("Your weight in pounds: ");
		lb = keyboard.nextDouble();

		m = (ft * 0.3048) + (in * 0.0254);

		kg = (lb * 0.453592);

		bmi = kg / (m * m);

		System.out.println("Your BMI is " + bmi + ".");
	}
}