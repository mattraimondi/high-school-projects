// Matthew Raimondi, 30 September 2020, Chapter 2 Problem 11

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your favorite color? \n Please type the color here: ");
        String color = input.nextLine();

        color = color.substring(0, 1).toUpperCase() + color.substring(1); // This ensures that the first letter is capital

        System.out.println(color + " is a horrible color!");
        System.out.println("Just kidding, all colors are equally pleasing to a computer!");

        input.close();
    }
}
