public class Nickel extends Coin {
    private final static double SELF_WORTH = 0.05;

    public double getAmount() {
        return SELF_WORTH;
    }

    public String toString() {
        return "nickel";
    }
}
