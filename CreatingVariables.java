//Programs require interactivity.
//This needs several different concepts working together
//Variables: A name that refers to a location that holds a value
//1. Variable names can be more than one letter long
//2. Variables can hold more than just numbers; they hold words
//3. You have to choose what type of values the variable will hold when created
//4. The value of a variable (not its type) can change throughout the program.
// e.g: The variable "score" might start out with a value of 0 but end as 31000.

public class CreatingVariables
{
	public static void main(String[] args)
	{
		int x, y, age;
		double seconds, e, checking;
		String firstName, last_name, title;

		x = 10;
		y = 400;
		age = 22;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;

		firstName = "Yannick";
		last_name = "Daly";
		title = "Mr.";

		System.out.println("The variable x contains " + x);
		System.out.println("The value " + y + " is stored in the variable y.");
		System.out.println("The experiment completed in " + seconds + " seconds.");
		System.out.println("My favorite irrational number is Euler's constant: "+ e + ".");
		System.out.println("Hopefully your balance is more than $" + checking+ "!");
		System.out.println("My full name is " + title + " "+ firstName + " "+ last_name + ".");

	}
}
//int can hold a value between +- two billion.
//doubles - type of variable that can hold a number that has a fractional part
//string - duh
//declare - to tell the program the name (or "identifier") and type of a variable
//initialize - to give a variable its first (or "initial") value
