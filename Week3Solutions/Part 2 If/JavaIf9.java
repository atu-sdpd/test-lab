import java.util.Scanner;

public class JavaIf9{
	public static void main (String []args)
	{
        //Scanner keyboard = new Scanner(System.in);
        int num1;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number: ");
		num1 = keyboard.nextInt();

		if(num1 % 2 == 0)
		{
			System.out.println("The number entered is even");
		}

		if(num1 % 2 == 1)
		{
			System.out.println("The number entered is odd");
		}

	}
}


