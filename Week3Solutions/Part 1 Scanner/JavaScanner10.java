import java.util.Scanner;

public class JavaScanner10 {
	public static void main(String[] args)
	{

			//Create instance of Scanner object
			Scanner keyboard = new Scanner(System.in);

			//Declare a string variable called name
			String name;
			int yob;

			//Prompt the user to enter their name
			System.out.print("Please enter your name: ");

			//Store what is typed to the variable created in line 11
			name = keyboard.nextLine();

			//Prompt the user to enter their name
			System.out.print("Please enter your year of birth: ");

			//Store what is typed to the variable created in line 11
			yob = keyboard.nextInt();

			//Output to the console displaying greeting
			System.out.println("Greetings, " + name + "! ");
			System.out.println("You were born in " + yob + " and therefore you are " + (2021 - yob) + " years old.");
	}
}



