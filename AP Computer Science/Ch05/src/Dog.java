import java.util.Scanner;

public class Dog {
    public static int convertToHumanAge(int dogYears) {
        if (dogYears == 1) {
            return 13;
        } else if (dogYears > 1) {
            return (int) (((16) * (dogYears/3.0)) + 0.5);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Number of dog years: ");
        Scanner input = new Scanner(System.in);
        int years = input.nextInt();
        int output = convertToHumanAge(years);
        System.out.println(output);
        input.close();
    }
}
