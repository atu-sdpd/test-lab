import java.util.Scanner;

public class JavaScanner6 {
	public static void main(String[] args)
	{

			//Create instance of Scanner object
			Scanner keyboard = new Scanner(System.in);

			double price;
			double VAT;
			double finalPrice;


			System.out.print("Enter Price of Product: ");
			price = keyboard.nextDouble();

			//Calculate the VAT
			VAT = price * 0.23;
			finalPrice = price + VAT;

			System.out.println("_____________________________");
			System.out.println("Price of product is " + price);
			System.out.println("VAT at 23% is: " + VAT);
			System.out.println("\n\n");
			System.out.println("TOTAL COST: " + (finalPrice));

		}
}

