import java.util.Scanner;

public class JavaIf11{
	public static void main (String []args)
	{
        int day;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a day number: ");
		day = keyboard.nextInt();

		if(day == 1)
		{
			System.out.println("Monday");
		}
		if(day == 2)
		{
			System.out.println("Tuesday");
		}
		if(day == 3)
		{
			System.out.println("Wednesday");
		}
		if(day == 4)
		{
			System.out.println("Thursday");
		}
		if(day == 5)
		{
			System.out.println("Friday");
		}
		if(day == 6)
		{
			System.out.println("Saturday");
		}
		if(day == 7)
		{
			System.out.println("Sunday");
		}
		if(day == 1)
		{
			System.out.println("Monday");
		}
		if(day <= 0)
		{
			System.out.println("That's not a valid day number!");
		}
		if(day > 7)
		{
			System.out.println("That's not a valid day number!");
		}




	}
}


