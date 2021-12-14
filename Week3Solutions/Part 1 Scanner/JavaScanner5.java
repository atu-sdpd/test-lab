//Name:
//Description:

import java.util.Scanner;

public class JavaScanner5 {
	public static void main(String[] args){

			//Create instance of Scanner object
			Scanner keyboard = new Scanner(System.in);

			int num1;
			double num2;

			System.out.print("Enter integer number: ");
			num1 = keyboard.nextInt();
			System.out.print("Enter decimal point number: ");
			num2 = keyboard.nextDouble();

			//Output to the console displaying variable values
			System.out.println(" - - - - - - - - - - - - - - - - - - ");
			System.out.println("First number entered was: " + num1);
			System.out.println("Second number entered was: " + num2);
			System.out.println(" - - - - - - - - - - - - - - - - - - ");
			System.out.println("Sum of numbers: " + (num1 + num2));
			System.out.println("Average of numbers: " + (num1 + num2)/2);


		}
}

