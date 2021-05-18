public class Bill implements Money {
    public static int[] LEGAL_DENOMINATIONS = {1, 2, 5, 10, 20, 50, 100};

    private final double denom;

    public Bill(int denom) {
        this.denom = denom;
    }

    public double getAmount() {
        return denom;
    }
}
