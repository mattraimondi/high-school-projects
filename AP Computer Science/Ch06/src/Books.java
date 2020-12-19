import java.util.Scanner;

public class Books {
    public static double getOrderTotal(int bp, int nb) {
        double bpp = 20.95;
        double nbp = 21.95;
        int totalBooks = bp + nb;

        if (totalBooks >= 12) {
            return 16.00 * totalBooks;
        } else if (totalBooks >= 3) {
            return 16.95 * totalBooks;
        } else if (bp == 1 && nb == 1){
            return 39.95;
        } else {
            return bp * bpp + nb * nbp;
        }
    }

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter # of Be Prepared: ");

        while(!input1.hasNextInt()) {
            input1.nextLine();
            System.out.println("Not an integer...");
        }

        int n1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter # of Next Best: ");

        while(!input2.hasNextInt()) {
            input2.nextLine();
            System.out.println("Not an integer...");
        }

        int n2 = input2.nextInt();

        System.out.println(getOrderTotal(n1, n2));
    }

}
