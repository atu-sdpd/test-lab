import java.util.Scanner;

public class JavaScanner11 {
	public static void main(String[] args){

			//Create instance of Scanner object
			Scanner keyboard = new Scanner(System.in);

			int id;
			double salary;
			String name;
			String name2;
			double PRSI, takeHome,rate;

			System.out.print("\nEnter first name: ");
			name = keyboard.nextLine();

			System.out.print("Enter surname: ");
			name2 = keyboard.nextLine();

			System.out.print("Enter employee ID: ");
			id = keyboard.nextInt();
			System.out.print("Enter Salary: ");
			salary = keyboard.nextDouble();
			System.out.print("Enter current tax rate: ");
			rate = keyboard.nextDouble();



			PRSI = salary * rate/100;
			takeHome = salary - PRSI;

			System.out.println("\n|--------------------------------------|");
			System.out.println("| PAYSLIP				   ");
			System.out.println("|--------------------------------------|");
			System.out.println("| EMPLOYEE: " + name + " " + name2);
			System.out.println("| ID: " + id + " ");
			System.out.println("|");
			System.out.println("| SALARY: " + salary);
			System.out.println("| PRSI: " + PRSI);
			System.out.println("| ANNUAL TAKE HOME: " + takeHome);
			System.out.println("| MONTHLY TAKE HOME: " + takeHome/12);
			System.out.println("|--------------------------------------|");

		}
}

