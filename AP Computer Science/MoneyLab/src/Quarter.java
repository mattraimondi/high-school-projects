public class Quarter extends Coin {
    private final static double SELF_WORTH = 0.25;

    public double getAmount() {
        return SELF_WORTH;
    }

    public String toString() {
        return "quarter";
    }
}
