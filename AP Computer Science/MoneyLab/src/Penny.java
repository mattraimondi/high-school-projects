public class Penny extends Coin {
    private final static double SELF_WORTH = 0.01;

    public double getAmount() {
        return SELF_WORTH;
    }

    public String toString() {
        return "penny";
    }
}
