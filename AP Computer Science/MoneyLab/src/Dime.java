public class Dime extends Coin {
    private final static double SELF_WORTH = 0.10;

    public double getAmount() {
        return SELF_WORTH;
    }

    public String toString() {
        return "dime";
    }
}
