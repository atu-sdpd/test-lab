import java.util.Scanner;

public class JavaScanner8 {
	public static void main(String[] args)
	{

			//Create instance of Scanner object
			Scanner keyboard = new Scanner(System.in);

			//Declare a string variable called name
			String name;

			//Prompt the user to enter their name
			System.out.print("Please enter your name: ");

			//Store what is typed to the variable created in line 11
			name = keyboard.nextLine();

			//Output to the console displaying greeting
			System.out.println("Greetings, " + name + "! ");
	}
}



