//Name:
//Description:

import java.util.Scanner;

public class JavaScanner1 {
	public static void main(String[] args){

			//Create instance of Scanner object
			Scanner keyboard = new Scanner(System.in);

			int number1;

			System.out.print("Enter an integer: ");
			number1 = keyboard.nextInt();

			//Output to the console displaying number1 variable value
			System.out.println("Number input was: " + number1);
		}
}

