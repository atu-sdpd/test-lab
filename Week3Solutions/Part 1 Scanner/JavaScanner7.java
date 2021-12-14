import java.util.Scanner;

//import java.util.Scanner;

public class JavaScanner7 {
    public static void main(String[] args)
    {

            //Create instance of Scanner object
            Scanner keyboard = new Scanner(System.in);

            double num1;
            double num2;
            System.out.println();

            System.out.print("Enter first number: ");
            num1 = keyboard.nextDouble();

            System.out.print("Enter second number: ");
            num2 = keyboard.nextDouble();

            /*
            System.out.println("_____________________________");
            System.out.println("Number 1 + number 2 is: " + (num1 + num2));
            System.out.println("Number 1 - number 2 is: " + (num1 - num2));
            System.out.println("Number 1 / number 2 is: " + (num1 / num2));
            System.out.println("Number 1 * number 2 is: " + (num1 * num2));
            System.out.println("_____________________________");
            */

            System.out.println("_____________________________");
            System.out.println(num1 + " + " + num2 + " is: " + (num1 + num2));
            System.out.println(num1 + " - " + num2 + " is: " + (num1 - num2));
            System.out.println(num1 + " / " + num2 + " is: " + (num1 / num2));
            System.out.println(num1 + " * " + num2 + " is: " + (num1 * num2));
            System.out.println("_____________________________");

        }
}

