import java.util.Scanner;

public class Greetings4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your favorite integer: ");

        while(!keyboard.hasNextInt())
        {
            keyboard.nextLine();
            System.out.println("Try entering an integer, wise guy...");
        }
        int n = keyboard.nextInt();
        System.out.println("You entered " + n);
        System.out.println("2 * " + n + " = " + (n * 2));

        if (n % 2 != 0)
        {
            System.out.println("You're really odd...");
        }
        else
        {
            System.out.println("I guess that's ok...");
        }
    }
}