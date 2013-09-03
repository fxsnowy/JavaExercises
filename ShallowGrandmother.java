//Exercise 14: Compound Boolean Expressions
//We want to use logic more complicated than just less than or equal to.
//Imagine a grandmother who will only approve you dating her grandchild
//if you are older than 25 and younger than 40 and either rich or really 
//good looking.

import java.util.Scanner;

public class ShallowGrandmother
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		double income, attractiveness;
		boolean allowed;

		System.out.print ("Enter your age: ");
		age = keyboard.nextInt();

		System.out.print("Enter your yearly income: ");
		income = keyboard.nextDouble();

		System.out.print("How attractive are you, on a scale from 0.0 to 10.0? " );
		attractiveness = keyboard.nextDouble();

		allowed = (age > 25 && age < 40 && (income > 50000 || attractiveness >= 8.5) );

		System.out.print("You are allowed to date my grandchild: " + allowed);
	}
}