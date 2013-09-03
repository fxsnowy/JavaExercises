//This program demonstrates human interaction with the program.
import java.util.Scanner;

public class ForgetfulMachine
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What city is the capital of France?");
		keyboard.next();

		System.out.println("What is 6 multiplied by 7?");
		keyboard.nextInt();

		System.out.println( " What is your favorite number between 0.0 and 1.0?");
		keyboard.nextDouble();

		System.out.println("Is there anything else you would like to tell me?");
		keyboard.next();

	}
}
//The library we import is the scanner library.
//This library contains functionality that allows us to read in information
//from the keyboard or other places like files or the Internet
//We created a "scanner object" named keyboard that contains a method.
//keyboard.next and keyboard.nextInt waits for the human to type in a string or value
//that the program will store.
//library or module - a chunk of code that adds extra functionality to
//a program and which may or may not be included


