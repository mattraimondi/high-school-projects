import java.util.Random;

public class Die extends Random {
    public Die() {

    }

    public int roll() {
        return nextInt(6);
    }

    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();

        int num1 = die1.roll();
        int num2 = die2.roll();
        int sum = num1 + num2;

        System.out.println(sum);
    }
}
