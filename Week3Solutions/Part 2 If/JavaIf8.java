import java.util.Scanner;

public class JavaIf8{
	public static void main (String []args)
	{
        //Scanner keyboard = new Scanner(System.in);
        int num1;
        int num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first number: ");
		num1 = keyboard.nextInt();

        System.out.print("Enter second number: ");
		num2 = keyboard.nextInt();

		if(num1 > num2)
		{
			System.out.println("The first number, " + num1 + ", is greater than the second number, " + num2);
		}

		if(num1 < num2)
		{
			System.out.println("The second number, " + num2 + ", is greater than the first number, " + num1);
		}

		if(num1 == num2)
		{
			System.out.println("The numbers are the same!");
		}
	}
}


