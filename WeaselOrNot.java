//You can't use < to see if a word comes before another word in Java
//This program is going to demonstrate how to compare Strings for equality

import java.util.Scanner;

public class WeaselOrNot
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String word;
		boolean yep, nope;

		System.out.println("Type the word \"weasel\", please.");
		word = keyboard.next();

		yep = "weasel".equals(word);
		nope = ! word.equals("weasel");

		System.out.println("You typed what was requested: " + yep);
		System.out.println("You ignored polite instructions: " + nope);
	}
}

//Strings have a built-in method named .equals() that compares itself
//to another String, simplifying to the value true if they are equals
//and false if the values aren't equal.