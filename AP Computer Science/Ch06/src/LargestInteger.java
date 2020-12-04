import java.util.Scanner;

public class LargestInteger {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter your favorite integer: ");

        while(!input1.hasNextInt()) {
            input1.nextLine();
            System.out.println("Try entering an integer, wise guy...");
        }

        int n1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your favorite integer: ");

        while(!input2.hasNextInt()) {
            input2.nextLine();
            System.out.println("Try entering an integer, wise guy...");
        }

        int n2 = input2.nextInt();

        //not finished...
    }
}
