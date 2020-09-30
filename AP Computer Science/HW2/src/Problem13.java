// Matthew Raimondi, 30 September 2020, Chapter 2 Problem 13

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        System.out.print("Please enter a number: ");
        try {
            n = input.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: " + e + "\nPlease input an integer value");
            System.exit(1);
        }

        int a = 2 * n;

        System.out.println("2 * " + n + " = " + a);

        input.close();
    }
}
