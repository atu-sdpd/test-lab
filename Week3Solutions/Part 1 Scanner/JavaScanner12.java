import java.util.Scanner;

public class JavaScanner12 {
	public static void main(String[] args){

			//Create instance of Scanner object
			Scanner keyboard = new Scanner(System.in);

			String country;
			int population;
			int squareKm;

			System.out.println("Popluation density calculator");
			System.out.println("-----------------------------");
			System.out.print("Enter country name: ");
			country = keyboard.nextLine();
			System.out.print("Enter country population: ");
			population = keyboard.nextInt();
			System.out.print("Enter country area in square KM: ");
			squareKm = keyboard.nextInt();
			System.out.println("-----------------------------");
			System.out.print(country + " has " + (population/squareKm) + " people per square kilometer.\n\n");

		}
}

