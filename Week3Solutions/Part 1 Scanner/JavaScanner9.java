import java.util.Scanner;

public class JavaScanner9 {
	public static void main(String[] args)
	{

			//Create instance of Scanner object
			Scanner keyboard = new Scanner(System.in);

			//Declare a string variable called name
			String name;
			int age;

			//Prompt the user to enter their name
			System.out.print("Please enter your name: ");

			//Store what is typed to the variable created in line 11
			name = keyboard.nextLine();

			//Prompt the user to enter their name
			System.out.print("Please enter your age: ");

			//Store what is typed to the variable created in line 11
			age = keyboard.nextInt();

			//Output to the console displaying greeting
			System.out.println("Greetings, " + name + "! ");
			System.out.println("You are " + age + " years old.");
	}
}



