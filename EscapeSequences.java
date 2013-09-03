//This program was written to demonstrate 
//how escape sequences can be used in code.
public class EscapeSequences
{
	public static void main (String[] args)
	{
		 System.out.print( "\t    _____\n\t   /     |\n\t   JJJJJ |" );
		 System.out.println( "  ______   __     __  ______" );
		 System.out.println( "\t      JJ | /      \\ /  \\   /  |/      \\" );
		 System.out.println( "\t __   JJ | aaaaaa  |\"\"  \\ /\"\"/ aaaaaa  |" );
		 System.out.println( "\t/  |  JJ | /    aa | \"\"  /\"\"/  /    aa |" );
		 System.out.println( "\tJJ \\__JJ |/aaaaaaa |  \"\" \"\"/  /aaaaaaa |" );
		 System.out.println( "\tJJ    JJ/ aa    aa |   \"\"\"/   aa    aa |" );
		 System.out.println( "\t JJJJJJ/   aaaaaaa/     \"/     aaaaaaa/" );


	}
}

//Java's escape character is a backlash.  All escape sequences in Java must be
//in a set of quotes.
// \t is a tab; it is the same as if you pressed the Tab key while typing
//When you're reading someone else's code, a \t inside the quotes is less ambiguous than
//a bunch of blank spaces
// \n is a newline.  When printing it will case the output to move down
//to the beginning of the next line before printing
//  \\ is how you display a backslash 