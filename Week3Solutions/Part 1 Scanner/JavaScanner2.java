//Name:
//Description:

import java.util.Scanner;

public class JavaScanner2 {
	public static void main(String[] args){

			//Create instance of Scanner object
			Scanner keyboard = new Scanner(System.in);

			int num1, num2, num3, num4;
			
			System.out.print("Enter first number: ");
			num1 = keyboard.nextInt();
			System.out.print("Enter second number: ");
			num2 = keyboard.nextInt();
			System.out.print("Enter third number: ");
			num3 = keyboard.nextInt();
			System.out.println("Hi");

			//Output to the console displaying variable values
			System.out.println("First number entered was: " + num1);
			System.out.println("Second number entered was: " + num2);
			System.out.println("Third number entered was: " + num3);

		}
}

