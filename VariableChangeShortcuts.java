//This program is written to demonstrate how
//variables can be changed while the program runs.

public class VariableChangeShortcuts
{
	public static void main(String[] args)
	{
		int i, j, k;

		i = 5;
		j = 5;
		k = 5;

		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k);
		
		i = i + 3;
		j = j - 3;
		k = k * 3;

		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k);

		i = 5;
		j = 5; 
		k = 5;

		System.out.println("\ni: " + i + "\tj: " + j + "\tk: " + k);

		i += 3;
		j -= 3;
		k *= 3;

		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k);

		i = j = k = 5;

		System.out.println( "\ni: " + i + "\tj: " + j + "\tk: " + k);
		i += 1;
		j -= 2;
		k *= 3;
		System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k);

		i = j = k = 5;

		System.out.println ( "\ni: " + i + "\tj: " + j + "\tk: " + k);
		i =+ 1;
		j =- 2;

		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k);
		i = j = k = 5;

		System.out.println("\ni: " + i + "\tj: " + j + "\tk: " + k);
		i++;
		j--;
		System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k);



	}
}

//A shorcut can be used called "compound assignment operator"
// The i += 3 means the same as i = i + 3
//"Take the current value of i, add 3 to it, and store the results as the new value of i"
//Post-increment operator = i++ just means "add 1 to whatever is in i"
//Post-decrement opertator = subtract 1 from the value