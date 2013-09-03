//This program has a logical error in import in it
// to demonstrate an error in the flow of instructions
// (it will compile, but not do what was intended)

import java.util.Scanner;

public class Sequencing
{
	public static void main (String[] args)
	{
		//BROKEN

		Scanner keyboard = new Scanner(System.in);
		double price, salesTax, total;

		System.out.print("How much is the purchase price?");
		price = keyboard.nextDouble();

        salesTax = price * 0.0825;
        total = price + salesTax;

		System.out.println("Item price:\t" + price);
		System.out.println("Sales tax:\t" + salesTax);
		System.out.println("Total cost:\t" + total);

	}

}

//Variables cannot hold formulas, only values.  
//When you declare and initialize a variable at the same time, 
//that is called "defining" the variable.  
//So on line 20, the value the human types does not initialize price
//Price already has the value of 0 and it is replaced with 7.99
//The lines prior to this, use the old value of price to calculate values
//for salesTax and total.