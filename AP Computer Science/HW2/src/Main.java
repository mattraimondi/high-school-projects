import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an noun: ");
        String noun = input.nextLine();

        System.out.print("Please enter an adjective: ");
        String adjective = input.nextLine();

        System.out.println("Definitely, I think that " + noun + " is very " + adjective + " as well!");

    }
}